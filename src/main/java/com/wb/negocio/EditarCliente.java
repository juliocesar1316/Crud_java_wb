package com.wb.negocio;

import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class EditarCliente extends Editar {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private Entrada entrada;
    
	public EditarCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	} 

	@Override
	public void update() {
		System.out.println("Edição do cadastro do cliente");
		System.out.println("informe o CPF do cliente:");
		String valorCpf = entrada.receberTexto();
		
		if ((clientes).contains(valorCpf)) {
			System.out.println("Cliente " + clientes);
			
			System.out.println("Por favor informe o nome do cliente:");
			String nome = entrada.receberTexto();
			
			
			System.out.println("Por favor informe o nome social do cliente:");
			((Cliente) clientes).setNomesocial(entrada.receberTexto());
		}else {
            System.out.println("Cliente inexistente.");
        }	
	}
}
