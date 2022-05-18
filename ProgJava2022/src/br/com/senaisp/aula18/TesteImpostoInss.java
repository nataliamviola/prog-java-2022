package br.com.senaisp.aula18;

import br.com.senaisp.aula18.classes.ImpostoInss;

public class TesteImpostoInss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpostoInss imp = new ImpostoInss();
		try {
			imp.setBaseCalculo(4000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(imp.calcularImposto());
	}

}
