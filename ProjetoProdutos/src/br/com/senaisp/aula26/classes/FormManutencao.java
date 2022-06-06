package br.com.senaisp.aula26.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.FlowLayout;

public class FormManutencao extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormManutencao frame = new FormManutencao();
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
	public FormManutencao() {
		setTitle("Manuten\u00E7\u00E3o de Produtos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 672, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelBotoes = new JPanel();
		contentPane.add(panelBotoes, BorderLayout.SOUTH);
		
		JButton btnGravar = new JButton("Gravar");
		panelBotoes.add(btnGravar);
		
		JButton btnCancelar = new JButton("Cancelar");
		panelBotoes.add(btnCancelar);
		
		JPanel panelCorpo = new JPanel();
		contentPane.add(panelCorpo, BorderLayout.NORTH);
		panelCorpo.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panelCodigo = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelCodigo.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelCorpo.add(panelCodigo);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		panelCodigo.add(lblCodigo);
		
		textCodigo = new JTextField();
		panelCodigo.add(textCodigo);
		textCodigo.setColumns(10);
		
		JPanel panelDescricao = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelDescricao.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelCorpo.add(panelDescricao);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		panelDescricao.add(lblDescricao);
		
		textDescricao = new JTextField();
		panelDescricao.add(textDescricao);
		textDescricao.setColumns(30);
		
		JPanel panelPreco = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelPreco.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panelCorpo.add(panelPreco);
		
		JLabel lblPreco = new JLabel("Pre\u00E7o");
		panelPreco.add(lblPreco);
		
		JFormattedTextField fmtPreco = new JFormattedTextField();
		fmtPreco.setColumns(10);
		panelPreco.add(fmtPreco);
	}

}
