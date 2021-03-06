package br.com.senaisp.aula16;

import java.util.Scanner;

import br.com.senaisp.aula16.classes.Clientes;
import br.com.senaisp.aula16.classes.ParametroInvalidoException;

public class Aula16Exe02 {
	public static final int LIMITE_CLIENTE = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clientes cliVetor[] = new Clientes[LIMITE_CLIENTE];
		Scanner sc = new Scanner(System.in);
		int intOpc;
		do {
			System.out.println("Menu de Op??es:");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Consulta");
			System.out.println("3 - Altera??o");
			System.out.println("4 - Exclus?o");
			System.out.println("5 - Listagem");
			System.out.println("9 - Fim");
			System.out.println("Digite a sua Op??o");
			intOpc = sc.nextInt();
			sc.nextLine();
			switch (intOpc) {
			case 1:
				cadastrarCliente(cliVetor, sc);
				break;
			case 2:
				System.out.println("Consulta de Clientes");
				consultaCliente(cliVetor, sc);
				break;
			case 3:
				alteracaoCliente(cliVetor, sc);
				sc.nextLine();
				break;
			case 4:
				exclusaoCliente(cliVetor, sc);
				break;
			case 5:
				listagemCliente(cliVetor, sc);
				break;
			}
			System.out.println("Tecle enter para continuar");
			sc.nextLine();
		} while (intOpc != 9);
	}

	private static void listagemCliente(Clientes[] cliVetor, Scanner sc) {
		System.out.println("Listagem de clientes");
		System.out.println("#   - Cod - Nome");
		for (int intI = 0; intI <LIMITE_CLIENTE; intI++) {
			if (cliVetor [intI]!=null) {
				//mostra com 3 posi??es de string
				//o que faltar para 3 ele preenche com branco
				System.out.print(String.format("%3s", intI + ""));
				System.out.print(" - ");
				System.out.print(String.format("%3s", cliVetor [intI].getCodigo() + ""));
				System.out.println(" - " + cliVetor [intI].getNome());
			}
			
		}
	}

	private static void exclusaoCliente(Clientes[] cliVetor, Scanner sc) {
		System.out.println("Exclus?o de Cliente");
		int intCod = consultaCliente(cliVetor, sc);
		if (intCod > -1)
			System.out.println("Confirma a exclus?o? 1-sim, 2-n?o");
		int intRes = sc.nextInt();
		if (intRes == 1) {
			cliVetor[intCod] = null;
			System.out.println("Cliente exclu?do com sucesso");
		}

	}

	private static void alteracaoCliente(Clientes[] cliVetor, Scanner sc) {
		System.out.println("Altera??o de Cliente");
		int intCod = consultaCliente(cliVetor, sc);
		if (intCod > -1)
			efetuarCadastro(cliVetor[intCod], sc);
	}

	private static int consultaCliente(Clientes[] cliVetor, Scanner sc) {
		int intRet = -1, intCod;
		System.out.println("Digite o c?digo a ser pesquisado");
		intCod = sc.nextInt();
		for (int intI = 0; intI < LIMITE_CLIENTE; intI++) {
			if (cliVetor[intI] != null && cliVetor[intI].getCodigo() == intCod) {
				intRet = intI;
				System.out.println("Cliente encontrado!");
				System.out.println("C?digo  :" + cliVetor[intI].getCodigo());
				System.out.println("Nome    :" + cliVetor[intI].getNome());
				System.out.println("Endere?o:" + cliVetor[intI].getEndereco());
				break;
			}
		}

		return intRet;
	}

	private static int getIdLivre(Clientes[] cliVetor) {
		int intRet = -1;
		for (int intI = 0; intI < LIMITE_CLIENTE; intI++) {
			if (cliVetor[intI] == null) {
				intRet = intI;
				break;
			}
		}
		return intRet;
	}

	private static void cadastrarCliente(Clientes[] cliVetor, Scanner sc) {
		System.out.println("Cadastramento de Clientes");
		int intLivre = getIdLivre(cliVetor);
		if (intLivre > -1) {
			// criando o objeto cliente e atribuindo ao vetor
			cliVetor[intLivre] = new Clientes();
			efetuarCadastro(cliVetor[intLivre], sc);

		} else {
			System.out.println("sem espa?o para mais cadstro");
		}
	}

	private static void efetuarCadastro(Clientes clientes, Scanner sc) {
		// entrada do codigo
		do {
			System.out.println("Digite o c?digo");
			try {
				clientes.setCodigo(sc.nextInt());
				sc.nextLine();
				break;
			} catch (ParametroInvalidoException e) {
				System.out.println(e.getMessage());
			} catch (Exception e1) {
				System.out.println("Ocorreu entrada inv?lida!");
				sc.nextLine();
			}
		} while (true);

		// entrada do nome
		do {
			System.out.println("Digite o nome:");
			try {
				clientes.setNome(sc.nextLine());
				break;
			} catch (ParametroInvalidoException e) {
				System.out.println(e.getMessage());
			}

		} while (true);

		// entrada do endereco
		do {
			System.out.println("Digite o endere?o");
			try {
				clientes.setEndereco(sc.nextLine());
				break;
			} catch (ParametroInvalidoException e) {
				System.out.println(e.getMessage());
			}

		} while (true);

	}

}
