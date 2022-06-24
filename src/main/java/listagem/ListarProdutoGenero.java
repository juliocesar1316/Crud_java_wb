package listagem;

import java.util.Collections;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.Produto;

public class ListarProdutoGenero extends Listagem {
	private List<Cliente> clientes;
	int i = 0;
	
	public ListarProdutoGenero(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@Override
	public void listar() {		
		System.out.println("\nQual gênero voce deseja listar (m ou f):");
		Entrada entrada = new Entrada();
		String clienteGenero = entrada.receberTexto();
		
		System.out.println((clienteGenero.equals("m")) ?  "Listagem de clientes Masculinos\n" : "Listagem de clientes Femininos\n");
		
		Collections.sort(clientes, Cliente.maior);
		for (Cliente cliente : clientes) {
			if (cliente.getGenero().equals(clienteGenero)){
				int cont = 0;
				for(Produto produtosConsumidos: cliente.getProdutosConsumidos()) {
					System.out.println("Produto: " + produtosConsumidos.nome);
					System.out.println("Preço: " + produtosConsumidos.preco);
					cont+=1;
				}
				System.out.println("Quantidade: " + cont);
				System.out.println("\n");
			}else {
				System.out.println("Erro");
				break;
			}
			
		}
	}
}
