package com.wb;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;
import com.wb.negocio.DeletarCliente;
import com.wb.negocio.Delete;
import com.wb.negocio.Editar;
import com.wb.negocio.EditarCliente;
import com.wb.negocio.ListagemDez;
import com.wb.negocio.ListagemDezClientes;

import cadastros.Cadastro;
import cadastros.CadastroCliente;
import listagem.Listagem;
import listagem.ListarTodosClientes;


public class App {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes do Grupo World Beauty");
		Empresa empresa = new Empresa();
		boolean execucao = true;
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
				Cadastro cadastro = new CadastroCliente(empresa.getClientes());
				cadastro.cadastrar();
				break;
			case 2:
				Delete delecao = new DeletarCliente(empresa.getClientes());
				delecao.deletar();
				break;
			case 3:
				Editar editar = new EditarCliente(empresa.getClientes());
				editar.update();
				break;
			case 4:
				Listagem listagem = new ListarTodosClientes(empresa.getClientes());
				listagem.listar();
				break;
			case 5:
				ListagemDez listagemDez = new ListagemDezClientes(empresa.getClientes());
				listagemDez.listarDez();
				break;
			default:
				System.out.println("Operação não entendida");
			}
		}
	}
}