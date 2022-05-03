package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalcDigVerAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calculo de Digito verificador de Agência");
		System.out.println("Entre com o número da sua agência(com no máximo 4 dígitos)");
		Scanner sc = new Scanner (System.in);
		int intAgencia = sc.nextInt();
		//calculando o digito
		int intUn = intAgencia % 10;
		int intDz = intAgencia % 100/10;
		int intCn = intAgencia % 1000/100;
		int intMl = intAgencia / 1000;
		int intSoma = intUn * 6 + intDz * 7 + intCn * 8 + intMl * 9;
		int intDig = 10 - intSoma % 10;
		System.out.println("O dígito verificador é:" + intDig);
		
	}

}
