package br.com.senaisp.aula02;

import java.util.Scanner;

public class ExemplosTiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aqui estamos fazendo uma soma
		int soma = 5 +3;
		System.out.println("Soma: " + soma);
		
		//Aqui estamos fazendo uma subtra��o
		int subtra��o = 5 - 2;
		System.out.println("Subtra��o:" + subtra��o);
		
		int mutiplicacao = 5 * 2;
		System.out.println("Mutiplica��o:" + mutiplicacao);
		
	    double divisaof = 5.00 / 2.00;
		System.out.println("Divisao:" + divisaof);
		
		int resto = 3 % 2;
		System.out.println("Resto de divis�o: " + resto);
		
		System.out.print("777");
		System.out.print("Aquele l�");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome=sc.nextLine();
		System.out.println("Ol� " + nome);
		
		
	
	}

}
