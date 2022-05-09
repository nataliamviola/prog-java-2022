package br.com.senaisp.aula13;

import java.util.Scanner;

public class Aula13Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum [] = new int [10];
		Scanner sc = new Scanner (System.in);
		//entrando com os numeros
		for (int intI=0; intI<10; intI++) {
			System.out.println("Digite o numero desejado - posição " + (intI + 1)+":");
			intNum[intI] = sc.nextInt();
			}
		//ordenando os valores-método BubbleSort (Bolha)
		int intApoio;
		for (int intI=0; intI<9; intI++) {
			for ( int intF = intI; intF<10; intF++) {
				//ordenação decrescente
				if (intNum[intI] < (intNum[intF])) {
					intApoio = intNum [intI];
					intNum[intI] = intNum[intF];
					intNum[intF] = intApoio;
				}
			}
		}
	
		//mostrando os nomes
		System.out.println("Os numeros digitados em ordem decrescente foram:");
		for (int intI=0; intI<10; intI++) {
			System.out.println(intNum[intI]);
			sc.close();
			
	}
	}
}
