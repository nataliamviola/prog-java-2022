package br.com.senaisp.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JFormattedTextField;

public class FormClienteManutencao extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JTextField textTelefone;
	private JTextField textEndereco;
	private JTextField textNumero;
	private JTextField textComplemento;
	private JTextField textBairro;
	private JTextField textCep;
	private JTextField textCidade;
	private JTextField textEstado;
	
	private JFormattedTextField fmtCPF;
	
	private DefaultTableModel tblMdCli;
	private int linhaSelecionada;
	private int tipoOperacao; 
	private JButton btnConfirmar;

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
		
		EventoClick evt = new EventoClick();
		
		setTitle("Manuten\u00E7\u00E3o de Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 557, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.SOUTH);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBackground(Color.LIGHT_GRAY);
		pnlBotoes.add(btnConfirmar);
		btnConfirmar.addActionListener(evt);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.LIGHT_GRAY);
		pnlBotoes.add(btnCancelar);
		btnCancelar.addActionListener(evt);
		
		JPanel pnlCorpo = new JPanel();
		contentPane.add(pnlCorpo, BorderLayout.NORTH);
		pnlCorpo.setLayout(new GridLayout(11, 0, 0, 0));
		
		JPanel pnlId = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlId.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlId);
		
		JLabel lblId = new JLabel("Id");
		pnlId.add(lblId);
		
		textId = new JTextField();
		pnlId.add(textId);
		textId.setColumns(10);
		
		JPanel pnlNome = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) pnlNome.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlNome);
		
		JLabel lblNome = new JLabel("Nome");
		pnlNome.add(lblNome);
		
		textNome = new JTextField();
		pnlNome.add(textNome);
		textNome.setColumns(50);
		
		JPanel pnlCPF = new JPanel();
		FlowLayout fl_pnlCPF = (FlowLayout) pnlCPF.getLayout();
		fl_pnlCPF.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlCPF);
		
		JLabel lblCPF = new JLabel("CPF");
		pnlCPF.add(lblCPF);
		
		try {
			MaskFormatter fmtDoc = new MaskFormatter("###.###.###-##");
			fmtCPF = new JFormattedTextField(fmtDoc);
			fmtCPF.setColumns(15);
			pnlCPF.add(fmtCPF);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
						
			
		}
		
		
		
		JPanel pnlTelefone = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) pnlTelefone.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone");
		pnlTelefone.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setText("(  )      -");
		pnlTelefone.add(textTelefone);
		textTelefone.setColumns(10);
		
		JPanel pnlEndereco = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) pnlEndereco.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlEndereco);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		pnlEndereco.add(lblEndereco);
		
		textEndereco = new JTextField();
		pnlEndereco.add(textEndereco);
		textEndereco.setColumns(50);
		
		JPanel pnlNumero = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) pnlNumero.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlNumero);
		
		JLabel lblNumero = new JLabel("Numero");
		pnlNumero.add(lblNumero);
		
		textNumero = new JTextField();
		pnlNumero.add(textNumero);
		textNumero.setColumns(7);
		
		JPanel pnlComplemento = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) pnlComplemento.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlComplemento);
		
		JLabel lblComplemento = new JLabel("Complemento");
		pnlComplemento.add(lblComplemento);
		
		textComplemento = new JTextField();
		pnlComplemento.add(textComplemento);
		textComplemento.setColumns(20);
		
		JPanel pnlBairro = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) pnlBairro.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlBairro);
		
		JLabel lblBairro = new JLabel("Bairro");
		pnlBairro.add(lblBairro);
		
		textBairro = new JTextField();
		pnlBairro.add(textBairro);
		textBairro.setColumns(30);
		
		JPanel pnlCep = new JPanel();
		FlowLayout flowLayout_8 = (FlowLayout) pnlCep.getLayout();
		flowLayout_8.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlCep);
		
		JLabel lblCep = new JLabel("Cep");
		pnlCep.add(lblCep);
		
		textCep = new JTextField();
		pnlCep.add(textCep);
		textCep.setColumns(15);
		
		JPanel pnlCidade = new JPanel();
		FlowLayout flowLayout_9 = (FlowLayout) pnlCidade.getLayout();
		flowLayout_9.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlCidade);
		
		JLabel lblCidade = new JLabel("Cidade");
		pnlCidade.add(lblCidade);
		
		textCidade = new JTextField();
		pnlCidade.add(textCidade);
		textCidade.setColumns(40);
		
		JPanel pnlEstado = new JPanel();
		FlowLayout flowLayout_10 = (FlowLayout) pnlEstado.getLayout();
		flowLayout_10.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlEstado);
		
		JLabel lblEstado = new JLabel("Estado");
		pnlEstado.add(lblEstado);
		
		textEstado = new JTextField();
		pnlEstado.add(textEstado);
		textEstado.setColumns(40);
	}

	public void setTblMdCli(DefaultTableModel tblMdCli) {
		this.tblMdCli = tblMdCli;
	}

	public void setLinhaSelecionada(int linhaSelecionada) {
		this.linhaSelecionada = linhaSelecionada;
	}

	public void setTipoOperacao(int tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
		switch(tipoOperacao) {
		case 1:
		fmtCPF.setValue(tblMdCli.getValueAt(linhaSelecionada, 2));
		}
		
	}

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	class EventoClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object cmp = e.getSource();
			switch ( ((JButton) cmp).getText() ) {
			case "Confirmar" :
				switch (tipoOperacao) {
				case 1 :
					Object it[] = {
							textId.getText(),
							textNome.getText(),
							textTelefone.getText(),
							fmtCPF.getValue()
					};
					tblMdCli.addRow(it);
					break;
				case 3 :
					tblMdCli.setValueAt(textNome.getText(),linhaSelecionada, 1);
					tblMdCli.setValueAt(fmtCPF.getValue(), linhaSelecionada, 2);
					tblMdCli.setValueAt(textTelefone.getText(),linhaSelecionada, 3);
					fazer a adi��o dos outros itens de acordo com a ordem no design
					
					
					break;
				case 4 :
					tblMdCli.removeRow(linhaSelecionada);
					break;
				}
			case "Cancelar":
				dispose();
			}
		}
		
	}
	
}
