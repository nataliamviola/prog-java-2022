package br.com.senaisp.aula09;

public class Aula09Exe15DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aplicativo para montar linha e coluna");
		int intLinha = 1;
		int intColuna;

		do {
			System.out.println();
			

			intColuna = 1;
			do {
				if (intColuna == intLinha || intColuna + intLinha==10)
				System.out.print(intLinha + "-" + intColuna + " ");
				else
				System.out.print("    ");
				intColuna++;
			
		}while (intColuna <= 9);
			
			intLinha++;
	}while (intLinha <= 9);
	}

}
