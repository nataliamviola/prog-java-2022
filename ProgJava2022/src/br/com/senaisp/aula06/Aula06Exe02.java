package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intEscolha = 1;
		Scanner sc = new Scanner (System.in);
		//calculando o IMC
		while (intEscolha != 2) {
		System.out.println(" Calculando o IMC");
		System.out.println("Digite seu peso:");
		double dblPeso = sc.nextDouble();
		System.out.println("Digite sua altura em metros:");
		double dblAltura = sc.nextDouble();
		double dblIMC = dblPeso / (dblAltura * dblAltura);
		System.out.println("O seu IMC é:" + dblIMC);
		
						
		if (dblIMC < 20)
			System.out.println("Você está abaixo do peso!.");
		else if (dblIMC >=20 && dblIMC <=25) 
			System.out.println("Seu peso está normal!");
		else if (dblIMC >25 && dblIMC <=30)
			System.out.println("Você está com excesso de peso!");
		else if (dblIMC >30 && dblIMC <=35)
			System.out.println("Você está com obesidade!");
		else 
			System.out.println("Você está com obesidade morbida!");
		
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para não:");
		intEscolha = sc.nextInt();
		
		
	} 

}
}