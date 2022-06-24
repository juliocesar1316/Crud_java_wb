package com.wb.negocio;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;

import listagem.Listagem;
import listagem.ListarClienteGenero;
import listagem.ListarClienteMaisConsumo;
import listagem.ListarClienteMaisValor;
import listagem.ListarClienteMenosConsumo;
import listagem.ListarProdServGenero;
import listagem.ListarTodosClientes;
import listagem.ListarTodosProServConsumo;

public class Listas extends Execucao {
	private Empresa empresa;
	
	public Listas(Empresa empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void executar() {
		
		boolean  op = true;
		
		while ( op ) {
			System.out.println("\nQue tipo de listagem você deseja realizar:");
			System.out.println("1 - Todos os clientes");
			System.out.println("2 - Os 10 clientes que mais consumiram produtos/serviços em quantidade");
			System.out.println("3 - Todos os clientes por gênero");
			System.out.println("4 - Todos os produtos/servico mais consumidos");
			System.out.println("5 - Todos os produtos/servico mais Consumidos por genero");
			System.out.println("6 - Os 10 clientes que menos consumiram produtos/servicos");
			System.out.println("7 - Os 5 clientes mais consumiram produtos/servico por valor");
			System.out.println("0 - Voltar");
		
			Entrada entradaList = new Entrada();
			int listagens = entradaList.receberNumeroInteiro();
		
			switch ( listagens ) {
			case 0:
				System.out.println("Voltando para o menu inicial.");
				op = false;
				break;
			case 1:
				Listagem listagemCli = new ListarTodosClientes(empresa.getClientes());
				listagemCli.listar();
				break;
		
			case 2:
				Listagem listagemProd = new ListarClienteMaisConsumo(empresa.getClientes());
				listagemProd.listar();
				break;
		
			case 3:
				Listagem listagemClienteGen = new ListarClienteGenero(empresa.getClientes());
				listagemClienteGen.listar();
				break;
			case 4:
				Listagem listagemMaiorConsumo = new ListarTodosProServConsumo(empresa.getClientes(), empresa.getProdutos(), empresa.getServicos());
				listagemMaiorConsumo.listar();
				break;
			case 5:
				Listagem listagemConsumoGenero = new ListarProdServGenero(empresa.getClientes(), empresa.getProdutos(), empresa.getServicos());
				listagemConsumoGenero.listar();
				break;
			case 6:
				Listagem listagemMenorConsumo = new ListarClienteMenosConsumo(empresa.getClientes());
				listagemMenorConsumo.listar();
				break;
			case 7:
				Listagem listagemMaiorValor = new ListarClienteMaisValor(empresa.getClientes());
				listagemMaiorValor.listar();
				break;
			default:
				System.out.println("\nOperação não entendida");
			}
		}
	}
}
