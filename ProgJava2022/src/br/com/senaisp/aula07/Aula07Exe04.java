package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula07Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo do fatorial");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a ser calculado o fatorial:");
		int intVlr =sc.nextInt();
		int intRes = 1;
		//a conta ser� intCont=partindo do numero que foi indicado, enquanto o numero for maior que um, decrescenta um
		for (int intCont=intVlr;intCont>1;intCont--) {
			intRes*=intCont;
			//intRes=intRes * intCont;
		}
		System.out.println("O resultado � "+ intRes);
		sc.close();
	}

}
