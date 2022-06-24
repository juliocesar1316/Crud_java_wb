package com.wb.modelo;

import java.util.List;

public class Produto {
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public int quantidade;
	public String nome;
	public double preco;

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
	
	
	public int somaDosProdutos(List<Cliente> c) {
		int cont = 0;
		for (Cliente cliente : c) {
			for (Produto p : cliente.getProdutosConsumidos()) {
				if(p.nome == getNome()) {
					cont = cont + 1;
				}
			}
		}
		setQuantidade(cont);
		return cont;
	}
	
}