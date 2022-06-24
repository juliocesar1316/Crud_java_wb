package com.wb;


import java.util.ArrayList;
import java.util.List;


import com.wb.modelo.CPF;
import com.wb.modelo.Cliente;
import com.wb.modelo.Empresa;
import com.wb.modelo.Produto;


import com.wb.modelo.Servico;

import cadastros.Cadastro;


public class Dados extends Cadastro{
	private Empresa empresa;
	
	public Dados(List<Cliente> clientes, List<Produto> produtos, List<Servico> servicos, Empresa empresa) {
		this.empresa = empresa;
	}
	@Override
	public  void cadastrar() {
		
		List<Produto> dadosProdutos = new ArrayList<Produto>();
		
		Produto p1 = new Produto("Xampu Sedosso", 10.5);
		Produto p2 = new Produto("Condicionador ", 12);
		Produto p3 = new Produto("Clear Men", 50);
		Produto p4 = new Produto("Lixa de unha", 80);
		Produto p5 = new Produto("Pente fino", 35);
		Produto p6 = new Produto("Pente Grosso", 70);
		Produto p7 = new Produto("Alicate", 70);
		Produto p8 = new Produto("Esmalte Vermelho", 30);
		Produto p9 = new Produto("Esmalte Azul", 25);
		Produto p10 = new Produto("Po Descolorante", 120);
		Produto p11 = new Produto("Spray fixador", 40);
		Produto p12 = new Produto("Shampoo FinoTrato", 80);
		Produto p13 = new Produto("Condicionador FinoTrato", 90);
		Produto p14 = new Produto("Lixa de Pe", 150);
		Produto p15 = new Produto("Oleo para Barba", 80);
		Produto p16 = new Produto("Oleo para Maos", 75);
		Produto p17 = new Produto("Lamina", 50);
		Produto p18 = new Produto("Navalha", 40);
		Produto p19 = new Produto("Creme Hjidrante tresemme", 47);
		Produto p20 = new Produto("Óleo para Cabelo", 30);
		dadosProdutos.add(p1); dadosProdutos.add(p2); dadosProdutos.add(p3); dadosProdutos.add(p4);
		dadosProdutos.add(p5); dadosProdutos.add(p6); dadosProdutos.add(p7); dadosProdutos.add(p8);
		dadosProdutos.add(p9); dadosProdutos.add(p10); dadosProdutos.add(p11); dadosProdutos.add(p12);
		dadosProdutos.add(p13); dadosProdutos.add(p14); dadosProdutos.add(p15); dadosProdutos.add(p16);
		dadosProdutos.add(p17); dadosProdutos.add(p18); dadosProdutos.add(p19); dadosProdutos.add(p20);
		empresa.setProduto(dadosProdutos); 
		
		List<Servico> dadosServico = new ArrayList<Servico>();
		
		Servico s1 = new Servico("Corte de Cabelo", 10.5);
		Servico s2 = new Servico("Corte de Unha", 12);
		Servico s3 = new Servico("limpeza de Pele", 50);
		Servico s4 = new Servico("Hidratação", 80);
		Servico s5 = new Servico("Massagem", 35);
		Servico s6 = new Servico("Manicure", 70);
		Servico s7 = new Servico("Pedicure", 70);
		Servico s8 = new Servico("Tratamento Capilar", 30);
		Servico s9 = new Servico("Reconstrucao", 25);
		Servico s10 = new Servico("Progressiva", 120);
		Servico s11 = new Servico("Apliques", 40);
		Servico s12 = new Servico("Depilacao", 80);
		Servico s13 = new Servico("Maquiagem", 90);
		Servico s14 = new Servico("Maquiagem completa", 150);
		Servico s15 = new Servico("Alongamento de unhas", 80);
		Servico s16 = new Servico("Cabelo + Barba", 75);
		Servico s17 = new Servico("Escova", 50);
		Servico s18 = new Servico("Estetica", 40);
		Servico s19 = new Servico("Modelagem", 47);
		Servico s20 = new Servico("Fotodepilação", 30);
		dadosServico.add(s1); dadosServico.add(s2); dadosServico.add(s3); dadosServico.add(s4);
		dadosServico.add(s5); dadosServico.add(s6); dadosServico.add(s7); dadosServico.add(s8);
		dadosServico.add(s9); dadosServico.add(s10); dadosServico.add(s11); dadosServico.add(s12);
		dadosServico.add(s13); dadosServico.add(s14); dadosServico.add(s15); dadosServico.add(s16);
		dadosServico.add(s17); dadosServico.add(s18); dadosServico.add(s19); dadosServico.add(s20);
		empresa.setServico(dadosServico); 
		
		List<Cliente> dadosClientes = new ArrayList<Cliente>();
		Cliente c1 = new Cliente("Zerosvaldo da Silva", "Zero", "m", new CPF(null, "11111111111"));
		c1.getProdutosConsumidos().add(p3);c1.getServicosConsumidos().add(s3);c1.getProdutosConsumidos().add(p1);c1.getServicosConsumidos().add(s1);
        Cliente c2 = new Cliente("Humberto dos Santos", "Cliente Um", "m", new CPF(null, "22222222222"));
		c2.getProdutosConsumidos().add(p12);c2.getProdutosConsumidos().add(p14);c2.getProdutosConsumidos().add(p13);c2.getProdutosConsumidos().add(p10);
        c2.getServicosConsumidos().add(s12);c2.getServicosConsumidos().add(s14);c2.getServicosConsumidos().add(s13);c2.getServicosConsumidos().add(s10);
		Cliente c3 = new Cliente("Doisilda Soares", "Cliente Dois", "f", new CPF(null, "12312312312"));
		c3.getProdutosConsumidos().add(p17);c3.getProdutosConsumidos().add(p16);c3.getProdutosConsumidos().add(p11);
        c3.getServicosConsumidos().add(s17);c3.getServicosConsumidos().add(s16);c3.getServicosConsumidos().add(s11);
		Cliente c4 = new Cliente("João Cortrês", "Cliente Três", "m", new CPF(null, "12312432312"));
		c4.getProdutosConsumidos().add(p15);c4.getProdutosConsumidos().add(p19);
        c4.getServicosConsumidos().add(s15);c4.getServicosConsumidos().add(s19);
		Cliente c5 = new Cliente("Torquatro de Oliveira", "Cliente Quatro", "m", new CPF(null, "12312444412"));
		c5.getProdutosConsumidos().add(p4);c5.getProdutosConsumidos().add(p5);c5.getProdutosConsumidos().add(p16);
        c5.getServicosConsumidos().add(s4);c5.getServicosConsumidos().add(s5);c5.getServicosConsumidos().add(s16);
		Cliente c6 = new Cliente("Suelen Cinqueira", "Cliente Cinco", "f", new CPF(null, "12555512312"));
		c6.getProdutosConsumidos().add(p12);c6.getProdutosConsumidos().add(p11);c6.getProdutosConsumidos().add(p18);c6.getProdutosConsumidos().add(p17);c6.getProdutosConsumidos().add(p20);
        c6.getServicosConsumidos().add(s12);c6.getServicosConsumidos().add(s11);c6.getServicosConsumidos().add(s18);c6.getServicosConsumidos().add(s17);c6.getServicosConsumidos().add(s20);
		Cliente c7 = new Cliente("ConSeisção Moura", "Cliente Seis", "f", new CPF(null, "12312666312"));
		c7.getProdutosConsumidos().add(p7);c7.getProdutosConsumidos().add(p8);c7.getProdutosConsumidos().add(p10);
        c7.getServicosConsumidos().add(s7);c7.getServicosConsumidos().add(s8);c7.getServicosConsumidos().add(s10);
		Cliente c8 = new Cliente("Setembrina Silva", "Cliente Sete", "f", new CPF(null, "17772312312"));
		c8.getProdutosConsumidos().add(p15);c8.getProdutosConsumidos().add(p19);c8.getProdutosConsumidos().add(p18);
        c8.getServicosConsumidos().add(s15);c8.getServicosConsumidos().add(s19);c8.getServicosConsumidos().add(s18);
		Cliente c9 = new Cliente("Oiton Bastos", "Cliente Oito", "m", new CPF(null, "12388812312"));
		c9.getProdutosConsumidos().add(p2);
        c9.getServicosConsumidos().add(s2);
		Cliente c10 = new Cliente("Courtney Nove", "Cliente Nove", "f", new CPF(null, "12319992312"));
		c10.getProdutosConsumidos().add(p10);c10.getProdutosConsumidos().add(p7);c10.getProdutosConsumidos().add(p15);c10.getProdutosConsumidos().add(p19);c10.getProdutosConsumidos().add(p6);c10.getProdutosConsumidos().add(p11);c10.getProdutosConsumidos().add(p4);
        c10.getServicosConsumidos().add(s10);c10.getServicosConsumidos().add(s7);c10.getServicosConsumidos().add(s15);c10.getServicosConsumidos().add(s19);c10.getServicosConsumidos().add(s6);c10.getServicosConsumidos().add(s11);c10.getServicosConsumidos().add(s4);
		Cliente c11 = new Cliente("Dézcio Amarante", "Cliente Dez", "m", new CPF(null, "12312101012"));
		c11.getProdutosConsumidos().add(p2);c11.getProdutosConsumidos().add(p13);
        c11.getServicosConsumidos().add(s2);c11.getServicosConsumidos().add(s13);
		Cliente c12 = new Cliente("Marionze Neves", "Cliente Onze", "f", new CPF(null, "12311111312"));
		c12.getProdutosConsumidos().add(p12);c12.getProdutosConsumidos().add(p20);c12.getProdutosConsumidos().add(p9);c12.getProdutosConsumidos().add(p19);c12.getProdutosConsumidos().add(p1);c12.getProdutosConsumidos().add(p8);
        c12.getServicosConsumidos().add(s12);c12.getServicosConsumidos().add(s20);c12.getServicosConsumidos().add(s9);c12.getServicosConsumidos().add(s19);c12.getServicosConsumidos().add(s1);c12.getServicosConsumidos().add(s8);
		Cliente c13 = new Cliente("Dozelina Félix", "Cliente Doze", "f", new CPF(null, "17772987312"));
		c13.getProdutosConsumidos().add(p13);c13.getProdutosConsumidos().add(p18);c13.getProdutosConsumidos().add(p6);
        c13.getServicosConsumidos().add(s13);c13.getServicosConsumidos().add(s18);c13.getServicosConsumidos().add(s6);
		Cliente c14 = new Cliente("Tereza Porto", "Cliente Treze", "f", new CPF(null, "17131312312"));
		c14.getProdutosConsumidos().add(p16);c14.getProdutosConsumidos().add(p14);c14.getProdutosConsumidos().add(p4);
        c14.getServicosConsumidos().add(s16);c14.getServicosConsumidos().add(s14);c14.getServicosConsumidos().add(s4);
		Cliente c15 = new Cliente("Rebeca Torze", "Cliente Quatorze", "f", new CPF(null, "17714142312"));
		c15.getProdutosConsumidos().add(p2);c15.getProdutosConsumidos().add(p3);c15.getProdutosConsumidos().add(p18);
        c15.getServicosConsumidos().add(s2);c15.getServicosConsumidos().add(s3);c15.getServicosConsumidos().add(s18);
		Cliente c16 = new Cliente("Zerosvaldo da Silva2", "Cliente Zero2", "m", new CPF(null, "11111111111"));
		c16.getProdutosConsumidos().add(p3);c16.getProdutosConsumidos().add(p1);
        c16.getServicosConsumidos().add(s3);c16.getServicosConsumidos().add(s1);
		Cliente c17 = new Cliente("Humberto dos Santos2", "Cliente Um2", "m", new CPF(null, "22222222222"));
		c17.getProdutosConsumidos().add(p12);c17.getProdutosConsumidos().add(p14);c17.getProdutosConsumidos().add(p13);c17.getProdutosConsumidos().add(p10);
        c17.getServicosConsumidos().add(s12);c17.getServicosConsumidos().add(s14);c17.getServicosConsumidos().add(s13);c17.getServicosConsumidos().add(s10);
		Cliente c18 = new Cliente("Doisilda Soares2", "Cliente Dois2", "f", new CPF(null, "12312312312"));
		c18.getProdutosConsumidos().add(p17);c18.getProdutosConsumidos().add(p16);c18.getProdutosConsumidos().add(p11);
        c18.getServicosConsumidos().add(s17);c18.getServicosConsumidos().add(s16);c18.getServicosConsumidos().add(s11);
		Cliente c19 = new Cliente("João Cortrês2", "Cliente Três2", "m", new CPF(null, "12312432312"));
		c19.getProdutosConsumidos().add(p15);c19.getProdutosConsumidos().add(p19);
        c19.getServicosConsumidos().add(s15);c19.getServicosConsumidos().add(s19);
		Cliente c20 = new Cliente("Torquatro de Oliveira2", "Cliente Quatro2", "m", new CPF(null, "12312444412"));
		c20.getProdutosConsumidos().add(p4);c20.getProdutosConsumidos().add(p5);c20.getProdutosConsumidos().add(p16);
        c20.getServicosConsumidos().add(s4);c20.getServicosConsumidos().add(s5);c20.getServicosConsumidos().add(s16);
		Cliente c21 = new Cliente("Suelen Cinqueira2", "Cliente Cinco2", "f", new CPF(null, "12555512312"));
		c21.getProdutosConsumidos().add(p12);c21.getProdutosConsumidos().add(p11);c21.getProdutosConsumidos().add(p18);c21.getProdutosConsumidos().add(p17);c21.getProdutosConsumidos().add(p20);
        c21.getServicosConsumidos().add(s12);c21.getServicosConsumidos().add(s11);c21.getServicosConsumidos().add(s18);c21.getServicosConsumidos().add(s17);c21.getServicosConsumidos().add(s20);
		Cliente c22 = new Cliente("ConSeisção Moura2", "Cliente Seis2", "f", new CPF(null, "12312666312"));
		c22.getProdutosConsumidos().add(p7);c22.getProdutosConsumidos().add(p8);c22.getProdutosConsumidos().add(p10);
        c22.getServicosConsumidos().add(s7);c22.getServicosConsumidos().add(s8);c22.getServicosConsumidos().add(s10);
		Cliente c23 = new Cliente("Setembrina Silva2", "Cliente Sete2", "f", new CPF(null, "17772312312"));
		c23.getProdutosConsumidos().add(p15);c23.getProdutosConsumidos().add(p19);c23.getProdutosConsumidos().add(p18);
        c23.getServicosConsumidos().add(s15);c23.getServicosConsumidos().add(s19);c23.getServicosConsumidos().add(s18);
		Cliente c24 = new Cliente("Oiton Bastos2", "Cliente Oito2", "m", new CPF(null, "12388812312"));
		c24.getProdutosConsumidos().add(p2);c24.getProdutosConsumidos().add(p3);
        c24.getServicosConsumidos().add(s2);c24.getServicosConsumidos().add(s3);
		Cliente c25 = new Cliente("Courtney Nove2", "Cliente Nove2", "f", new CPF(null, "12319992312"));
		c25.getProdutosConsumidos().add(p10);c25.getProdutosConsumidos().add(p7);c25.getProdutosConsumidos().add(p15);c25.getProdutosConsumidos().add(p5);
        c25.getServicosConsumidos().add(s10);c25.getServicosConsumidos().add(s7);c25.getServicosConsumidos().add(s15);c25.getServicosConsumidos().add(s5);
		Cliente c26 = new Cliente("Dézcio Amarante2", "Cliente De2z", "m", new CPF(null, "12312101012"));
		c26.getProdutosConsumidos().add(p2);c26.getProdutosConsumidos().add(p13);
        c26.getServicosConsumidos().add(s2);c26.getServicosConsumidos().add(s13);
		Cliente c27 = new Cliente("Marionze Neves2", "Cliente Onze2", "f", new CPF(null, "12311111312"));
		c27.getProdutosConsumidos().add(p12);c27.getProdutosConsumidos().add(p20);c27.getProdutosConsumidos().add(p9);c27.getProdutosConsumidos().add(p19);c27.getProdutosConsumidos().add(p1);c27.getProdutosConsumidos().add(p8);c27.getProdutosConsumidos().add(p8);
        c27.getServicosConsumidos().add(s12);c27.getServicosConsumidos().add(s20);c27.getServicosConsumidos().add(s9);c27.getServicosConsumidos().add(s19);c27.getServicosConsumidos().add(s1);c27.getServicosConsumidos().add(s8);c27.getServicosConsumidos().add(s8);
		Cliente c28 = new Cliente("Dozelina Félix2", "Cliente Doze2", "f", new CPF(null, "17772987312"));
		c28.getProdutosConsumidos().add(p13);c28.getProdutosConsumidos().add(p18);c28.getProdutosConsumidos().add(p6);
        c28.getServicosConsumidos().add(s13);c28.getServicosConsumidos().add(s18);c28.getServicosConsumidos().add(s6);
		Cliente c29 = new Cliente("Tereza Porto2", "Cliente Treze2", "f", new CPF(null, "17131312312"));
		c29.getProdutosConsumidos().add(p16);c29.getProdutosConsumidos().add(p14);c29.getProdutosConsumidos().add(p4);
        c29.getServicosConsumidos().add(s16);c29.getServicosConsumidos().add(s14);c29.getServicosConsumidos().add(s4);
		Cliente c30 = new Cliente("Rebeca Torze2", "Cliente Quatorze2", "f", new CPF(null, "17714142312"));
		c30.getProdutosConsumidos().add(p2);c30.getProdutosConsumidos().add(p3);c30.getProdutosConsumidos().add(p18);
        c30.getServicosConsumidos().add(s2);c30.getServicosConsumidos().add(s3);c30.getServicosConsumidos().add(s18);
	     dadosClientes.add(c1);  dadosClientes.add(c2);  dadosClientes.add(c3);
		 dadosClientes.add(c4);  dadosClientes.add(c5);  dadosClientes.add(c6);
		 dadosClientes.add(c7);  dadosClientes.add(c8);  dadosClientes.add(c9);
		 dadosClientes.add(c10);  dadosClientes.add(c11);  dadosClientes.add(c12);
		 dadosClientes.add(c13);  dadosClientes.add(c14);  dadosClientes.add(c15);
		 dadosClientes.add(c16);  dadosClientes.add(c17);  dadosClientes.add(c18);
		 dadosClientes.add(c19);  dadosClientes.add(c20);  dadosClientes.add(c21);
		 dadosClientes.add(c22);  dadosClientes.add(c23);  dadosClientes.add(c24);
		 dadosClientes.add(c25);  dadosClientes.add(c26);  dadosClientes.add(c27);
		 dadosClientes.add(c28);  dadosClientes.add(c29);  dadosClientes.add(c30);
		empresa.setClientes( dadosClientes);
		
	}
}