package br.com.senaisp.aula06;

import java.util.Scanner;

public class ExemplosComandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La�os de repeti��o");
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um n�mero abaixo de 20;");
		int intValores = sc.nextInt ();
		//mostrando os valores de 10 � 1 decrescente
		//e classificando em par o impar
		while (intValores > 0 ) {
			if(intValores %2==0)
				System.out.println("O valor  " + intValores + " � par.");
			else
				System.out.println("O valor  " + intValores + " � impar.");
			intValores--;
		}
	}

}
