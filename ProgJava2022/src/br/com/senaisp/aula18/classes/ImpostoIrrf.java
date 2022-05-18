package br.com.senaisp.aula18.classes;

public class ImpostoIrrf extends Imposto {
	
	private int NumDependentes;

	public int getNumDependentes() {
		return NumDependentes;
	}

	public void setNumDependentes(int numDependentes) throws Exception {
		if (numDependentes < 0) {
			throw new Exception("Número não pode ser negativo!");
		}
		NumDependentes = numDependentes;
	}

	@Override
	public double calcularImposto() {
		double dblBC = getBaseCalculo();
		double dblRet = 0;
		
		if (dblBC >= 0 && dblBC <= 1903.98) {
			dblRet = (dblBC - NumDependentes * 189.59) * 0.00;
		} else if (dblBC >= 1903.99 && dblBC <= 2826.65) {
			dblRet = (dblBC - NumDependentes * 189.59) * 7.50 / 100 - 142.80;
		} else if (dblBC >= 2826.66 && dblBC <= 3751.05) {
			dblRet = (dblBC - NumDependentes * 189.59) * 15 / 100 - 354.80;
		} else if (dblBC >= 3751.06 && dblBC <= 4664.68) {
			dblRet = (dblBC - NumDependentes * 189.59) * 22.5 / 100 - 636.13;
		} else {
			dblRet = (dblBC - NumDependentes * 189.59) * 27.5 / 100 - 869.36;
		}

		return dblRet;
	}
}
