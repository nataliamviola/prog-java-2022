package br.com.senaisp.aula02;

import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cauculo de Bhaskara");
		System.out.println("Digite o valor d A:");
		Scanner sc= new Scanner(System.in);
		int intA = sc.nextInt();
		System.out.println("Digite o valor d B:");
		int intB = sc.nextInt();
		System.out.println("Digite o valor d C:");
		int intC = sc.nextInt();
		//Calculando Delta
		double dblDelta = Math.pow(intB, 2) - 4 * intA * intC;
		double dblX1 = (-intB + Math.sqrt(dblDelta)) / (2 * intA); 
		System.out.println("Resultado X1 :" + dblX1);
		double dblX2 = (-intB - Math.sqrt(dblDelta)) / (2 * intA); 
		System.out.println("Resultado X2 :" + dblX2);

		
		
		
		
		
	}

}
