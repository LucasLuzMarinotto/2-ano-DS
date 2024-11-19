package programa_amigos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Friend Zone");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 30));
		titulo.setBounds(259, 63, 247, 118);
		contentPane.add(titulo);
		
		JButton botaoIrCadastrar = new JButton("Cadastrar Amigo");
		botaoIrCadastrar.setBackground(new Color(135, 206, 250));
		botaoIrCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cadastroAmigos cadastro = new cadastroAmigos();
				cadastro.setVisible(true);
				dispose();
				
			}
		});
		botaoIrCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botaoIrCadastrar.setBounds(54, 306, 247, 118);
		contentPane.add(botaoIrCadastrar);
		
		JButton btnAtualizarAmigo = new JButton("Atualizar Amigo");
		btnAtualizarAmigo.setBackground(new Color(135, 206, 250));
		btnAtualizarAmigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				atualizarAmigos atualizar = new atualizarAmigos();
				atualizar.setVisible(true);
				dispose();
			}
		});
		btnAtualizarAmigo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAtualizarAmigo.setBounds(403, 306, 247, 118);
		contentPane.add(btnAtualizarAmigo);
	}
}
