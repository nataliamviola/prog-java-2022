package br.com.senaisp.aula18.classes;
/**
 * Clase Base para Calculo de Imposto
 * @author Natalia
 *@since 2022-05-16
 *@version 1.0.0
 */

public class Imposto {
	private double BaseCalculo;
	private double Aliquota;
	
	/**
	 * Metodo que retorna o valor do impostocalculado com base
	 * nos campos BaseCalculo e Aliquota	
	 * @return retorna o Valor do Imposto Calculado
	 */
	public double calcularImposto () {
		return BaseCalculo * Aliquota /100;	
	}
//getter e setter
	public double getBaseCalculo() {
		return BaseCalculo;
	}

	public void setBaseCalculo(double baseCalculo) throws Exception {
		if (baseCalculo < 0) {
			throw new Exception ("Base de calculo não poderá ser negativa");
		}
		BaseCalculo = baseCalculo;
	}

	public double getAliquota() {
		return Aliquota;
	}

	public void setAliquota(double aliquota) throws Exception {
		if (aliquota<=0 || aliquota>99) {
			throw new Exception("Aliquota deve ser maior que zero e menor que cem");
		}
		Aliquota = aliquota;
	}
	
	
	
	}
		
	


