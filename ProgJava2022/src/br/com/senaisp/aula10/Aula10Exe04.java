package br.com.senaisp.aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResp = 1;
		// Scanner ir� colocar ponto decimal ao inv�s de v�rgula decimal
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		// While de continua��o
		while (intResp != 2) {
			System.out.println("Sistema de c�lculo de temperatura");
			System.out.println("1 - Celsius");
			System.out.println("2 - Fahrenheit");
			System.out.println("3 - Kelvin");
			
			//dando entrada na temperatura origem criada com fun��o
			int intTempOri = entradaTemperatura (sc, "Digite a Temperatura de Origem: (1 ou 2 ou 3)");
			/*do {
				System.out.println("Digite a Temperatura de Origem: (1 ou 2 ou 3)");
				intTempOri = sc.nextInt();
			} while (intTempOri != 1 && intTempOri != 2 && intTempOri != 3);
		*/
			int intTempDes = entradaTemperatura (sc, "Digite a Temperatura de Destino: (1 ou 2 ou 3)");
			/*do {
				System.out.println("Digite a Temperatura de Destino: (1 ou 2 ou 3)");
				intTempDes = sc.nextInt();
			} while (intTempDes != 1 && intTempDes != 2 && intTempDes != 3);
			*/
			System.out.println("Digite o Valor da Temperatura a ser convertida:");
			double dblTemperatura = sc.nextDouble();

			double dblTempConv = dblTemperatura;
			// teste de convers�o
			
			System.out.println("A temperatura calculada final � " + dblTempConv);
			System.out.println("Deseja calcular mais uma temperatura? (1-sim,2-n�o):");
			intResp = sc.nextInt();
		}
	}
	/** 
	 * Fun��o que dar� entrada na temperatura e tratar� os valores entre 1, 2 ou 3
	 * @param strMsg deve ser passado a mensagem de apresenta��o
	 * @param sc Deve ser passado o Scanner para entrada de dados
	 * @return Retorna um valor inteiro entre 1 e 3
	 */
	public static int entradaTemperatura (Scanner sc, String strMsg) { //se tiver um tipo em public static (ex: int) designa como fun��o (void n�o � tipo)
		int intTempOri;
		do {
			System.out.println(strMsg);
			intTempOri = sc.nextInt();
		} while (intTempOri != 1 && intTempOri != 2 && intTempOri != 3);
		return intTempOri; //toda fun��o exige um retorno
	}

	public static double calcularTemperatura (int intTpO, int intTpD, double dblTemp) {
		double dblTempConv = dblTemp;
								
		if (intTpO == 1) { // testando origem celsius
			if (intTpD == 2) { // testando destino Fahrenheit
				dblTempConv = dblTemp * 9 / 5 + 32;
			} else if (intTpD == 3) { // testando destino kelvin
				dblTempConv = dblTemp + 273;
			}
		} else if (intTpO == 2) { // testando origem fahrenheit
			if (intTpD == 1) { // testando destino Celsius
				dblTempConv = ( dblTemp - 32 ) * 5 / 9;
			} else if (intTpD == 3) { // testando destino kelvin
				dblTempConv = ( dblTemp - 32 ) * 5 / 9 + 273;
			}
		} else { // Calculand origem Kelvin
			if (intTpD == 1) { // testando destino Celsius
				dblTempConv = dblTemp - 273;
			} else if (intTpD == 2) { // testando destino Fahenheit
				dblTempConv = ( dblTemp - 273 ) * 9 / 5 + 32;
			}
		}
		return dblTemp;
	}
	}