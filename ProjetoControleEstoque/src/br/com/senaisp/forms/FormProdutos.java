package br.com.senaisp.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.com.senaisp.classes.Produto;

public class FormProdutos extends JFrame {

	private JPanel contentPane;
	private JTable tblProdutos;
	private Produto prod;
	private DefaultTableModel tblMdProdutos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormProdutos frame = new FormProdutos();
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
	public FormProdutos() {
		EventoClick evt = new EventoClick();

		setTitle("Manuten\u00E7\u00E3o de Produtos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.SOUTH);

		JButton btnAdicionar = new JButton("Adicionar");
		pnlBotoes.add(btnAdicionar);
		btnAdicionar.addActionListener(evt);

		JButton btnConsultar = new JButton("Consultar");
		pnlBotoes.add(btnConsultar);
		btnConsultar.addActionListener(evt);

		JButton btnAlterar = new JButton("Alterar");
		pnlBotoes.add(btnAlterar);
		btnAlterar.addActionListener(evt);

		JButton btnExcluir = new JButton("Excluir");
		pnlBotoes.add(btnExcluir);
		btnExcluir.addActionListener(evt);
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		prod = new Produto();

		tblMdProdutos = prod.getListaProdutos();

		tblProdutos = new JTable(tblMdProdutos);

		scrollPane.setViewportView(tblProdutos);
	}

	class EventoClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton ob = (JButton) e.getSource();
			FormProdutosManutencao fmprod = new FormProdutosManutencao();

			switch (ob.getText()) {
			case "Adicionar":
				fmprod.setTipoOperacao(1);
				break;
			case "Consultar":
				fmprod.setTipoOperacao(2);
				break;
			case "Alterar":
				fmprod.setTipoOperacao(3);
				break;
			case "Excluir":
				fmprod.setTipoOperacao(4);
				break;
			}
			int linhaSel = -1;
			if (fmprod.getTipoOperacao() == 1) {
				prod.novo();
				linhaSel = 0;
			} else {
				linhaSel = tblProdutos.getSelectedRow();
				if (linhaSel > -1) {
					int idProd = (int) tblMdProdutos.getValueAt(linhaSel, 0);
					// Posicionando o ID
					prod.setId(idProd);
					// efetuando a leitura
					if (!prod.read()) {
						JOptionPane.showMessageDialog(null, "Produto não encontrado!");
					}
				} else {
					JOptionPane.showMessageDialog(null, 
			"Favor Selecionar uma linha para a operação!");
				}
			}
			// Setando o produto
			if (linhaSel>-1) {
				fmprod.setProd(prod);
				fmprod.setVisible(true);
			}
		}

	}
}
