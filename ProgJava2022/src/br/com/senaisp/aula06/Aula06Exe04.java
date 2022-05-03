package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int intEscolha = 1;
		
		
		while (intEscolha != 2) {
		System.out.println("Cálculo de temperatura");
		System.out.println("Insira a temperatura de origem. Informe 1 para Celsius, 2 para farenheit ou 3 para Kelvin");
		double dblTempOrigem = sc.nextDouble();
		System.out.println("Informe a temperatura de destino. Informe 1 para Celsius, 2 para farenheit ou 3 para Kelvin");
		double dblTempDestino = sc.nextDouble();
		System.out.println("Insira a Temperatura desejada:");
		double dblTempDesejada = sc.nextDouble();
		double dblTempFinal = sc.nextDouble();
		
		if (dblTempOrigem == 1 && dblTempDestino == 2) {
			dblTempFinal = dblTempDesejada * 9 / 5 + 32;
			System.out.println("A temperatura transformada é:" + dblTempFinal);}
		
		else if (dblTempOrigem == 1 && dblTempDestino == 3) {	
			dblTempFinal = dblTempDesejada + 273.15;
			System.out.println("A temperatura transformada é:" + dblTempFinal);}
						
				
					
	}
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para não:");
		intEscolha = sc.nextInt();
}
}