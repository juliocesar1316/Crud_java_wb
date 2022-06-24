package listagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;
import com.wb.modelo.Servico;

public class ListarProdServGenero extends Listagem {
	private List<Cliente> clientes;
	private List<Servico> servs;
	private List<Produto> prods;
	int i = 0;
	
	public ListarProdServGenero(List<Cliente> clientes, List<Produto> prods, List<Servico> servs) {
		this.clientes = clientes;
		this.prods = prods;
		this.servs = servs;
	}
	
	@Override
	public void listar() {		
		System.out.println("\nLista dos produtos/serviços mais consumidos por gênero. \n");
		System.out.println("\nQual gênero voce deseja listar (m ou f):");
		Entrada entrada = new Entrada();
		String clienteGenero = entrada.receberTexto();
		
		
		switch(clienteGenero) {
		
		case "m":
			System.out.println("Listagem de clientes Masculinos\n");
			System.out.println("Lista Produtos\n");
			
			for (Cliente cliente : clientes) {
				if(cliente.getGenero().equals("m")) {
					List<Produto> vendas = new ArrayList<Produto>();
					for (Produto produtos : prods) {
						produtos.somaDosProdutos(clientes);
						vendas.add(produtos);
					}
					Comparator<Produto> cp = new MaiorConsumoProduto();
					Collections.sort(vendas, cp.reversed());
					for (Produto produtos : vendas) {
						System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
						System.out.println("Produto: " + produtos.nome);
						System.out.println("Quantidade: " + produtos.quantidade);
						System.out.println("\n");
					}
					System.out.println("------------------------------------------");
				}
			}
			System.out.println("Lista Serviços\n");
			for (Cliente cliente : clientes) {
				if(cliente.getGenero().equals("m")) {
					List<Servico> vendasServico = new ArrayList<Servico>();
					for (Servico servicos : servs) {
						servicos.somaDosServicos(clientes);
						vendasServico.add(servicos);
					}
					Comparator<Servico> cs = new MaiorConsumoServico();
					Collections.sort(vendasServico, cs.reversed());
					for (Servico servicos : vendasServico) {
						System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
						System.out.println("Serviço: " + servicos.nome);
						System.out.println("Quantidade: " + servicos.quantidade);
						System.out.println("\n");
					}
					System.out.println("------------------------------------------");
				}
			}
		break;
		
		case "f":
			System.out.println("Listagem de clientes Feminino\n");
			System.out.println("Lista Produtos\n");
			for (Cliente cliente : clientes) {
				if(cliente.getGenero().equals("f")) {
					List<Produto> vendas = new ArrayList<Produto>();
					for (Produto produtos : prods) {
						produtos.somaDosProdutos(clientes);
						vendas.add(produtos);
					}
					Comparator<Produto> cp = new MaiorConsumoProduto();
					Collections.sort(vendas, cp.reversed());
					for (Produto produtos : vendas) {
						System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
						System.out.println("Produto: " + produtos.nome);
						System.out.println("Quantidade: " + produtos.quantidade);
						System.out.println("\n");
					}
					System.out.println("------------------------------------------");
				}
			}
			System.out.println("Lista Serviços\n");
			for (Cliente cliente : clientes) {
				if(cliente.getGenero().equals("f")) {
					List<Servico> vendasServico = new ArrayList<Servico>();
					for (Servico servicos : servs) {
						servicos.somaDosServicos(clientes);
						vendasServico.add(servicos);
					}
					Comparator<Servico> cs = new MaiorConsumoServico();
					Collections.sort(vendasServico, cs.reversed());
					for (Servico servicos : vendasServico) {
						System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
						System.out.println("Serviço: " + servicos.nome);
						System.out.println("Quantidade: " + servicos.quantidade);
						System.out.println("\n");
					}
					System.out.println("------------------------------------------");
				}
			}
		break;
		}
	}
}
