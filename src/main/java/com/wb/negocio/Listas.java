package com.wb.negocio;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;

import listagem.Listagem;
import listagem.ListarClienteGenero;
import listagem.ListarClienteMaisConsumo;
import listagem.ListarProdutoGenero;
import listagem.ListarTodosClientes;
import listagem.ListarTodosProdutosConsumo;
import listagem.ListarTodosServicos;

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
			System.out.println("1 - Listar todos os clientes");
			System.out.println("2 - Listar os 10 clientes que mais consumiram produtos/serviços em quantidade");
			System.out.println("3 - Listar todos os clientes por gênero");
			
			System.out.println("4 - Listar todos os produtos/servico mais consumidos");
			System.out.println("5 - Listar todos os produtos/servico mais Consumidos por genero");
			System.out.println("6 - Listar os 10 clientes que menos consumiram produtos/servicos");
			System.out.println("7 - Listar os 5 clientes mais consumiram produtos/servico por valor");
			
			System.out.println("7 - Listar os 5 clientes mais consumiram produtos/servico por valor");
			System.out.println("8 - Listar os 5 clientes mais consumiram produtos/servico por valor");
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
				Listagem listagemMaiorConsumo = new ListarTodosProdutosConsumo(empresa.getClientes());
				listagemMaiorConsumo.listar();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				
				break;
			case 8:
				Listagem listagemServ = new ListarTodosServicos(empresa.getServicos());
				listagemServ.listar();
				break;
			default:
				System.out.println("\nOperação não entendida");
			}
		}
	}
}
