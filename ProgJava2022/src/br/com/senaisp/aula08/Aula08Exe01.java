package br.com.senaisp.aula08;

import java.time.LocalDate;
import java.util.Scanner;

public class Aula08Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intContador = 0; //preciso criar a variavel pois irei precisar de um contador; o num 0 ser� substituido automaticamente
		int intNumPositivo; // 1 - sim e 2 = nao
		Scanner sc = new Scanner(System.in);
		System.out.println("programa de n�meros positivos inteiros");
		// iniciando o la�o de repeti��o. Note que ele entra sem os testes
		do {
			System.out.println("Digite um n�mero inteiro positivo: (negativo finaliza o programa)");
			intNumPositivo = sc.nextInt();
			
			if (intNumPositivo>=0) intContador ++;
						

		} while (intNumPositivo >= 0);
		System.out.println("A quantidade de n�meros positivos digitados foi de " + intContador );
		sc.close(); // fechando o scanner
	}

}
