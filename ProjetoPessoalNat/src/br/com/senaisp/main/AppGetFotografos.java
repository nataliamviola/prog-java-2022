package br.com.senaisp.main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;

public class AppGetFotografos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGetFotografos window = new AppGetFotografos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppGetFotografos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnCadastro.add(mntmCliente);
		
		JMenuItem mntmFotografo = new JMenuItem("Fot\u00F3grafo");
		mnCadastro.add(mntmFotografo);
		
		JSeparator separator = new JSeparator();
		mnCadastro.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnCadastro.add(mntmSair);
	}

}
