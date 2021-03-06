package listagem;

import java.util.List;

import com.wb.modelo.Produto;

public class ListaTodosProdutos extends Listagem{

	private List<Produto> produtos;
	int i=0;

	public ListaTodosProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public void listar() {
		System.out.println("\nLista de todos os produtos:");
		for (Produto produto : produtos) {
			System.out.println("Produto " + i);
			System.out.println("Nome do produto: " + produto.nome);
			System.out.println("Valor: "+ produto.preco);
			System.out.println("--------------------------------------");
			i+=1;
		}
	}
}
