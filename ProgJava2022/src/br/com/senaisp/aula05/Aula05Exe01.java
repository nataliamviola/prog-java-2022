package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("verifica��o de  n�mero impar e par");
		Scanner sc = new Scanner (System.in);
		System.out.println(" Informe um n�mero");
		int intVlr = sc.nextInt();
		if (intVlr % 2 ==0)
			System.out.println("O n�mero informado � par");
		else 
			System.out.println("O n�mero informado � impar");
	}

}
