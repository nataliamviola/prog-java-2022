package br.com.senaisp.aula18.classes;

public class ImpostoInssMatriz extends Imposto {
	@Override
	public double calcularImposto() {
		double dblRet = 0;
		double dblBC = getBaseCalculo();
		//criando matriz para os valores do calculo com valor inicial, valor final e percentual
		double dblTab [][] = {{0.00,   1212.00, 7.5},
							{1212.01, 2427.35, 9.00},
							{2427.36, 3641.03, 12.00},
							{3641.04, 7087.22, 14.00}
		};
		
		for (int intI = 0; intI < 4; intI++) {
			if (dblBC >= dblTab [intI][0] && dblBC <= dblTab [intI] [1]) {
				dblRet += (dblBC - dblTab [intI] [0]) * dblTab [intI][2] /100.00;
				
			}else if (dblBC > dblTab [intI][1]) {
				dblRet += (dblTab [intI][1] - dblTab [intI][0]) * dblTab [intI][2] / 100.00;
			}
							
		}
						
		return dblRet;
	}
	}
	
// a diferença deste calculo com matriz é que voce consegue simplificar as contas "repetidas" em poucos codigos
