package com.wb.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.wb.io.Entrada;

public class Cliente {
	public String nome;
	public String nomeSocial;
	public String genero;
	private Entrada entrada;
	private CPF cpf;
	private List<RG> rgs;
	private LocalDate dataCadastro;
	private List<Telefone> telefones;
	private List<Produto> produtosConsumidos;
	private List<Servico> servicosConsumidos;

	public Cliente(String nome, String nomeSocial, String genero, CPF cpf) {
		this.entrada = new Entrada();
		this.nome = nome;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.cpf = cpf;
		this.rgs = new ArrayList<RG>();
		this.telefones = new ArrayList<Telefone>(); 
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<Telefone>();
		this.produtosConsumidos = new ArrayList<Produto>();
		this.servicosConsumidos = new ArrayList<Servico>();
	}

	public CPF getCpf() {
		return cpf;
	}

	public List<RG> getRgs() {
		return rgs;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public List<Produto> getProdutosConsumidos() {
		return produtosConsumidos;
	}

	public List<Servico> getServicosConsumidos() {
		return servicosConsumidos;
	}
	public String getGenero() {
		return genero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNomesocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}
	public void setRgs(List<RG> rgs) {
		this.rgs = rgs;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public void setProdutosConsumidos(List<Produto> produtosConsumidos) {
		this.produtosConsumidos = produtosConsumidos;
	}
	public void setServicosConsumidos(List<Servico> servicosConsumidos) {
		this.servicosConsumidos = servicosConsumidos;
	}
	
	public void cadastrarRG(){
		System.out.println("Deseja cadastrar novo RG? (s/n)");
		String resposta = entrada.receberTexto();
		switch(resposta) {
		case "s":
			System.out.println("Por favor informe o numero do RG: ");
			String valorRg = entrada.receberTexto();
			System.out.println("Por favor informe a data de emissao do RG, no padrao dd/mm/yyyy: ");
			String dataRg = entrada.receberTexto();
			
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dataEmissaoRg = LocalDate.parse(dataRg, formato);
			RG rgs = new RG(dataEmissaoRg, valorRg);
			getRgs().add(rgs);
			cadastrarRG();
		case "n":
			break;
		default:
			System.out.println("Resposta invalida! Digite s ou n. ");
			cadastrarRG();
		}
	}
	public void cadastrarTel(){
		System.out.println("Deseja cadastrar novo Telefone? (s/n)");
		String resposta = entrada.receberTexto();
		switch(resposta) {
		case "s":
			System.out.println("Informe o numero do DDD: ");
			String ddd = entrada.receberTexto();
			System.out.println("Informe o numero do telefone: ");
			String numero = entrada.receberTexto();
			Telefone tel = new Telefone(ddd, numero);
			getTelefones().add(tel);
			cadastrarTel();
		case "n":
			break;
		default:
			System.out.println("Resposta invalida! Digite s ou n. ");
			cadastrarTel();
		}
	}
	
	
}