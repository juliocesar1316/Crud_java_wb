package com.wb.negocio;

import com.wb.io.Entrada;
import com.wb.modelo.Empresa;

import listagem.Listagem;
import listagem.ListarTodosClientes;
import listagem.ListarTodosProdutosConsumo;
import listagem.ListarTodosServicos;

public class ProdutosServicos extends Execucao {
	private Empresa empresa;
	
	public ProdutosServicos(Empresa empresa) {
		this.empresa = empresa;
	}
	
	@Override
	public void executar() {
		
		boolean carrinho = true;
		
		while ( carrinho ) {
			
			Listagem listagemCli = new ListarTodosClientes(empresa.getClientes());
			listagemCli.listar();
			
			System.out.println("\nDigite o n�mero do cliente que voc� deseja adicionar algo no carrinho");
			Entrada entrada = new Entrada();
			int cli = entrada.receberNumeroInteiro();
			
			System.out.println("\nO que gostaria de adicionar: ");
			System.out.println("1 - Produtos");
			System.out.println("2 - Servi�os");
			System.out.println("0 - Voltar");
			int adicionar = entrada.receberNumeroInteiro();
			
			switch (adicionar) {
			case 1:
				String parar = "sim";
				while (parar.equals("sim")) {
					Listagem listagemProduto = new ListarTodosProdutosConsumo(empresa.getProdutos());
					listagemProduto.listar();
					int numProd = 0;
					while (true) {
						System.out.println("Digite o n�mero do produto que voc� deseja adicionar:");
						numProd = entrada.receberNumeroInteiro();
						if (numProd >= 0 && numProd < empresa.getProdutos().size()) {
							break;
						}
						System.out.println("N�mero de produto inv�lido! Verifique se o n�mero inserido est� correto.");
					}
					
					this.empresa.getClientes().get(cli).getProdutosConsumidos().add(empresa.getProdutos().get(numProd));
					System.out.println("Produto adicionado com sucesso!");
					System.out.println("\nDigite sim para adicionar outro produto e nao para continuar");
					parar = entrada.receberTexto();
				}
				break;
				
			case 2:
				String pare = "sim";
				while (pare.equals("sim")) {
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
					this.empresa.getClientes().get(numServ).getServicosConsumidos().add(empresa.getServicos().get(numServ));
					System.out.println("Servi�o adicionado com sucesso!");	
					System.out.println("\nDigite sim para adicionar outro servi�o e nao para continuar");
					pare = entrada.receberTexto();
				}
				break;
			
			case 0:
				System.out.println("Retornando para o menu inicial!");
				carrinho = false;
				break;
			}
		}
	}
	
}