package br.com.senaisp.classes;

public class CadastroFotografo {
	private int id;
	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;
	private String estilofoto;
	
	private ConexaoBD conn;
	private boolean haErro;
	private String msgErro;
	
	public CadastroFotografo () {
		conn = ConexaoBD.getInstance();
		
		
	}
	
	public boolean ret = false;

}
