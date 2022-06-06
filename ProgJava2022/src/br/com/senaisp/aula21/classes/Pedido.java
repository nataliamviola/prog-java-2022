package br.com.senaisp.aula21.classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String documento;
	private List<Produto> listaItens;
	
	//constructor
	public Pedido (String documento) throws Exception {
		setDocumento (documento);
		listaItens = new ArrayList <Produto>();
		
	}
//geter and setter
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) throws Exception {
		if (documento.length()<3) //tratamento para comprimento ser maior que 3 caracteres
			throw new Exception ("Documento deve ter pelo menos 3 caracteres");
		this.documento = documento;
	}
	
	public void adicionarProduto (Produto prod) {
		listaItens.add(prod);
		
	}
	
	public void removerproduto (Produto prod) {
		listaItens.remove(prod);
	}
	
	public void removerproduto (int indiceProd) {
		listaItens.remove(indiceProd);
	}
	
	public double totalPedido () {
		double dblTot = 0;
		for (int intI = 0; intI<listaItens.size(); intI++) {
			dblTot += listaItens.get(intI).precoTotal();
		}
		return dblTot;
	}
	
		//fazer listagem de itens
	public void listarItens () {
		System.out.println("Listagem de Itens");
		System.out.println("# - Descrição - Qtde - Preço");
		System.out.println("----------------------------");
		for (int intI=0; intI<listaItens.size(); intI++) {
			Produto prod = listaItens.get(intI);
			System.out.print(intI);
			System.out.print(" - " + prod.getNome());
			System.out.print(" - un " + prod.getQtde());
			System.out.print(" - R$ " + prod.getPreco());
			System.out.println(" = " + prod.precoTotal()); //nao tem get porque  é um metodo para o calculo do preco total
			
		}
	}
	
}

