package br.com.senaisp.aula14;

import java.util.Scanner;

import br.com.senaisp.aula14.classes.MamíferosEncapsulada;

public class ExemploMamíferosEncapsulado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MamíferosEncapsulada humano = new MamíferosEncapsulada ();
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Digite a cor da pele do humano:");
			try {
				humano.setPele(sc.nextLine());
				break;
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}
		}while (true);	
		
				
								
		do {
			System.out.println("Digite a cor dos olhos do humano:");
			try {
				humano.setOlhos(sc.nextLine());
				break;
			} catch (Exception e) {
			// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		} while (true);
				
	
		do {
			System.out.println("Digite o tamanho da boca do humano:");
			try {
				humano.setBoca(sc.nextLine());
				break;
			} catch (Exception e2) {
				System.out.println("Valor Inválido!");
			}
		}while (true);
		
		
		do {
			System.out.println("Digite o peso do humano:");
			try {
				humano.setPeso(sc.nextDouble());
				break;
			} catch (Exception e3) {
				System.out.println("Valor Inválido!");
				sc.nextLine();
			}
		}while (true);
			
				
		
		//mostrando os dados cadastrados
		System.out.println("Pele digitada: " + humano.getPele());
		System.out.println("Olhos digitados: " + humano.getOlhos());
		System.out.println("Boca digitada: " + humano.getBoca());
		System.out.println("Peso digitado: " + humano.getPeso());
		
		sc.close();
		
		}
	
}
