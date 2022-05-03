package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" verificação de números primos");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um número inteiro:");
		
		int intNum = sc.nextInt();
		int intContador = 1;
		int intCiclo = 1;
		
		while (intCiclo < intNum) {
			intCiclo ++;
			if (intNum % intCiclo ==0)intContador++;
					
			
		}
		if (intContador <=2)
		System.out.println(" O Número digitado é primo!");
		else 
			System.out.println(" O numero não é primo!");
		
			
		
	}

}
