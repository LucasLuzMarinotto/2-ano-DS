package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class cadastroAmigos extends JFrame {

	private JPanel contentPane;
	private JTextField digiteNome;
	private JTextField digiteApelido;
	private JTextField digiteTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroAmigos frame = new cadastroAmigos();
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
	public cadastroAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botaoCadatrar = new JButton("Cadastrar");
		botaoCadatrar.setBackground(new Color(135, 206, 250));
		botaoCadatrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoCadatrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCadatrar.setBounds(80, 391, 170, 102);
		contentPane.add(botaoCadatrar);
		
		JLabel labelTelefone = new JLabel("Telefone");
		labelTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		labelTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTelefone.setBounds(103, 297, 123, 51);
		contentPane.add(labelTelefone);
		
		JLabel labelApelido = new JLabel("Apelido");
		labelApelido.setHorizontalAlignment(SwingConstants.CENTER);
		labelApelido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelApelido.setBounds(103, 190, 123, 69);
		contentPane.add(labelApelido);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelNome.setBounds(103, 89, 123, 74);
		contentPane.add(labelNome);
		
		JLabel tituloPagina = new JLabel("Cadastro de Amigos");
		tituloPagina.setHorizontalAlignment(SwingConstants.CENTER);
		tituloPagina.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tituloPagina.setBounds(170, 11, 227, 85);
		contentPane.add(tituloPagina);
		
		digiteNome = new JTextField();
		digiteNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		digiteNome.setBounds(261, 114, 200, 32);
		contentPane.add(digiteNome);
		digiteNome.setColumns(10);
		
		digiteApelido = new JTextField();
		digiteApelido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		digiteApelido.setBounds(261, 212, 200, 32);
		contentPane.add(digiteApelido);
		digiteApelido.setColumns(10);
		
		digiteTelefone = new JTextField();
		digiteTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		digiteTelefone.setBounds(261, 310, 200, 32);
		contentPane.add(digiteTelefone);
		digiteTelefone.setColumns(10);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBackground(new Color(135, 206, 250));
		botaoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoVoltar.setBounds(362, 391, 170, 102);
		contentPane.add(botaoVoltar);
	}
}