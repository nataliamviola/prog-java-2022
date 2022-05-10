package br.com.senaisp.aula14.classes;

public class Mam�ferosEncapsulada {
	private String Pele;
	private String Olhos;
	private String Boca;
	private double Peso;
	//clica com botao direito do mouse em "private" e escolhe "source" depois " generate getters and setters"
	//assim faz o encapsulamento automaticamente
	public String getPele() {
		return Pele;
	}
	public void setPele(String pele) {
		Pele = pele;
	}
	public String getOlhos() {
		return Olhos;
	}
	public void setOlhos(String olhos) {
		if (!olhos.equalsIgnoreCase("castanho") &&
				!olhos.equalsIgnoreCase("preto") &&	
				!olhos.equalsIgnoreCase("azul") &&
				!olhos.equalsIgnoreCase("verde"))
			System.out.println("Valor inv�lido para os olhos");
		else			
		Olhos = olhos;
	}
	public String getBoca() {
		return Boca;
	}
	public void setBoca(String boca) {
		Boca = boca;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}
	
}
