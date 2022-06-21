package br.com.senaisp.aula30.classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Cliente {
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private Date dtNascimento;
	//private String dtNasci;

	private List<Object[]> lstClientes;
	private DateFormat dtFmt;

	// metodo
	public Cliente() {
		lstClientes = new ArrayList<Object[]>();
		nome = "";
		idade = 0;
		cpf = "";
		rg = "";
		dtFmt = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dtNascimento = dtFmt.parse("30/12/1899");

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public List<Object[]> getLstClientes() {
		return lstClientes;
	}

	public enum TipoArquivo {
		CSV, JSON, XML
	}

	public boolean importarArquivo(String strArquivo, TipoArquivo tpArq) {
		boolean ret = false;
		switch (tpArq) {
		case CSV:
			ret = lerCSV(strArquivo);
			break;
		case JSON:
			ret = lerJSON(strArquivo);
			break;
		case XML:
			ret = lerXML(strArquivo);
			break;

		}

		return ret;
	}
	

	public boolean exportarArquivo (String strArquivo, TipoArquivo tpArq) {
			boolean ret = false;
			switch (tpArq) {
			case CSV: ret = escreverCSV (strArquivo); break;
			case JSON: ret = escreverJSON (strArquivo); break;
			case XML: ret = escreverXML (strArquivo); break;
					
			}
			return ret;
		}
		
		
	private boolean escreverCSV(String strArquivo) {
		boolean ret = false;
		try {
			FileOutputStream fos = new FileOutputStream(strArquivo);
			OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
			BufferedWriter buf = new BufferedWriter(osw);
			//gravando o cabeçalho do arquivo CSV
			buf.write("nome,idade,cpf,rg,data_nasc\r\n");
			//usando o foreach para pegar os itens da lista
			for (Object it []: lstClientes) {
				buf.write(it[0] + ","); //nome
				buf.write(it[1] + ","); //idade
				buf.write(it[2] + ","); //cpf
				buf.write(it[3] + ","); //rg
				buf.write(dtFmt.format(it[4])); //data de nascimento
				buf.write("\r\n"); //quebra de linha
			}
			buf.close();
			ret = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	
	
	
	private boolean escreverJSON(String strArquivo) {
		boolean ret = false;
		try {
			FileOutputStream fos = new FileOutputStream(strArquivo);
			OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
			BufferedWriter buf = new BufferedWriter(osw);
			//criando objeto JSON Array
			JSONArray itens = new JSONArray();
			for (Object objs[]:lstClientes) {
				//criando o objeto JSON para colocar os campos nele
				JSONObject item = new JSONObject();
				item.put("nome", objs[0]);
				item.put("idade", objs[1]);
				item.put("cpf", objs[2]);
				item.put("rg", objs[3]);
				item.put("data_nasc",dtFmt.format(objs[4]));
				//adicionando item ao vetor
				itens.put(item);
			}
			//gravando o JSON em formato de String
			buf.write(itens.toString());
			buf.close();
			ret = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return ret;
	}

	
	
	private boolean escreverXML(String strArquivo) {
		// TODO Auto-generated method stub
		return false;
	}

	// criado os metodos
	private boolean lerXML(String strArquivo) {
		boolean ret = false;
		lstClientes.clear();
		try {
			FileInputStream fis = new FileInputStream(strArquivo);
			DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance(); // criando o arquivo xml
			DocumentBuilder build = fact.newDocumentBuilder(); // criando o xml e preparando pra leitura
			Document doc = build.parse(fis); // pegando o doc xml e transformando em objeto (DOM-padrao de leitura xml)
			// obtendo o elemento raiz
			Element noRoot = doc.getDocumentElement();
			// obtendo os elementos row
			NodeList listaNos = noRoot.getElementsByTagName("row");
			// Percorrendo os elementos
			for (int intI = 0; intI < listaNos.getLength(); intI++) {
				Node item = listaNos.item(intI);
				// verificando se é elemento xml
				if (item instanceof Element) {
					Element itt = (Element) item; // forçar um cast para ser elemento
					nome = itt.getElementsByTagName("nome").item(0).getTextContent();
					idade = Integer.parseInt(itt.getElementsByTagName("idade").item(0).getTextContent());
					cpf = itt.getElementsByTagName("cpf").item(0).getTextContent();
					rg = itt.getElementsByTagName("rg").item(0).getTextContent();
					dtNascimento = dtFmt.parse(itt.getElementsByTagName("data_nasc").item(0).getTextContent());
					//dtNasci = itt.getElementsByTagName("data_nasc").item(0).getTextContent();

					Object obj[] = { nome, idade, cpf, rg,dtNascimento };
					lstClientes.add(obj);
				}

			}
			ret = true;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return ret;
	}

	private boolean lerJSON(String strArquivo) {
		boolean ret = false;
		lstClientes.clear();
		try {
			FileInputStream fis = new FileInputStream(strArquivo);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(isr);
			StringBuilder stb = new StringBuilder();
			String linha;

			while ((linha = buf.readLine()) != null) {
				stb.append(linha);

			}
			buf.close(); // fecha o buffer de leitura do arquivo
			JSONArray itens = new JSONArray(stb.toString()); // criando o objeto veotr JSON a partir do texto JSON
			for (int intI = 0; intI < itens.length(); intI++) { // laço de repetição para ele ler os itens do arquivo,
																// pois no original esta separado por { e se caracteriza
																// como objeto Json
				JSONObject it = itens.getJSONObject(intI);
				Object obj[] = { it.getString("nome"), // pegar dentro do objeto a string cpm propriedade nome e etc
						it.getInt("idade"), // int porque no original esta sem aspas e como numero
						it.getString("cpf"), it.getString("rg"), it.getString("data_nasc") // use como texto ou como o
																							// de baixo
						// dtFmt.parse(it.getString("data_nasc"))
				};
				lstClientes.add(obj);
			}

			ret = true; // se ele percorrer e não achar erro,

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

	private boolean lerCSV(String strArquivo) {
		boolean ret = false;
		lstClientes.clear();
		try {
			FileInputStream fis = new FileInputStream(strArquivo);
			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader buf = new BufferedReader(isr);
			String linha = buf.readLine(); // nao ler a primeira linha que e o cabeçalho
			// lendo a partir da segunda linha
			while ((linha = buf.readLine()) != null) {
				// fazendo a quebra do arquivo pra obter os valores
				List<String> itens = Arrays.asList(linha.split("\\s*,\\s*")); // expressão regular que significa
																				// qualquer texto entre virgulas ou
																				// algum outro sinal (indicar o sinal
																				// adequado)
				dtNascimento = dtFmt.parse(itens.get(4));

				Object obj[] = { // nome, idade, cpf, rg, data nasc, sexo, signo
						itens.get(0), // nome
						Integer.parseInt(itens.get(1)), // idade
						itens.get(2), // cpf
						itens.get(3), // rg
						dtNascimento // data_nasc

				};
				lstClientes.add(obj);

			}
			buf.close(); // fecha o buffer de leitura do arquivo
			ret = true; // se ele percorrer e não achar erro,

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret;
	}

}
