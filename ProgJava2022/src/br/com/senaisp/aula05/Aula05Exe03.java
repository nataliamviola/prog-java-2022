package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa para linha de créditos para Funcionários da prefeitura de Bauru");
		Scanner sc = new Scanner (System.in);
		System.out.println(" Informe seu salário bruto");
		double dblSalario = sc.nextDouble();
		System.out.println("informe o valor da parcela a ser contratada");
		double dblParcela = sc.nextDouble();
		if (dblSalario * 0.30 >= dblParcela)
			System.out.println(" Parabéns, é possível a aquisição do seu empréstimo!");
		else 
			System.out.println("Infelizmente não é possivel realizar seu empréstimo.");
		
	}
	

}
