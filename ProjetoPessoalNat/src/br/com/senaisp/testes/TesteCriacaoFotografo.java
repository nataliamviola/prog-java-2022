package br.com.senaisp.testes;

import java.sql.SQLException;

import br.com.senaisp.classes.CadastroCliente;
import br.com.senaisp.classes.CadastroFotografo;

public class TesteCriacaoFotografo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroFotografo fot = new CadastroFotografo();
		fot.setNome("Natalia");
		fot.setCpf("3254696582");
		fot.setTelefone("98536-6544");
		fot.setEndereco("Rua Dois");
		fot.setNumero("8-78");
		fot.setComplemento("ap 98");
		fot.setBairro("Das Flores");
		fot.setCep("17056874");
		fot.setCidade("Bauru");
		fot.setEstado("São Paulo");
		fot.setEstilofoto("Retrato");
		
		fot.criar ();

	}

}
