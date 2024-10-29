package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JEditorPane;

public class listarAmigos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listarAmigos frame = new listarAmigos();
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
	public listarAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Lucas Luz Marinotto");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(0, 0, 294, 54);
		contentPane.add(btnNewButton);
		
		JButton btnGustavoFernandes = new JButton("Gustavo Fernandes");
		btnGustavoFernandes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGustavoFernandes.setBounds(0, 51, 294, 54);
		contentPane.add(btnGustavoFernandes);
		
		JButton btnVittorNascimento = new JButton("Vittor Nascimento");
		btnVittorNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVittorNascimento.setBounds(0, 102, 294, 54);
		contentPane.add(btnVittorNascimento);
		
		JButton btnGustavoQuintanilia = new JButton("Gustavo Quintanilia");
		btnGustavoQuintanilia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGustavoQuintanilia.setBounds(0, 150, 294, 54);
		contentPane.add(btnGustavoQuintanilia);
		
		JButton btnGustavoBrayan = new JButton("Gustavo Brayan");
		btnGustavoBrayan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGustavoBrayan.setBounds(0, 201, 294, 54);
		contentPane.add(btnGustavoBrayan);
		
		JButton btnMoisesNascimento = new JButton("Moises Nascimento");
		btnMoisesNascimento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMoisesNascimento.setBounds(0, 249, 294, 54);
		contentPane.add(btnMoisesNascimento);
		
		JButton btnJaderGama = new JButton("Jader Gama");
		btnJaderGama.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnJaderGama.setBounds(0, 302, 294, 54);
		contentPane.add(btnJaderGama);
		
		JButton btnBarbara = new JButton("Barbara Samira");
		btnBarbara.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBarbara.setBounds(0, 351, 294, 54);
		contentPane.add(btnBarbara);
		
		JButton btnLucasSantanna = new JButton("Lucas Santana");
		btnLucasSantanna.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLucasSantanna.setBounds(0, 396, 294, 54);
		contentPane.add(btnLucasSantanna);
		
		JTextPane txtpnOi = new JTextPane();
		txtpnOi.setText("OI");
		txtpnOi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnOi.setBounds(350, 74, 49, 31);
		contentPane.add(txtpnOi);
		
		JTextPane txtpnOi_1 = new JTextPane();
		txtpnOi_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnOi_1.setText("OI");
		txtpnOi_1.setBounds(662, 125, 49, 31);
		contentPane.add(txtpnOi_1);
		
		JLabel lblNewLabel = new JLabel("Vittor Nascimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(350, 33, 159, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Voc\u00EA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(655, 84, 88, 30);
		contentPane.add(lblNewLabel_1);
	}
}
