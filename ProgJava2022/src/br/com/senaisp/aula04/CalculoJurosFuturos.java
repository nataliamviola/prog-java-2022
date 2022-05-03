package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoJurosFuturos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Cálculo de Aplicação Futura");
		System.out.println("Digite o Valor a ser Aplicado:");
		Scanner sc = new Scanner (System.in);
		double dblValorAplicado = sc.nextDouble();
		System.out.println("Digite o tempo de aplicação (em meses):");
		int intTempoAplicacao = sc.nextInt();
		System.out.println("Digite o percentual de Juros:");
		double dblJuros = sc.nextDouble();
		//Calculando os Juros
		double dblValorFuturo = dblValorAplicado * Math.pow((1 +  dblJuros / 100.00), intTempoAplicacao);
		//Mostrando o resultado
		System.out.println("O valor aplicado será de R$" + dblValorFuturo);
		
		
	}

}
