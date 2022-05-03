package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intEscolha = 1;
		Scanner sc = new Scanner(System.in);
		//começando o laço de repetição
		while (intEscolha != 2) {
		//limpeza de tela (só funciona no teminal (ir no arquivo bin do eclipse e executar o terminal com botão direito)
		System.out.print("\033[H\033[2J");
		System.out.flush();
		//fim da limpeza de tela
		System.out.println("Aplicativo para cálculo da área do cilindro");	
		System.out.println("Digite o raio do cilindro:");
		double dblRaio = sc.nextDouble();
		System.out.println("Digite a altura do cilindro:");
		double dblAltura = sc.nextDouble();
		double dblArea = 2 * 3.1415 * dblRaio *(dblRaio + dblAltura);
				
		System.out.println("A área calculada é: " + dblArea);
		
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para não:");
		intEscolha = sc.nextInt();
								
		
	}

}
}