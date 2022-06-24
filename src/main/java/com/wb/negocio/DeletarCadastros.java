package com.wb.negocio;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;

import listagem.Listagem;
import listagem.ListarTodosClientes;
import listagem.ListarTodosProdutosConsumo;
import listagem.ListarTodosServicos;

public class DeletarCadastros extends Execucao{
	private Empresa empresa;
	
	public DeletarCadastros(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public void executar() {
		
		boolean delete = true;
		
		while ( delete ) {
			System.out.println("\nQual cadastro voc� deseja deletar");
			System.out.println("1 - Clientes");
			System.out.println("2 - Produtos");
			System.out.println("3 - Servi�os");
			System.out.println("0 - Voltar");
			
			Entrada entrada = new Entrada();
			int deletar = entrada.receberNumeroInteiro();
			
			switch (deletar) {
			case 1:
				Listagem listagemCliente = new ListarTodosClientes(empresa.getClientes());
				listagemCliente.listar();				
				
				int numCliente = 0;
				while (true) {
					System.out.println("Digite o n�mero do cliente que voc� deseja deletar:");
					numCliente = entrada.receberNumeroInteiro();
					if (numCliente >= 0 && numCliente < empresa.getClientes().size()) {
						break;
					}
					System.out.println("N�mero de cliente inv�lido! Verifique se o n�mero inserido est� correto.");
				}
				
				this.empresa.getClientes().remove(numCliente);
				System.out.println("Cliente exclu�do com sucesso!");
				break;
			
			case 2:
				Listagem listagemProdutos = new ListarTodosProdutosConsumo(empresa.getProdutos());
				listagemProdutos.listar();
				
				int numProd = 0;
				while (true) {
					System.out.println("Digite o n�mero do produto que voc� deseja deletar:");
					numProd = entrada.receberNumeroInteiro();
					if (numProd >= 0 && numProd < empresa.getProdutos().size()) {
						break;
					}
					System.out.println("N�mero de produto inv�lido! Verifique se o n�mero inserido est� correto.");
				}
				this.empresa.getProdutos().remove(numProd);
				System.out.println("Produto exclu�do com sucesso!");
				break;
				
			case 3:
				Listagem listagemServico = new ListarTodosServicos(empresa.getServicos());
				listagemServico.listar();
				
				int numServ = 0;
				while (true) {
					System.out.println("Digite o n�mero do servi�o que voc� deseja deletar:");
					numServ = entrada.receberNumeroInteiro();
					if (numServ >= 0 && numServ < empresa.getServicos().size()) {
						break;
					}
					System.out.println("N�mero de servi�o inv�lido! Verifique se o n�mero inserido est� correto.");
				}
				this.empresa.getServicos().remove(numServ);
				System.out.println("Servi�o exclu�do com sucesso!");	
				break;
			
			case 0:
				System.out.println("Retornando para o menu inicial!");
				delete = false;
				break;
			}
		}
	}
	
}
