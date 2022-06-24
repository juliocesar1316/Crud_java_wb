package com.wb.modelo;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes;
	private List<Produto> produtos;
	private List<Servico> servicos;
	public Empresa() {
		this.clientes = new ArrayList<Cliente>();
		this.produtos = new ArrayList<Produto>();
		this.servicos = new ArrayList<Servico>();
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public void setProduto(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public void setServico(List<Servico> servicos) {
		this.servicos = servicos;
	}
}