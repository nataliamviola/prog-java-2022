package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo de peso dos planetas");
		
		System.out.println("Menu principal");
		System.out.println("1 - Planeta Mercúrio");
		System.out.println("2 - Planeta Vênus");
		System.out.println("3 - Planeta Marte");
		System.out.println("4 - Planeta Júpter");
		System.out.println("5 - Planeta Saturno");
		System.out.println("6 - Planeta Urano");
		System.out.println("Digite sua opção:");
		Scanner sc = new Scanner(System.in);
		int intPlaneta = sc.nextInt();
		System.out.println("Digite o peso na Terra:");
		double dblPesoTerra = sc.nextDouble();
		double dblIndice = 10.00;
		//colocando o dblIndice igual a dez, depois ele será substituido pelos valores dos casos. 
		//o valor 10 será utilizado caso a opção digitada seja inválida
		switch (intPlaneta) {
		case 1: dblIndice = 0.37; break;
		case 2: dblIndice = 0.88; break;
		case 3: dblIndice = 0.38; break;
		case 4: dblIndice = 2.64; break;
		case 5: dblIndice = 1.15; break;
		case 6: dblIndice = 1.17; break;
		default:
			System.out.println("Planeta Inválido");
		}
		double dblPeso = dblPesoTerra / 10.00 * dblIndice;
		System.out.println("O peso no planeta selecionado é:" + dblPeso);
	
	}

}
