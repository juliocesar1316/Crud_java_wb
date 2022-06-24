package com.wb.modelo;

import java.util.List;

public class Servico {
	public Servico(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public double preco;
	public String nome;
	public int quantidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int somaDosServicos(List<Cliente> c) {
		int cont = 0;
		for (Cliente cliente : c) {
			for (Servico p : cliente.getServicosConsumidos()) {
				if(p.nome == getNome()) {
					cont = cont + 1;
				}
			}
		}
		setQuantidade(cont);
		return cont;
	}
}
