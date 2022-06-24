package com.wb.negocio;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;

import cadastros.Cadastro;
import cadastros.CadastroCliente;
import cadastros.CadastroProduto;
import cadastros.CadastroServico;

public class Cadastros extends Execucao{
	private Empresa empresa;
	
	public Cadastros(Empresa empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void executar() {
		
		boolean op = true;
		
		while ( op ) {
			System.out.println("\nEscolha o cadastro que deseja realizar:");
			System.out.println("1 - Cadastro de Clientes");
			System.out.println("2 - Cadastro de Produtos");
			System.out.println("3 - Cadastro de Serviços");
			System.out.println("0 - Voltar");

			Entrada entradaCad = new Entrada();
			int cadastros = entradaCad.receberNumeroInteiro();
			
			switch (cadastros) {
			case 0:
				System.out.println("Retornando para o menu inicial.");
				op = false;
				break;
			case 1:
				Cadastro cadastroCli = new CadastroCliente(empresa.getClientes());
				cadastroCli.cadastrar();
				break;
			case 2:
				Cadastro cadastroProd = new CadastroProduto(empresa.getProdutos());
				cadastroProd.cadastrar();
				break;
			case 3:
				Cadastro cadastroServ = new CadastroServico(empresa.getServicos());
				cadastroServ.cadastrar();
				break;
			default:
				System.out.println("\nErro na operação");
			}
		}
	}

}
