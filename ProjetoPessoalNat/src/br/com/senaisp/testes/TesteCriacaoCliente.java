package br.com.senaisp.testes;

import java.sql.SQLException;

import br.com.senaisp.classes.CadastroCliente;

public class TesteCriacaoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroCliente cli = new CadastroCliente();
		cli.setNome("Natalia");
		cli.setEndereco("Rua Dois");
		cli.setCpf("325.469.658-2");
		cli.setTelefone("98536-6544");
		
		try {
			cli.criar ();
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
