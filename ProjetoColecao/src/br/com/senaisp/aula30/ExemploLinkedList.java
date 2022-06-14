package br.com.senaisp.aula30;

//a diferença entre Arraylist e Linked List é que esta é duplamente encadeada, podendo ir para os dois lados (frente e tras)

import java.util.Iterator;
import java.util.LinkedList;

public class ExemploLinkedList {
	private LinkedList<String> listaFilmes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploLinkedList ex = new ExemploLinkedList();
		ex.listaFilmes = new LinkedList <String>();
		
		System.out.println("Exemplo de uso de interface List");
		System.out.println();
		
		ex.insereInicio("Blade Runner - o caçador de androides");
		ex.insereInicio("O Exterminador do Futuro 2");
		
		ex.insereFim("Apocalipse Now");
		ex.insereFim("Star Wars IV - Uma nova esperança");
		
		ex.insereInicio("Curtindo a vida adoidado");
		ex.insereFim("Drácula - de Bram Stocker");
		ex.insereInicio("2001 - Uma odisséia no espaço");
		
		ex.imprimirLista();
		
		ex.removeInicio();
		ex.removeFim();
		
		ex.imprimirLista();
	}

	public void insereInicio(String strTitulo) {
		listaFilmes.add(0,strTitulo);
		
	}
	public void insereFim (String strTitulo) {
		listaFilmes.add(strTitulo);
	}

	public void removeInicio () {
		listaFilmes.remove(0);
		
	}
	
	public void removeFim() {
		int intUlt = listaFilmes.size()-1;
		listaFilmes.remove(intUlt);
		
	}
	
	public void imprimirLista() {
		System.out.println();
		System.out.println();
		Iterator <String> iteratorLista = listaFilmes.iterator(); //usar o java Util. Iterator é um apoio da lista
		while (iteratorLista.hasNext ()) {
			System.out.println("Título do Filme: " + iteratorLista.next ());
			
		}
		
		
	}

	}


