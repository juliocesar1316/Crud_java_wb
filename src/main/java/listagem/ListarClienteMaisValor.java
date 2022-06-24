package listagem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wb.modelo.Cliente;

public class ListarClienteMaisValor extends Listagem{
private List<Cliente> clientes;
	
	public ListarClienteMaisValor(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@Override
	public void listar() {
		System.out.println("Listagem dos 5 clientes que mais consumiram (em valores)\n");
		
		System.out.println("Lista Produtos\n");
		Comparator<Cliente> clienteValor = new MaiorValorProduto();
		Collections.sort(clientes, clienteValor.reversed());
		int cont = 0;
		for(Cliente cliente: clientes) {
			if(cont >= 5) {
				break;
			}
			else {
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
				System.out.println("Valor Produto: R$ "+ cliente.valorConsumoProduto());
				System.out.println("\n");
				cont+=1;
			}
		}
		System.out.println("Lista Servicos\n");
		Comparator<Cliente> clienteValorServico = new MaiorValorServico();
		Collections.sort(clientes, clienteValorServico.reversed());
		int contt = 0;
		for(Cliente cliente: clientes) {
			if(contt >= 5) {
				break;
			}
			else {
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
				System.out.println("Valor Serviço: R$ "+ cliente.valorConsumoProduto());
				System.out.println("\n");
				contt+=1;
			}
		}
	}
}