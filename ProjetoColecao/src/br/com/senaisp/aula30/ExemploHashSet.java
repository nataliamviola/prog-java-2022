package br.com.senaisp.aula30;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class ExemploHashSet {
	private Set <String> listaFilmes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploHashSet ex = new ExemploHashSet();
		ex.listaFilmes = new HashSet <String>(); //o Hash cria um proprio metodo de inser��o, transformando o texto em um calculo proprio
		
		System.out.println("Exemplo de uso de interface List");
		System.out.println();
		
		ex.insere("Blade Runner - o ca�ador de androides");
		ex.insere("O Exterminador do Futuro 2");
		
		ex.insere("Apocalipse Now");
		ex.insere("Star Wars IV - Uma nova esperan�a");
		
		ex.insere("Curtindo a vida adoidado");
		ex.insere("Dr�cula - de Bram Stocker");
		ex.insere("2001 - Uma odiss�ia no espa�o");
		
		ex.imprimirLista();
		
		ex.remove("Apocalipse Now");
		ex.remove("2001 - Uma odiss�ia no espa�o");
		
		ex.imprimirLista();
	}
	
//metodos
			
	public void insere (String strTitulo) {
		listaFilmes.add(strTitulo);
	}

	public void remove (String strTitulo) {
		listaFilmes.remove(strTitulo);
		
	}
	
		
	public void imprimirLista() {
		System.out.println();
		System.out.println();
		Iterator <String> iteratorLista = listaFilmes.iterator(); //usar o java Util. Iterator � um apoio da lista
		while (iteratorLista.hasNext ()) {
			System.out.println("T�tulo do Filme: " + iteratorLista.next ());
			
		}
		
		
	}


	}


