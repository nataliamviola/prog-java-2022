package br.com.senaisp.aula09;

public class Aula09Exe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Aplicativo para montar linha e coluna");
		int intLinha = 1;
		int intColuna = 1;

		for (intLinha = 1; intLinha <= 9; intLinha++) {
			System.out.println();

			for (intColuna = 1; intColuna <= 9; intColuna++)
				if (intColuna == intLinha || intColuna + intLinha==10)
				System.out.print(intLinha + "-" + intColuna + " ");

				else
					System.out.print("    ");

		}
	}

}
