package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalcDigVerAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calculo de Digito verificador de Ag�ncia");
		System.out.println("Entre com o n�mero da sua ag�ncia(com no m�ximo 4 d�gitos)");
		Scanner sc = new Scanner (System.in);
		int intAgencia = sc.nextInt();
		//calculando o digito
		int intUn = intAgencia % 10;
		int intDz = intAgencia % 100/10;
		int intCn = intAgencia % 1000/100;
		int intMl = intAgencia / 1000;
		int intSoma = intUn * 6 + intDz * 7 + intCn * 8 + intMl * 9;
		int intDig = 10 - intSoma % 10;
		System.out.println("O d�gito verificador �:" + intDig);
		
	}

}
