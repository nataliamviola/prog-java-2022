package br.com.senaisp.aula18.classes;

public class Funcionario {
	private int Chapa;
	private String Nome;
	private String Endereco;
	private double SalarioBase;
	private int NumDep;
	
	//getter e setter chapa
	public int getChapa() {
		return Chapa;
	}
	public void setChapa(int chapa) throws Exception {
		if (chapa < 0) {
			throw new Exception ("Não pode ser menor que zero!");
		}
			Chapa = chapa;
	}
	
	//getter e setter nome
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) throws Exception {
		if (nome.length() < 5) {
			throw new Exception ("Nome deve ter mais de 5 letras!");
		}
		Nome = nome;
	}
	
	//getter e setter endereco
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) throws Exception {
		if (endereco.length() < 5) {
			throw new Exception ("Endereço deve ter mais de 5 letras!");
		}
		Endereco = endereco;
	}
	
	//getter e setter salariobase
	public double getSalarioBase() {
		return SalarioBase;
	}
	public void setSalarioBase(double salarioBase) throws Exception {
		if (salarioBase < 0) {
			throw new Exception ("Não pode ser menor que zero!");
		}
		SalarioBase = salarioBase;
	}
	
	//getter e setter dependente
	public int getNumDep() {
		return NumDep;
	}
	public void setNumDep(int numDep) throws Exception {
		if (numDep < 0) {
			throw new Exception ("Não pode ser menor que zero!");
		}
		NumDep = numDep;
	}
	
	
	
	

}
