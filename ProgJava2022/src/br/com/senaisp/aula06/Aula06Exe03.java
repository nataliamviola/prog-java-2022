package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" verifica��o de n�meros primos");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um n�mero inteiro:");
		
		int intNum = sc.nextInt();
		int intContador = 1;
		int intCiclo = 1;
		
		while (intCiclo < intNum) {
			intCiclo ++;
			if (intNum % intCiclo ==0)intContador++;
					
			
		}
		if (intContador <=2)
		System.out.println(" O N�mero digitado � primo!");
		else 
			System.out.println(" O numero n�o � primo!");
		
			
		
	}

}
