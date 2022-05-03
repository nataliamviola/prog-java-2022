package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula07Exe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Fibonacci começa com a sequencia de 0 e 1 e depois o 1 e soma sempre com os dois numeros anteriores ex: 01123...
	
		int intRes = 1; //i para sim e 2 para não
		Scanner sc = new Scanner(System.in);
		while (intRes !=2) {
			System.out.println("Calculando a sequência de Fibonacci");
			System.out.println("Digite o valor desejado:");
			int intTermo = sc.nextInt();
			int intAnt1 = 0;
			int intAnt2 = 1;
			int intApoio = 0;
			//imprimondo o primeiro e segundo termo
			System.out.print(intAnt1 + "  " + intAnt2 );
			for (int intCont=3; intCont<= intTermo; intCont++) {
				System.out.print( (intAnt1 + intAnt2) + "  ");
				intApoio = intAnt1;
				intAnt1 = intAnt2;
				intAnt2 = intApoio + intAnt2;
			}
						
			System.out.println("Deseja continuar? Digite 1 para sim e 2 para não");
			intRes = sc.nextInt();
		}
		sc.close();
	}
	

}
