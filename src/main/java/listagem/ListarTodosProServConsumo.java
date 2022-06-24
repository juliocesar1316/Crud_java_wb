package listagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;
import com.wb.modelo.Servico;


public class ListarTodosProServConsumo extends Listagem {
	private List<Cliente> clientes;
	private List<Produto> prods;
	private List<Servico> servs;
	
	public ListarTodosProServConsumo(List<Cliente> clientes, List<Produto> prods, List<Servico> servs) {
		this.clientes = clientes;
		this.prods = prods;
		this.servs = servs;
	}
	
	
	@Override
	public void listar() {
		System.out.println("\nLista de todos os produtos/serviços mais consumidos:\n");
		
		List<Produto> vendas = new ArrayList<Produto>();
		for (Produto produtos : prods) {
			produtos.somaDosProdutos(clientes);
			vendas.add(produtos);
		}
		Comparator<Produto> cp = new MaiorConsumoProduto();
		Collections.sort(vendas, cp.reversed());
		for (Produto produtos : vendas) {
			System.out.println("Produto: " + produtos.nome);
			System.out.println("Quantidade: " + produtos.quantidade);
			System.out.println("\n");
		}
		System.out.println("------------------------------------------");
		
		List<Servico> vendasServico = new ArrayList<Servico>();
		for (Servico servicos : servs) {
			servicos.somaDosServicos(clientes);
			vendasServico.add(servicos);
		}
		Comparator<Servico> cs = new MaiorConsumoServico();
		Collections.sort(vendasServico, cs.reversed());
		for (Servico servicos : vendasServico) {
			System.out.println("Serviço: " + servicos.nome);
			System.out.println("Quantidade: " + servicos.quantidade);
			System.out.println("\n");
		}
		System.out.println("------------------------------------------");
	}
}
