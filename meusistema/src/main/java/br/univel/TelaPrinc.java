package br.univel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrinc extends JFrame {

	private JPanel contentPane;
	protected JTextField txfId;
	protected JTextField txfNome;
	protected JTextField txfCor;
	protected JTextField txfNumMotores;
	protected JTable table;
	protected JButton btnNovo;
	protected JButton btnSalvar;
	protected JButton btnExcluir;
	protected JLabel labelAlerta;
	private JMenuBar menuBar;
	private JMenu mnFile;
	protected JMenuItem mntmExportpdf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrinc frame = new TelaPrinc();
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
	public TelaPrinc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmExportpdf = new JMenuItem("Export .pdf");
		mnFile.add(mntmExportpdf);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		panel.add(lblId, gbc_lblId);
		
		txfId = new JTextField();
		GridBagConstraints gbc_txfId = new GridBagConstraints();
		gbc_txfId.anchor = GridBagConstraints.WEST;
		gbc_txfId.insets = new Insets(0, 0, 5, 5);
		gbc_txfId.gridx = 1;
		gbc_txfId.gridy = 0;
		panel.add(txfId, gbc_txfId);
		txfId.setColumns(30);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		panel.add(lblNome, gbc_lblNome);
		
		txfNome = new JTextField();
		GridBagConstraints gbc_txfNome = new GridBagConstraints();
		gbc_txfNome.insets = new Insets(0, 0, 5, 5);
		gbc_txfNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfNome.gridx = 1;
		gbc_txfNome.gridy = 1;
		panel.add(txfNome, gbc_txfNome);
		txfNome.setColumns(30);
		
		JLabel lblCor = new JLabel("Cor");
		GridBagConstraints gbc_lblCor = new GridBagConstraints();
		gbc_lblCor.anchor = GridBagConstraints.EAST;
		gbc_lblCor.insets = new Insets(0, 0, 0, 5);
		gbc_lblCor.gridx = 0;
		gbc_lblCor.gridy = 2;
		panel.add(lblCor, gbc_lblCor);
		
		txfNumMotores = new JTextField();
		GridBagConstraints gbc_txfCor = new GridBagConstraints();
		gbc_txfCor.gridwidth = 2;
		gbc_txfCor.insets = new Insets(0, 0, 0, 5);
		gbc_txfCor.anchor = GridBagConstraints.WEST;
		gbc_txfCor.gridx = 1;
		gbc_txfCor.gridy = 2;
		panel.add(txfNumMotores, gbc_txfCor);
		txfNumMotores.setColumns(30);
		
		JLabel lblNumMotores = new JLabel("Numero de Motores");
		GridBagConstraints gbc_lblNumMotores = new GridBagConstraints();
		gbc_lblNumMotores.anchor = GridBagConstraints.EAST;
		gbc_lblNumMotores.insets = new Insets(0, 0, 0, 5);
		gbc_lblNumMotores.gridx = 0;
		gbc_lblNumMotores.gridy = 3;
		panel.add(lblNumMotores, gbc_lblNumMotores);
		
		txfNumMotores = new JTextField();
		GridBagConstraints gbc_txfNumMotores = new GridBagConstraints();
		gbc_txfNumMotores.gridwidth = 2;
		gbc_txfNumMotores.insets = new Insets(0, 0, 0, 5);
		gbc_txfNumMotores.anchor = GridBagConstraints.WEST;
		gbc_txfNumMotores.gridx = 1;
		gbc_txfNumMotores.gridy = 3;
		panel.add(txfNumMotores, gbc_txfNumMotores);
		txfNumMotores.setColumns(30);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.VERTICAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		btnNovo = new JButton("Novo");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.anchor = GridBagConstraints.EAST;
		gbc_btnNovo.insets = new Insets(0, 0, 0, 5);
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 0;
		panel_1.add(btnNovo, gbc_btnNovo);
		
		btnSalvar = new JButton("Salvar");
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.gridx = 1;
		gbc_btnSalvar.gridy = 0;
		panel_1.add(btnSalvar, gbc_btnSalvar);
		
		btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.gridx = 2;
		gbc_btnExcluir.gridy = 0;
		panel_1.add(btnExcluir, gbc_btnExcluir);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

}
