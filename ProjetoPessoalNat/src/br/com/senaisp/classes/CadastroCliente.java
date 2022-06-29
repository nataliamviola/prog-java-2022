package br.com.senaisp.classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class CadastroCliente {
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	private ConexaoBD conn;
	private boolean haErro;
	private String msgErro;

	public CadastroCliente() {
		conn = ConexaoBD.getInstance();
	}

	// criando cliente
	public void criar() {
		try {
			conn.conectarBD();
			String sql = "insert into cadastro_cliente (nome, cpf, telefone, endereco, numero, complemento, bairro, cep, cidade, estado) \r\n  values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = conn.getConector().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, nome);
			stmt.setString(2, cpf);
			stmt.setString(3, telefone);
			stmt.setString(4, endereco);
			stmt.setString(5, numero);
			stmt.setString(6, complemento);
			stmt.setString(7, bairro);
			stmt.setString(8, cep);
			stmt.setString(9, cidade);
			stmt.setString(10, estado);

			stmt.executeUpdate();
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			id = rs.getInt(1);
			System.out.println("ID ->" + id);
			conn.desconectarBD();

		} catch (SQLException e) {
			haErro = true;
			msgErro = e.getMessage();
		}

	}

	// lendo cliente
	public boolean ler() {
		boolean ret = false;
		try {
			conn.conectarBD();
			String sql = "select * from cadastro_cliente where id = ?";
			PreparedStatement stmt = conn.getConector().prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				nome = rs.getString(2);
				cpf = rs.getString(3);
				telefone = rs.getString(4);
				endereco = rs.getString(5);
				numero = rs.getString(6);
				complemento = rs.getString(7);
				bairro = rs.getString(8);
				cep = rs.getString(9);
				cidade = rs.getString(10);
				estado = rs.getString(11);
				ret = true;

			}
		} catch (SQLException e) {
			haErro = true;
			msgErro = e.getMessage();
		}
		return ret;
	}

	// alterar cliente
	public void alterar() {
		try {
			conn.conectarBD();
			String sql = "update cadastro_cliente set nome =?,cpf =?,telefone =?,endereco =?,numero =?,complemento =?,bairro =?,cep =?,cidade =?,estado =? where id = ?";
			PreparedStatement stmt = conn.getConector().prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setString(2, cpf);
			stmt.setString(3, telefone);
			stmt.setString(4, endereco);
			stmt.setString(5, numero);
			stmt.setString(6, complemento);
			stmt.setString(7, bairro);
			stmt.setString(8, cep);
			stmt.setString(9, cidade);
			stmt.setString(10, estado);

			stmt.setInt(11, id);
			int rowsAff = stmt.executeUpdate();
			System.out.println("Linhas alteradas: " + rowsAff);
			conn.desconectarBD();

		} catch (SQLException e) {
			haErro = true;
			msgErro = e.getMessage();
		}
	}

	// apagar cliente
	public void apagar() {
		try {
			conn.conectarBD();
			String sql = "delete from cadastro_cliente where id = ?";
			PreparedStatement stmt = conn.getConector().prepareStatement(sql);

			stmt.setInt(1, id);
			int rowAff = stmt.executeUpdate();
			System.out.println("Linhas apagadas:" + rowAff);
			conn.desconectarBD();

		} catch (SQLException e) {
			haErro = true;
			msgErro = e.getMessage();
		}
	}

	// Tabela
	public DefaultTableModel listaCliente() {
		DefaultTableModel ret = null;
		try {
			conn.conectarBD();
			String sql = "select * from cadastro_cliente order by id";
			PreparedStatement stmt = conn.getConector().prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();
			ResultSetMetaData rsm = stmt.getMetaData();

			String titulos[] = new String[rsm.getColumnCount()];
			for (int intI = 1; intI <= rsm.getColumnCount(); intI++) {
				titulos[intI - 1] = rsm.getColumnName(intI);
			}

			ret = new DefaultTableModel(titulos, 0);
			while (rs.next()) {
				Object obj[] = new Object[rsm.getColumnCount()];
				for (int intI = 1; intI <= rsm.getColumnCount(); intI++) {
					obj[intI - 1] = rs.getString(intI);
				}

			}

		} catch (SQLException e) {
			haErro = true;
			msgErro = e.getMessage();
		}
		return ret;

	}
	
	
	// Find by Nome
		public boolean findByNome(String value ) {
			boolean ret = false;
			try {
				conn.conectarBD();
				String sql = "select * from cadastro_cliente where nome = ?";
				PreparedStatement stmt = conn.getConector().prepareStatement(sql);
				stmt.setString(1, value);
				ResultSet rs = stmt.executeQuery();
				if (rs.next()) {
					nome = rs.getString(2);
					cpf = rs.getString(3);
					telefone = rs.getString(4);
					endereco = rs.getString(5);
					numero = rs.getString(6);
					complemento = rs.getString(7);
					bairro = rs.getString(8);
					cep = rs.getString(9);
					cidade = rs.getString(10);
					estado = rs.getString(11);
					ret = true;

				}
			} catch (SQLException e) {
				haErro = true;
				msgErro = e.getMessage();
			}
			return ret;
		}
	
	
	

	// getters e setters
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean isHaErro() {
		return haErro;
	}

	public void setHaErro(boolean haErro) {
		this.haErro = haErro;
	}

	public String getMsgErro() {
		return msgErro;
	}

	public void setMsgErro(String msgErro) {
		this.msgErro = msgErro;
	}

}
