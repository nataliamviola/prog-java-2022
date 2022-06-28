package br.com.senaisp.classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class CadastroCliente {
	private int id;
	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;
	
	private ConexaoBD conn;
	private boolean haErro;
	private String msgErro;
	
	public CadastroCliente () {
		conn = ConexaoBD.getInstance();
		
	}
	
	public void criar() throws SQLException {
		conn.conectarBD();
		String sql = "insert into cadastro_cliente (nome, endereco, cpf, telefone) \r\n + values(?,?,?,?)";
	PreparedStatement stmt = conn.getConector(). prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
	stmt.setString(1, nome);
	stmt.setString(2, endereco);
	stmt.setString(3, cpf);
	stmt.setString(4, telefone);
	
	stmt.executeUpdate();
	ResultSet rs = stmt.getGeneratedKeys();
	rs.next();
	id = rs.getInt(1);
	System.out.println("ID ->" + id);
	conn.desconectarBD();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//lendo cliente
	public boolean ler() throws SQLException {
	boolean ret=false;
	conn.conectarBD();
	String sql = "select * from cadastro_cliente where id = ?";
	PreparedStatement stmt = conn.getConector().prepareStatement(sql);
	stmt.setInt(1, id);
	ResultSet rs = stmt.executeQuery();
	if (rs.next()) {
		nome = rs.getString(2);
		endereco = rs.getString(3);
		cpf = rs.getString(4);
		telefone = rs.getString(5);
	}
	
	return ret;
	}
	
	//alterar cliente
	public void alterar () throws SQLException {
		conn.conectarBD();
		String sql = "update cadastro_cliente set + nome = ?, endereco = ?, cpf = ?, telefone = ?";
		PreparedStatement stmt = conn.getConector().prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setString(2, endereco);
		stmt.setString(3, cpf);
		stmt.setString(4, telefone);
		
		stmt.setInt(5, id);
		int rowsAff = stmt.executeUpdate();
		System.out.println("Linhas alteradas: " + rowsAff);
		conn.desconectarBD();
		
	}
	//apagar cliente
	public void apagar () throws SQLException {
		conn.conectarBD();
		String sql = "delete from cadastro_cliente where id = ?";
		PreparedStatement stmt = conn.getConector().prepareStatement(sql);
		
		stmt.setInt(1, id);
		int rowAff = stmt.executeUpdate();
		System.out.println("Linhas apagadas:" + rowAff);
		conn.desconectarBD();
		
	}
	
	//Tabela
	public DefaultTableModel listaCliente () throws SQLException {
		DefaultTableModel ret = null;
		conn.conectarBD();
		String sql = "select * from cadastro_cliente order by id";
		PreparedStatement stmt = conn.getConector().prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		ResultSetMetaData rsm = stmt.getMetaData ();
		
		String titulos[] = new String [rsm.getColumnCount()];
		for (int intI=1; intI<=rsm.getColumnCount(); intI++) {
			titulos [intI-1] = rsm.getColumnName(intI);
		}
		
		ret = new DefaultTableModel(titulos,0);
		while (rs.next()) {
			Object obj[] = new Object [rsm.getColumnCount()];
			for (int intI=1; intI <=rsm.getColumnCount(); intI++) {
				obj[intI-1]=rs.getString(intI);
			}
		}
		
		return ret;
		
		
	}
	
	
	
	
}
