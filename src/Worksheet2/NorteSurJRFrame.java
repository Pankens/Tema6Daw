package Worksheet2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import test.ControladorWB;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NorteSurJRFrame extends JFrame {

	public static final String SUR = "sur";
	public static final String NORTE = "norte";
	private JPanel contentPane;
	private JButton btnSur;
	private JButton btnNorte;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NorteSurJRFrame frame = new NorteSurJRFrame();
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
	public NorteSurJRFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		btnNorte = new JButton("Norte");
		btnNorte.setActionCommand(NorteSurJRFrame.NORTE);
		contentPane.add(btnNorte, BorderLayout.NORTH);
		
		btnSur = new JButton("Sur");
		btnSur.setActionCommand(NorteSurJRFrame.SUR);
		contentPane.add(btnSur, BorderLayout.SOUTH);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);

	}
	
	
	
	public void setControlador(ControladorNorteSur c) {
		
		btnNorte.addActionListener(c);
		btnSur.addActionListener(c);
		
	}
	
	public void cambiaNorteSur(String texto) {
		
		lblNewLabel.setText(texto);
		
	}
	
	public void hazteVisible() {
		this.setVisible(true);

	}

}
