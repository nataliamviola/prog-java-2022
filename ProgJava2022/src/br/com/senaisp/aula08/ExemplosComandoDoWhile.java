package br.com.senaisp.aula08;

import java.time.LocalDate;
import java.util.Scanner;

public class ExemplosComandoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do(faça), while (enquanto)
		int intResp; //1 - sim e 2 = nao
		Scanner sc=new Scanner (System.in);
		//iniciando o laço de repetição. Note que ele entra sem os testes
		do {
			System.out.println("programa de cálculo de idade");
			System.out.println("Digite o ano do seu nascimento:");
			int intAnoNasc = sc.nextInt();
			//obtendo o ano atual pelo sistema automaticamente
			int intAnoAtual = LocalDate.now().getYear();
			int intIdade = intAnoAtual - intAnoNasc;
			System.out.println("Sua idade é: " + intIdade);
			System.out.println("Deseja Continuar? (1-sim, 2-não):");
			intResp = sc.nextInt();
			//aqui no final somente testamos a condição
		
		} while (intResp != 2);
		sc.close (); //fechando o scanner

	}

}
