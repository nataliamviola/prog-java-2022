package br.com.senaisp.aula09;

public class Aula09Exe08While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aplicativo para montar linha e coluna");
		int intLinha = 1;
		int intColuna;

		while (intLinha <= 9) {
			System.out.println();
			

			intColuna = 1;
			while (intColuna <= 9) {
				if (intColuna <= intLinha)
				System.out.print(intLinha + "-" + intColuna + " ");
				else
				System.out.print("    ");
				intColuna++;
			
		}
			
			intLinha++;
	}
	}

}
