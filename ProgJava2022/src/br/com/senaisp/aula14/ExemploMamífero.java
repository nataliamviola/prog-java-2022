package br.com.senaisp.aula14;

import br.com.senaisp.aula14.classes.Mamíferos;

public class ExemploMamífero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//objeto mamifero
		Mamíferos boi = new Mamíferos ();
		boi.Boca = "Pequena";
		boi.Pele = "Bege";
		boi.Olhos = "Marrom";
		boi.Peso = 800.5;
		//objeto mamifero
		Mamíferos humano = new Mamíferos ();
		humano.Boca = "Pequena";
		humano.Pele = "Branca";
		humano.Olhos = "Azul";
		humano.Peso = 70;
		//vetor de mamiferos
		Mamíferos conjunto[] =new Mamíferos [10];
		//criando o primeiro mamífero
		conjunto [0] = new Mamíferos ();
		conjunto [0].Pele = "Branca";
		conjunto [0].Boca = "Grande";
		conjunto [0].Olhos = "Negro";
		conjunto [0].Peso = 10;
		//criando o segundo mamifero
		conjunto [1] = new Mamíferos();
		
	}

}
