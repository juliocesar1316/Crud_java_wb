package com.wb;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;

import com.wb.negocio.Cadastros;
import com.wb.negocio.DeletarCadastros;
import com.wb.negocio.EditarCadastros;
import com.wb.negocio.Execucao;
import com.wb.negocio.Listas;
import com.wb.negocio.ProdutosServicos;


public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
		Dados Cadastros = new Dados(empresa.getClientes(), empresa.getProdutos(), empresa.getServicos(), empresa);
		Cadastros.cadastrar();
		while (execucao) {
			System.out.println("Que tipo de operação você deseja fazer:");
			System.out.println("1 - Cadastros");
			System.out.println("2 - Editar Cadastros");
			System.out.println("3 - Excluir Cadastros");
			System.out.println("4 - Listagens");
			System.out.println("5 - Carrinho");
			System.out.println("0 - Sair");

			Entrada entrada = new Entrada();
			int operacao = entrada.receberNumeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais!\n");
				break;
			case 1:
				Execucao Cadastrar = new Cadastros(empresa);
				Cadastrar.executar();
			break;
			case 2:
				Execucao Editar = new EditarCadastros(empresa);
				Editar.executar();
			break;
			case 3:
				Execucao Deletar = new DeletarCadastros(empresa);
				Deletar.executar();
			break;
			case 4:
				Execucao Listar = new Listas(empresa);
				Listar.executar();
			break;
			case 5:
				Execucao Carrinho = new ProdutosServicos(empresa);
				Carrinho.executar();
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}