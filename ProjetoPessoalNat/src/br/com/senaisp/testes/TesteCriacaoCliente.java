package br.com.senaisp.testes;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.senaisp.classes.CadastroCliente;

public class TesteCriacaoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CadastroCliente cli = new CadastroCliente();
		cli.setNome("Natalia");
		cli.setCpf("3254696582");
		cli.setTelefone("98536-6544");
		cli.setEndereco("Rua Dois");
		cli.setNumero("8-78");
		cli.setComplemento("ap 98");
		cli.setBairro("Das Flores");
		cli.setCep("17056874");
		cli.setCidade("Bauru");
		cli.setEstado("São Paulo");
		
		/*
		try {
			cli.criar ();
		}catch (SQLException e) {
			e.printStackTrace();
		}
*/
		cli.setId(1);
		if (cli.ler()) {
			System.out.println("Nome: " + cli.getNome());
			System.out.println("Cpf: " + cli.getCpf());
			System.out.println("Telefone: " + cli.getTelefone());
			System.out.println("Endereço: " + cli.getEndereco());
			System.out.println("Numero: " + cli.getNumero());
			System.out.println("Complemento: " + cli.getComplemento());
			System.out.println("Bairro: " + cli.getBairro());
			System.out.println("Cep: " + cli.getCep());
			System.out.println("Cidade: " + cli.getCidade());
			System.out.println("Estado: " + cli.getEstado());
			
			
			cli.setNome(cli.getNome() + " - Alterado");
			cli.setComplemento("Complemento colocado");
			cli.alterar();
			
			
			System.out.println("Confirma a exclusão? (Sim/Não)");
			Scanner scn = new Scanner(System.in);
			String conf = scn.nextLine();
			if (conf.equalsIgnoreCase("Sim")) {
				cli.apagar();
				System.out.println("Registro apagado com sucesso!");
			}
			scn.close();
			
		} else {
			System.out.println("Cliente não encontrado!");
		}
		
		
	}

}
