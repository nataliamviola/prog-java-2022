package br.com.senaisp.aula14;

import br.com.senaisp.aula14.classes.Mam�feros;

public class ExemploMam�fero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//objeto mamifero
		Mam�feros boi = new Mam�feros ();
		boi.Boca = "Pequena";
		boi.Pele = "Bege";
		boi.Olhos = "Marrom";
		boi.Peso = 800.5;
		//objeto mamifero
		Mam�feros humano = new Mam�feros ();
		humano.Boca = "Pequena";
		humano.Pele = "Branca";
		humano.Olhos = "Azul";
		humano.Peso = 70;
		//vetor de mamiferos
		Mam�feros conjunto[] =new Mam�feros [10];
		//criando o primeiro mam�fero
		conjunto [0] = new Mam�feros ();
		conjunto [0].Pele = "Branca";
		conjunto [0].Boca = "Grande";
		conjunto [0].Olhos = "Negro";
		conjunto [0].Peso = 10;
		//criando o segundo mamifero
		conjunto [1] = new Mam�feros();
		
	}

}
