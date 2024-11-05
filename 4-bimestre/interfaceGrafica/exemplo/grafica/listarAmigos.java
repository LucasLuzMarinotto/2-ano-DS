package graficas;

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
import javax.swing.SwingConstants;

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
		
		JLabel lblNewLabel = new JLabel("Lista de Amigos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(269, 43, 163, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Atualizar");
		btnNewButton.setBounds(118, 327, 180, 64);
		contentPane.add(btnNewButton);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setBounds(462, 327, 180, 64);
		contentPane.add(btnDeletar);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(44, 19, 89, 89);
		contentPane.add(btnNewButton_1);
	}
}