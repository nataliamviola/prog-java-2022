package br.com.senaisp.aula13;

import java.util.Scanner;

public class Aula13Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strNomes [] = new String [10];
		Scanner sc = new Scanner (System.in);
		//entrando com os nomes
		for (int intI=0; intI<10; intI++) {
			System.out.println("Digite o nome desejado - " + (intI + 1)+":");
			strNomes[intI] = sc.nextLine();
			}
		//ordenando os valores-método BubbleSort (Bolha)
		String strApoio;
		for (int intI=0; intI<9; intI++) {
			for ( int intF = intI; intF<10; intF++) {
				//ordenação ascendente
				if (strNomes[intI].compareToIgnoreCase (strNomes [intF]) >0 ) {
					strApoio = strNomes [intI];
					strNomes[intI] = strNomes[intF];
					strNomes[intF] = strApoio;
				}
			}
		}
	
		//mostrando os nomes
		System.out.println("Os nomes digitados foram:");
		for (int intI=0; intI<10; intI++) {
			System.out.println(strNomes[intI]);
			sc.close();
			
		
		}
	}

}
