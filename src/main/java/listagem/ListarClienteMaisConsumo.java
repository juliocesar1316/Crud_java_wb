package listagem;

import java.util.Collections;
import java.util.List;

import com.wb.modelo.Cliente;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;

public class ListarClienteMaisConsumo extends Listagem {
	private List<Cliente> clientes;

	public ListarClienteMaisConsumo(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	@Override
	public void listar() {
		System.out.println("\nLista dos 10 clientes que mais consumiram: \n");
		System.out.println("Lista Produtos\n");
		Collections.sort(clientes, Cliente.maiorProduto);
		int cont =  0;
		for(Cliente cliente: clientes) {
			if(cont >= 10) {
				break;
			}else {
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
				for(Telefone telefone: cliente.getTelefones()) {
					System.out.println("Telefone: (" + telefone.getDdd() + ") " + telefone.getNumero());
				}
				System.out.println("CPF: " + cliente.getCpf().getValor());
				for(RG rg: cliente.getRgs()) {
					System.out.println("RG: " + rg.getValor());
				}	
					
				System.out.println("Quantidade Produto: " + cliente.getProdutosConsumidos().size());
				System.out.println("\n");
				cont+=1;
			}
		}
		
		System.out.println("Lista Serviços");
		Collections.sort(clientes, Cliente.maiorServico);
		int contt =  0;
		for(Cliente cliente: clientes) {
			if(contt >= 10) {
				break;
			}else {
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println((cliente.genero.equals("m")) ?  "Gênero: Masculino" : "Gênero: Feminino");
				for(Telefone telefone: cliente.getTelefones()) {
					System.out.println("Telefone: (" + telefone.getDdd() + ") " + telefone.getNumero());
				}
				System.out.println("CPF: " + cliente.getCpf().getValor());
				for(RG rg: cliente.getRgs()) {
					System.out.println("RG: " + rg.getValor());
				}	
					
				System.out.println("Quantidade Servico: " + cliente.getProdutosConsumidos().size());
				System.out.println("\n");
				contt+=1;
			}
		}
	}
}
