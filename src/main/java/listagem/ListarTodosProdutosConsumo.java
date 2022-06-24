package listagem;

import java.util.Collections;
import java.util.List;

import com.wb.modelo.Cliente;


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
			System.out.println("Produto" + cliente.getProdutosConsumidos() );
			System.out.println("Quantidade Produto: " + cliente.getProdutosConsumidos().size());
			
		}
	}
}
