package com.wb.negocio;

import java.util.List;

import com.wb.io.Entrada;
import com.wb.modelo.Cliente;

public class DeletarCliente extends Delete{
	private List<Cliente> clientes;
	private Entrada entrada;
	
	public DeletarCliente(List<Cliente> clientes) {
		this.clientes = clientes;
		this.entrada = new Entrada();
	}
	
	@Override
	public void deletar() {
		System.out.println("Digite o código do cliente que será deletado: ");
		int cod = entrada.receberNumeroInteiro();
		clientes.remove(cod);
		System.out.println("Registro deletado com sucesso! ");
		System.out.println("_________________________________");
	}

}
