package br.com.senaisp.forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;


import br.com.senaisp.forms.FormClienteManutencao.EventoClick;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class FormFotografoManutencao extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textNome;
	private JFormattedTextField fmtCPF;
	private JFormattedTextField fmtTelefone;
	private JTextField textEndereco;
	private JTextField textNumero;
	private JTextField textComplemento;
	private JTextField textBairro;
	private JTextField textCep;
	private JTextField textCidade;
	private JTextField textEstado;
	private JComboBox estilofotobox;

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
	public FormFotografoManutencao() {
		setForeground(Color.LIGHT_GRAY);
		setBackground(Color.GRAY);

		EventoClick evt = new EventoClick();
		

		setTitle("Manuten\u00E7\u00E3o de Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 200, 838, 530);
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
		pnlCorpo.setLayout(new GridLayout(12, 0, 0, 0));

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

		try {
			MaskFormatter fmtFone = new MaskFormatter("(##)#####-####");
			fmtTelefone = new JFormattedTextField(fmtFone);
			fmtTelefone.setText("(  )     -    ");
			pnlTelefone.add(fmtTelefone);
			fmtTelefone.setColumns(9);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

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
		
		JPanel pnlEstiloFoto = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) pnlEstiloFoto.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlEstiloFoto);
		
		JComboBox estilofotobox = new JComboBox();
		estilofotobox.setModel(new DefaultComboBoxModel(new String[] {"Estilo de Foto", "Festas", "Ensaios", "Newborn", "Comercial"}));
		pnlEstiloFoto.add(estilofotobox);
		
		estilofotobox.addActionListener(evt);
		
		JButton btnOK =  new JButton("OK");
		pnlEstiloFoto.add(btnOK);
		
		btnOK.addActionListener(evt);
		
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
			textId.setEnabled(false);
			textNome.setEnabled(tipoOperacao==1);
			fmtCPF.setEnabled(tipoOperacao==2);
			fmtTelefone.setEnabled(tipoOperacao==3);
			textEndereco.setEnabled(tipoOperacao==4);
			textComplemento.setEnabled(tipoOperacao==5);
			textNumero.setEnabled(tipoOperacao==6);
			textBairro.setEnabled(tipoOperacao==7);
			textCep.setEnabled(tipoOperacao==8);
			textCidade.setEnabled(tipoOperacao==9);
			textEstado.setEnabled(tipoOperacao==10);
			estilofotobox.setEditable(tipoOperacao ==11);
			
			textId.setText((String)tblMdCli.getValueAt(linhaSelecionada, 0));
			textNome.setText((String)tblMdCli.getValueAt(linhaSelecionada, 1));
			fmtCPF.setValue(tblMdCli.getValueAt(linhaSelecionada, 2));
			fmtTelefone.setText((String)tblMdCli.getValueAt(linhaSelecionada, 3));
			textEndereco.setText((String)tblMdCli.getValueAt(linhaSelecionada, 4));
			textComplemento.setText((String)tblMdCli.getValueAt(linhaSelecionada, 5));
			textNumero.setText((String)tblMdCli.getValueAt(linhaSelecionada, 6));
			textBairro.setText((String)tblMdCli.getValueAt(linhaSelecionada, 7));
			textCep.setText((String)tblMdCli.getValueAt(linhaSelecionada, 8));
			textCidade.setText((String)tblMdCli.getValueAt(linhaSelecionada, 9));
			textEstado.setText((String)tblMdCli.getValueAt(linhaSelecionada, 10));
			estilofotobox.setToolTipText((String)tblMdCli.getValueAt(linhaSelecionada, 11));
						
			}
					
			
		}
	

	public void setBtnConfirmar(JButton btnConfirmar) {
		this.btnConfirmar = btnConfirmar;
	}

	public JComboBox getTextEstiloFoto() {
		return estilofotobox;
	}

	public void setTextEstiloFoto(JTextField textEstiloFoto) {
		this.estilofotobox = estilofotobox;
	}

	class EventoClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object cmp = e.getSource();
			switch (((JButton) cmp).getText()) {
			case "Confirmar":
				switch (tipoOperacao) {
				case 1:
					Object it[] = { textId.getText(), textNome.getText(), fmtCPF.getValue(),  fmtTelefone.getText(), textEndereco.getText(), textNumero.getText(), textComplemento.getText() +
							textBairro.getText(), textCep.getText(), textCidade.getText(),textEstado.getText()};
					tblMdCli.addRow(it);
					break;
				case 2:
					tblMdCli.setValueAt(textNome.getText(), linhaSelecionada, 1);
					tblMdCli.setValueAt(fmtCPF.getValue(), linhaSelecionada, 2);
					tblMdCli.setValueAt(fmtTelefone.getText(), linhaSelecionada, 3);
					tblMdCli.setValueAt(textEndereco.getText(), linhaSelecionada, 4);
					tblMdCli.setValueAt(textNumero.getText(), linhaSelecionada, 5);
					tblMdCli.setValueAt(textComplemento.getText(), linhaSelecionada, 6);
					tblMdCli.setValueAt(textBairro.getText(), linhaSelecionada, 7);
					tblMdCli.setValueAt(textCep.getText(), linhaSelecionada, 8);
					tblMdCli.setValueAt(textCidade.getText(), linhaSelecionada, 9);
					tblMdCli.setValueAt(textEstado.getText(), linhaSelecionada, 10);
					

					break;
				case 3:
					tblMdCli.removeRow(linhaSelecionada);
					break;
				}
			case "Cancelar":
				dispose();
			}
		}

	}

	
	
	
}
