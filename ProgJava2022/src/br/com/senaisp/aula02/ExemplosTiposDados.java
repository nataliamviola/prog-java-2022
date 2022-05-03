package br.com.senaisp.aula02;

import java.util.Scanner;

public class ExemplosTiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aqui estamos fazendo uma soma
		int soma = 5 +3;
		System.out.println("Soma: " + soma);
		
		//Aqui estamos fazendo uma subtração
		int subtração = 5 - 2;
		System.out.println("Subtração:" + subtração);
		
		int mutiplicacao = 5 * 2;
		System.out.println("Mutiplicação:" + mutiplicacao);
		
	    double divisaof = 5.00 / 2.00;
		System.out.println("Divisao:" + divisaof);
		
		int resto = 3 % 2;
		System.out.println("Resto de divisão: " + resto);
		
		System.out.print("777");
		System.out.print("Aquele lá");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome=sc.nextLine();
		System.out.println("Olá " + nome);
		
		
	
	}

}
