package br.com.senaisp.aula18.classes;

public class ImpostoInss extends Imposto {
	@Override
	public double calcularImposto() {
		double dblRet = 0;
		double dblBC = getBaseCalculo();
		// testes para calculo do imposto
		// primeira faixa
		if (dblBC >= 0 && dblBC <= 1212.00) {
			dblRet += (dblBC - 0.00) * 7.5 / 100.00;
		} else if (dblBC > 1212.00) {
			dblRet += (1212.00 - 0.00) * 7.5 / 100.00;
		}
		// segunda faixa
		if (dblBC > 1212.01 && dblBC <= 2427.35) {
			dblRet += (dblBC - 1212.01) * 9 / 100.00;
		} else if (dblBC > 2427.35) {
			dblRet += (2427.35 - 1212.01) * 9 / 100.00;
		}

		// terceira faixa
		if (dblBC > 2427.36 && dblBC <= 3641.03) {
			dblRet += (dblBC - 2427.36) * 12 / 100.00;
		} else if (dblBC > 3641.03) {
			dblRet += (3641.03 - 2427.36) * 12 / 100.00;
		}
		
		//quarta faixa
		if (dblBC >= 3641.04 && dblBC <= 7087.22) {
			dblRet += (dblBC - 3641.04) * 14 / 100.00;
		} else if (dblBC > 7087.22) {
			dblRet += (7087.22 - 3641.04) * 14 / 100.00;
		}
			
			
		return dblRet;
	}
	}
	

