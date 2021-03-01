package Worksheet2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ComparaPass extends JFrame {

	private JPanel contentPane;
	private JPasswordField pass2;
	private JPasswordField pass1;
	private JLabel lblNewLabel;
	private JLabel contrasinal1;
	private JLabel contrasinal2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComparaPass frame = new ComparaPass();
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
	public ComparaPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pass2 = new JPasswordField();
		pass2.setBounds(180, 11, 113, 20);
		contentPane.add(pass2);
		
		pass1 = new JPasswordField();
		pass1.setBounds(180, 42, 113, 20);
		contentPane.add(pass1);
		
		JButton Comprobar = new JButton("Comprobar");
		Comprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Comprobar.setBounds(180, 93, 113, 23);
		contentPane.add(Comprobar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 97, 85, 14);
		contentPane.add(lblNewLabel);
		
		contrasinal1 = new JLabel("Contrasinal:");
		contrasinal1.setBounds(10, 11, 113, 20);
		contentPane.add(contrasinal1);
		
		contrasinal2 = new JLabel("Confirme contrasinal:");
		contrasinal2.setBounds(10, 45, 113, 20);
		contentPane.add(contrasinal2);
	}
}
