package br.com.senaisp.aula28.classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTable tblClientes;
	private DefaultTableModel tblMdCli;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.SOUTH);
		
		JButton btnAdicionar = new JButton("Adicionar");
		pnlBotoes.add(btnAdicionar);
		
		JButton btnConsultar = new JButton("Consultar");
		pnlBotoes.add(btnConsultar);
		
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//criando a alteração de cliente a partir da linha selecionada
				FormClienteManutencao fmtCli = new FormClienteManutencao();
				fmtCli.setTblMdCli (tblMdCli);
				fmtCli.setLinhaSelecionada(tblClientes.getSelectedRow());
				fmtCli.setTipoOperacao(3);
				fmtCli.setVisible(true);
				
			}
		});
		pnlBotoes.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		pnlBotoes.add(btnExcluir);
		
		JScrollPane scrClientes = new JScrollPane();
		contentPane.add(scrClientes, BorderLayout.CENTER);
		
		
		String titulos [] = {"Código", "Nome", "Telefone", "Dt Nascimento"};
		
		tblMdCli = new DefaultTableModel (titulos,0) {
			//desabilitando a edição das celulas
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tblClientes = new JTable(tblMdCli) { //toda a parte estetica da tabela é criada aqui
			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component cmp = super.prepareRenderer(renderer, row, column);
				if (!isCellSelected(row, column)) {
					//so nao aplicamos a cor quando a linha esta selecionada
					cmp.setBackground(row%2==0? Color.WHITE: Color.LIGHT_GRAY); //operador ternario para economizar a escrita com if. 
					//No caso, se for linha par ele coloca branco e linha impar coloca cinza
				}
				//alinhando a coluna do codigo
				if (column==0) {
					((JLabel)cmp).setHorizontalAlignment(SwingConstants.RIGHT);					
				}else {
					((JLabel)cmp).setHorizontalAlignment(SwingConstants.LEFT);						
				}
				
				//colocando o espaçamento na borda da coluna do codigo
				((JLabel)cmp).setBorder(BorderFactory.createEmptyBorder(0,5,0,5)); //medida em pixels
				
				return cmp;
			}
			
			
		};
		scrClientes.setViewportView(tblClientes);
		
		//obtendo o objeto de calendario rpa utilizar as datas
		Calendar cal = Calendar.getInstance();
		//obtendo o objeto formatador de datas
		DateFormat fmtDt = new SimpleDateFormat("dd/MM/yyyy"); //M maiusculo para mes, o m minusculo é usado para minutos
		
		
		for (int lin=1; lin<=5; lin++) {
			cal.set(1980,0,lin); //formatação do proprio set do calendario com ano, mes e dia
			
			Date dtNasc = cal.getTime (); //na hora de importar o date, colocar como date.utils
			Object item[] = {lin, "Cliente " + lin, "(14) 99876-0987", fmtDt.format(dtNasc)};
			
			//adicionando o item à linha conjunto de dados
			tblMdCli.addRow(item);
			
			
		}
		}
		
	}


