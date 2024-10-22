package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

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
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setTitle("tela1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 523);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botao1 = new JButton("Calcular");
		botao1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		botao1.setBackground(Color.CYAN);
		botao1.setForeground(Color.BLACK);
		botao1.setBounds(81, 327, 142, 74);
		contentPane.add(botao1);
		
		JLabel randomLabel = new JLabel("Texto");
		randomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		randomLabel.setIcon(new ImageIcon(principal.class.getResource("/img/newIcon.png")));
		randomLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		randomLabel.setBounds(152, 31, 253, 83);
		contentPane.add(randomLabel);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(346, 327, 142, 74);
		contentPane.add(btnNewButton);
	}
}
