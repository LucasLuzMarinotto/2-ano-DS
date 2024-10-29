package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class atualizarAmigos extends JFrame {

	private JPanel contentPane;
	private JTextField digiteNome;
	private JTextField digiteApelido;
	private JTextField digiteTelefone;
	private JTextField digiteID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atualizarAmigos frame = new atualizarAmigos();
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
	public atualizarAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setHorizontalAlignment(SwingConstants.CENTER);
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelNome.setBounds(154, 159, 123, 74);
		contentPane.add(labelNome);
		
		digiteNome = new JTextField();
		digiteNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		digiteNome.setColumns(10);
		digiteNome.setBounds(312, 181, 200, 32);
		contentPane.add(digiteNome);
		
		digiteApelido = new JTextField();
		digiteApelido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		digiteApelido.setColumns(10);
		digiteApelido.setBounds(312, 241, 200, 32);
		contentPane.add(digiteApelido);
		
		JLabel labelApelido = new JLabel("Apelido");
		labelApelido.setHorizontalAlignment(SwingConstants.CENTER);
		labelApelido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelApelido.setBounds(154, 222, 123, 69);
		contentPane.add(labelApelido);
		
		JLabel labelTelefone = new JLabel("Telefone");
		labelTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		labelTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTelefone.setBounds(154, 286, 123, 51);
		contentPane.add(labelTelefone);
		
		digiteTelefone = new JTextField();
		digiteTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		digiteTelefone.setColumns(10);
		digiteTelefone.setBounds(312, 299, 200, 32);
		contentPane.add(digiteTelefone);
		
		JButton botaoCadatrar = new JButton("Atualizar");
		botaoCadatrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botaoCadatrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoCadatrar.setBackground(new Color(135, 206, 250));
		botaoCadatrar.setBounds(131, 380, 170, 102);
		contentPane.add(botaoCadatrar);
		
		JButton botaoVoltar = new JButton("Voltar");
		botaoVoltar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoVoltar.setBackground(new Color(135, 206, 250));
		botaoVoltar.setBounds(413, 380, 170, 102);
		contentPane.add(botaoVoltar);
		
		JLabel tituloPagina = new JLabel("Atualizar de Amigos");
		tituloPagina.setHorizontalAlignment(SwingConstants.CENTER);
		tituloPagina.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tituloPagina.setBounds(222, 17, 227, 85);
		contentPane.add(tituloPagina);
		
		JLabel labelOfID = new JLabel("ID");
		labelOfID.setHorizontalAlignment(SwingConstants.CENTER);
		labelOfID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelOfID.setBounds(154, 96, 123, 74);
		contentPane.add(labelOfID);
		
		digiteID = new JTextField();
		digiteID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		digiteID.setColumns(10);
		digiteID.setBounds(312, 113, 200, 32);
		contentPane.add(digiteID);
	}
}