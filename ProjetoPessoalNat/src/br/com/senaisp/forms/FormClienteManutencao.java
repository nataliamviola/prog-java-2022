package br.com.senaisp.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class FormClienteManutencao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnConfirmar = new JButton("Confirmar");
		panel.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel.add(btnCancelar);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(10, 0, 0, 0));
		
		JPanel pnlId = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlId.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_1.add(pnlId);
		
		JLabel lblId = new JLabel("Id");
		pnlId.add(lblId);
		
		textField = new JTextField();
		pnlId.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_3.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_4.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_5.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_1.add(panel_6);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_6.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_1.add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		panel_7.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		panel_7.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_1.add(panel_8);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel_8.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		panel_8.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_1.add(panel_9);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		panel_9.add(lblNewLabel_7);
		
		textField_7 = new JTextField();
		panel_9.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_10 = new JPanel();
		panel_1.add(panel_10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		panel_10.add(lblNewLabel_8);
		
		textField_8 = new JTextField();
		panel_10.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_11 = new JPanel();
		panel_1.add(panel_11);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		panel_11.add(lblNewLabel_9);
		
		textField_9 = new JTextField();
		panel_11.add(textField_9);
		textField_9.setColumns(10);
	}

}
