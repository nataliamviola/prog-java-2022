package br.com.senaisp.aula08;

import java.util.Scanner;

public class Aula08Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intContador = 0; //preciso criar a variavel pois irei precisar de um contador; o num 0 será substituido automaticamente
		int intNumPositivo; // 1 - sim e 2 = nao
		int intMedia = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("programa de números positivos inteiros");
		// iniciando o laço de repetição. Note que ele entra sem os testes
		do {
			System.out.println("Digite um número inteiro positivo: (negativo finaliza o programa)");
			intNumPositivo = sc.nextInt();
			
			if (intNumPositivo>=0) {
				intContador ++;
				intMedia += intNumPositivo;
			}		

		} while (intNumPositivo >= 0);
		if (intContador>0)
		System.out.println("A média de números positivos digitados foi de " + (intMedia /intContador) );
		sc.close(); // fechando o scanner

	}

}
