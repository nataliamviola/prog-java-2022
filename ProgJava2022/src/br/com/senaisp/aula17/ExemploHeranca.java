package br.com.senaisp.aula17;

import br.com.senaisp.aula17.classes.Cachorro;
import br.com.senaisp.aula17.classes.Gato;
import br.com.senaisp.aula17.classes.Humano;
import br.com.senaisp.aula17.classes.Mamiferos;

public class ExemploHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primeira coisa é chamar a classe pai "Mamiferos"
		Mamiferos mam[] = new Mamiferos [4]; //escreve o nome da classe e depois "ctrl+shift+o" pra importar
		//criando o cachorro
		mam [0] = new Cachorro (); // ctrl+shift+o para importar a classe "Cachorro"
		mam [0].setCorPelo("Malhado");
		mam [0].setIdade(5);
		mam [0].setNome("Toto");
		((Cachorro)  mam [0]).setRaca("SRD"); //fazendo um cast para importar a definição especifica da classe cachorro
		
		//criando o gato
		mam [1] = new Gato (); // ctrl+shift+o para importar a classe "Gato"
		mam [1].setCorPelo("Preto");
		mam [1].setIdade(3);
		mam [1].setNome("Gatinho");
		//Cast 
		((Gato)  mam [1]).setRaca("SRD");
		((Gato)  mam [1]).setPorte("Pequeno");
		
		//criando o humano
		mam [2] = new Humano (); // ctrl+shift+o para importar a classe "Humano"
		mam [2].setCorPelo("Loiro");
		mam [2].setIdade(33);
		mam [2].setNome("Jordan");
		//Cast 
		((Humano)  mam [2]).setCorPele("Branca");
			
		//criando o mamifero generico (importando a classe pai mesmo)
		mam [3] = new Mamiferos (); // ctrl+shift+o para importar a classe "Mamiferos"
		mam [3].setCorPelo("Azul");
		mam [3].setIdade(45);
		mam [3].setNome("Avatar");
		
		for (int intI=0; intI<4; intI++) {
			System.out.println("Nome: " + mam[intI].getNome());
			System.out.println("Cor do Pelo: " + mam[intI].getCorPelo());
			System.out.println("Idade: " + mam[intI].getIdade());
			mam[intI].Falar();
			//criando uma instancia para testar se é um Humano 
			if (mam[intI] instanceof Humano) {
				System.out.println("Eu sou um Humano!");
			}
			System.out.println("******************");
			
						
			
		}
		
	}

}
