package br.com.senaisp.aula28.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;
import javax.swing.text.NumberFormatter;

public class FormClienteManutencao extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JFormattedTextField fmtCodigo;
	private JFormattedTextField fmtDtNasc;
	private DefaultTableModel tblMdCli;
	private int linhaSelecionada;
	private int tipoOperacao; //1-criar, 2-Consultar, 3-Alterar, 4-Excluir
	private DateFormat fmtDt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormClienteManutencao frame = new FormClienteManutencao();
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
	public FormClienteManutencao() {
		setTitle("Manuten\u00E7\u00E3o Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.SOUTH);
		
		JButton btnConfirmar = new JButton("Confirmar");
		pnlBotoes.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar\r\n");
		pnlBotoes.add(btnCancelar);
		
		JPanel pnlCorpo = new JPanel();
		contentPane.add(pnlCorpo, BorderLayout.NORTH);
		pnlCorpo.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel pnlCodigo = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlCodigo.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlCodigo);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		pnlCodigo.add(lblCodigo);
		
		//formatando os numeros
		NumberFormat fmtNm = NumberFormat.getInstance();
		NumberFormatter fmtNmt = new NumberFormatter(fmtNm);
		fmtNmt.setValueClass (Integer.class);
		fmtNmt.setMinimum(0);
		fmtNmt.setMaximum(Integer.MAX_VALUE);
		fmtNmt.setAllowsInvalid(false);
		
		fmtCodigo = new JFormattedTextField(fmtNmt);
		fmtCodigo.setColumns(10);
		pnlCodigo.add(fmtCodigo);
		fmtCodigo.setValue(0);
		
		JPanel pnlNome = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnlNome.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlNome);
		
		JLabel lblNome = new JLabel("Nome");
		pnlNome.add(lblNome);
		
		txtNome = new JTextField();
		pnlNome.add(txtNome);
		txtNome.setColumns(30);
		
		JPanel pnlTelefone = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnlTelefone.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone");
		pnlTelefone.add(lblTelefone);
		
		txtTelefone = new JTextField();
		pnlTelefone.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JPanel pnlDtNasc = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) pnlDtNasc.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlDtNasc);
		
		JLabel lblDtNasc = new JLabel("Dt. Nascimento");
		pnlDtNasc.add(lblDtNasc);
		
		fmtDt = new SimpleDateFormat("dd/MM/yyy");
		DateFormatter fmtDtt = new DateFormatter(fmtDt);
		
		fmtDtt.setAllowsInvalid(false);   
		fmtDtt.setOverwriteMode(true); //se esquecer de colocar isso, o usuario nao vai conseguir colocar a data correta
		
		fmtDtNasc = new JFormattedTextField(fmtDtt);
		fmtDtNasc.setColumns(10);
		pnlDtNasc.add(fmtDtNasc);
		fmtDtNasc.setValue(new Date()); //tem que ser o util date
	}

	public void setTblMdCli(DefaultTableModel tblMdCli) {
		this.tblMdCli = tblMdCli;
	}

	public void setLinhaSelecionada(int linhaSelecionada) {
		this.linhaSelecionada = linhaSelecionada;
	}

	public void setTipoOperacao(int tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
		switch (tipoOperacao) {
		case 2:
		case 3:
		case 4:
			fmtCodigo.setValue(tblMdCli.getValueAt(linhaSelecionada, 0));
			txtNome.setText((String)tblMdCli.getValueAt(linhaSelecionada, 1));
			txtTelefone.setText((String)tblMdCli.getValueAt(linhaSelecionada, 2));
			try {
				Date dtNasc = fmtDt.parse((String)tblMdCli.getValueAt(linhaSelecionada, 3));
				
				fmtDtNasc.setValue(contentPane);
				
			} catch (ParseException e) {
				
				e.printStackTrace();
				
			}
			
		}
	}

}
