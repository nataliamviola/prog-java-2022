package br.com.senaisp.aula08;

import java.time.LocalDate;
import java.util.Scanner;

public class Aula08Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResp; // 1-sim, 2-não
		int intIdade, intAnoNascimento;
		String strNome, strEndereco;
		// Para os controles de menor e maior
		int intIdadeMenor = Integer.MAX_VALUE;
		int intIdadeMaior = Integer.MIN_VALUE;
		String strNomeMenor="", strNomeMaior="";
		String strEnderecoMenor="", strEnderecoMaior="";
		// Obtendo o ano atual
		int intAnoAtual = LocalDate.now().getYear();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Sistema de cadastramento de pacientes");
			System.out.println("Digite o nome do paciente:");
			strNome = sc.nextLine();
			System.out.println("Digite o endereço do paciente:");
			strEndereco = sc.nextLine();
			//Restringindo valores menores que o ano atual e ano atual - 200
			//Ou seja a pessoa não pode ter mais de 199 anos
			do {
				System.out.println("Digite o ano de nascimento do paciente:");
				intAnoNascimento = sc.nextInt();
				if (intAnoNascimento <= intAnoAtual-200 || 
					intAnoNascimento >= intAnoAtual)
					System.out.println("Ano de Nascimento inválido!");
			} while (intAnoNascimento <= intAnoAtual - 200 || 
					 intAnoNascimento >= intAnoAtual);
			// Lógica de testes
			//Calculando a idade
			intIdade = intAnoAtual - intAnoNascimento;
			//Testando as idades
			if (intIdade>intIdadeMaior) {
				intIdadeMaior = intIdade;
				strNomeMaior = strNome;
				strEnderecoMaior = strEndereco;
			}
			if (intIdade<intIdadeMenor) {
				intIdadeMenor = intIdade;
				strNomeMenor = strNome;
				strEnderecoMenor = strEndereco;
			}
			//
			do {
				System.out.println("Continuar? (1-Sim,2-Não)");
				intResp = sc.nextInt();
				if (intResp!=1 && intResp!=2) 
					System.out.println("Valores permitidos são 1 ou 2!");
			} while (intResp!=1 && intResp!=2);
			sc.nextLine();
		} while (intResp != 2);
		System.out.println("Menor idade: "+ intIdadeMenor);
		System.out.println("       Nome: "+ strNomeMenor);
		System.out.println("   Endereço: "+ strEnderecoMenor);
		System.out.println("Maior idade: "+ intIdadeMaior);
		System.out.println("       Nome: "+ strNomeMaior);
		System.out.println("   Endereço: "+ strEnderecoMaior);
	}

}
