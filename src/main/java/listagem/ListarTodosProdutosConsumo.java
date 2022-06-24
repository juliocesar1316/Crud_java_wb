package listagem;

import java.util.Collections;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;


public class ListarTodosProdutosConsumo extends Listagem {
	private List<Cliente> clientes;

	public ListarTodosProdutosConsumo(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	@Override
	public void listar() {
		System.out.println("\nLista de todos os produtos mais consumidos:");
		
		Collections.sort(clientes, Cliente.maior);
		for(Cliente cliente: clientes) {
			int cont = 0;
			for(Produto produtosConsumidos: cliente.getProdutosConsumidos()) {
				System.out.println("Produto: " + produtosConsumidos.nome);
				System.out.println("Preço: " + produtosConsumidos.preco);
				cont+=1;
			}
			System.out.println("Quantidade: " + cont);
			System.out.println("\n");
		}
	}
}
