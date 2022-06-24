package listagem;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;
import com.wb.modelo.RG;
import com.wb.modelo.Telefone;

public class ListarClienteGenero extends Listagem {
	private List<Cliente> clientes;
	int i = 0;
	
	public ListarClienteGenero(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	@Override
	public void listar() {		
		System.out.println("\nQual gênero voce deseja listar (m ou f):");
		Entrada entrada = new Entrada();
		String clienteGenero = entrada.receberTexto();
		
		System.out.println((clienteGenero.equals("m")) ?  "Listagem de clientes Masculinos\n" : "Listagem de clientes Femininos\n");
		
		for (Cliente cliente : clientes) {
			if (cliente.getGenero().equals("f")){
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome social: " + cliente.nomeSocial);
				System.out.println("Gênero: Feminino");
				for(Telefone telefone: cliente.getTelefones()) {
					System.out.println("Telefone: (" + telefone.getDdd() + ") " + telefone.getNumero());
				}
				System.out.println("CPF: " + cliente.getCpf().getValor());
				for(RG rg: cliente.getRgs()) {
					System.out.println("RG: " + rg.getValor());
				}
				System.out.println("--------------------------------------");
			}
			else if(cliente.getGenero().equals("m")) {
					System.out.println("Nome: " + cliente.nome);
					System.out.println("Nome social: " + cliente.nomeSocial);
					System.out.println("Gênero: Masculino");
					for(Telefone telefone: cliente.getTelefones()) {
						System.out.println("Telefone: (" + telefone.getDdd() + ") " + telefone.getNumero());
					}
					System.out.println("CPF: " + cliente.getCpf().getValor());
					for(RG rg: cliente.getRgs()) {
						System.out.println("RG: " + rg.getValor());
					}
					System.out.println("--------------------------------------");
			}
			else {
				System.out.println("Erro");
				break;
			}
		}
	}
}