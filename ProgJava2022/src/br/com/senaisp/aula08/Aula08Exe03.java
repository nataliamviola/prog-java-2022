package br.com.senaisp.aula08;

import java.util.Scanner;

public class Aula08Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum; 
		int intMenor = Integer.MAX_VALUE; // para não haver problema de criar uma variavel que não de pra substituit com
											// o num digitado foi usado o valor maximo dos int
		int intMaior = -1; // para não haver problema de variavel, foi criada uma variavel com o num
							// negativo pois o valor digitado sempre será maior
		Scanner sc = new Scanner(System.in);
		System.out.println("programa de números positivos inteiros");
		// iniciando o laço de repetição. Note que ele entra sem os testes
		do {
			System.out.println("Digite um número inteiro positivo: (negativo finaliza o programa)");
			intNum = sc.nextInt();

			if (intNum >= 0) {
				if (intNum > intMaior)
					intMaior = intNum;
				if (intNum < intMenor)
					intMenor = intNum;

			}

		} while (intNum >= 0);

		System.out.println("O menor número digitado é:" + intMenor + " e o maior número digitado é:" + intMaior);
		sc.close(); // fechando o scanner
	}

}
