package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoIrrf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programa de Cálculo do IRRF");
		System.out.println("Informe o salário Base (acima de 5.000:");
		Scanner sc = new Scanner(System.in);
		double dblSalarioBase = sc.nextDouble();
		System.out.println("Informe a quantidade de dependentes");
		int intNrDependentes = sc.nextInt();
		double dblIrrfBase = dblSalarioBase - intNrDependentes * 189.9 - 828.38;
		double dblIrrfVlr = dblIrrfBase * 0.275 - 869.36;
		System.out.println("A base de cálculo dp IRRF é R$:" + dblIrrfBase);
		System.out.println("O valor do IRRF é R$:"  + dblIrrfVlr);
		
	
		
	}

}
