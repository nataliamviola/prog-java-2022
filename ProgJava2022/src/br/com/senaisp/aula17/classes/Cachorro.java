package br.com.senaisp.aula17.classes;

public class Cachorro extends Mamiferos {
	private String Raca;

	public String getRaca() {
		return Raca;
	}

	public void setRaca(String raca) {
		Raca = raca;
	}
	//polimorfismo
	public void Falar () { //criando uma fala especifica da classe cachorro
		super.Falar();//puxando a "fala"da super classe "Mamiferos
		System.out.println("Au Au Au");//mostrando a fala especifica da classe cachorro
	}

}
