package br.com.senaisp.aula08;

import java.time.LocalDate;
import java.util.Scanner;

public class ExemplosComandoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do(fa�a), while (enquanto)
		int intResp; //1 - sim e 2 = nao
		Scanner sc=new Scanner (System.in);
		//iniciando o la�o de repeti��o. Note que ele entra sem os testes
		do {
			System.out.println("programa de c�lculo de idade");
			System.out.println("Digite o ano do seu nascimento:");
			int intAnoNasc = sc.nextInt();
			//obtendo o ano atual pelo sistema automaticamente
			int intAnoAtual = LocalDate.now().getYear();
			int intIdade = intAnoAtual - intAnoNasc;
			System.out.println("Sua idade �: " + intIdade);
			System.out.println("Deseja Continuar? (1-sim, 2-n�o):");
			intResp = sc.nextInt();
			//aqui no final somente testamos a condi��o
		
		} while (intResp != 2);
		sc.close (); //fechando o scanner

	}

}
