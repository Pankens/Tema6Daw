package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;

public class VentanaWindowBuilder extends JFrame {

	public static final String ENVIAR = "enviar";
	public static final String CANCELAR = "cancelar";
	public static final String NEGRITA = "negrita";
	public static final String CURSIVA = "cursiva";
	private JPanel contentPane;
	private JButton btnEnviar;
	private JButton btnCancelar;
	private JPasswordField contrasinal;
	private JTextField nombre;
	private JTextArea textArea;
	private JCheckBox checkCursiva;
	private JCheckBox checkNegrita;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaWindowBuilder frame = new VentanaWindowBuilder();
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
	public VentanaWindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Verdana", Font.BOLD, 11));
		labelNombre.setBounds(38, 25, 80, 14);
		contentPane.add(labelNombre);

		JLabel labelContrasinal = new JLabel("Contrasinal");
		labelContrasinal.setFont(new Font("Verdana", Font.BOLD, 11));
		labelContrasinal.setBounds(38, 45, 80, 14);
		contentPane.add(labelContrasinal);

		nombre = new JTextField("", 30);
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		nombre.setBounds(188, 26, 180, 14);
		contentPane.add(nombre);

		contrasinal = new JPasswordField("", 30);
		contrasinal.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contrasinal.setBounds(188, 46, 180, 14);
		contentPane.add(contrasinal);

		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(60, 96, 89, 23);
		btnEnviar.setActionCommand(VentanaWindowBuilder.ENVIAR);
		contentPane.add(btnEnviar);

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(279, 96, 89, 23);
		btnCancelar.setActionCommand(VentanaWindowBuilder.CANCELAR);
		contentPane.add(btnCancelar);

		textArea = new JTextArea();
		textArea.setLineWrap(true);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(60, 138, 308, 71);
		contentPane.add(scrollPane);
		
		checkCursiva = new JCheckBox("Cursiva");
		checkCursiva.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		checkCursiva.setBounds(60, 233, 97, 23);
		checkCursiva.setActionCommand(VentanaWindowBuilder.CURSIVA);
		contentPane.add(checkCursiva);
		
		checkNegrita = new JCheckBox("Negrita");
		checkNegrita.setFont(new Font("Tahoma", Font.BOLD, 14));
		checkNegrita.setBounds(188, 233, 97, 23);
		checkNegrita.setActionCommand(VentanaWindowBuilder.NEGRITA);
		contentPane.add(checkNegrita);

	}

	
	
	
	public String getTextField() {
		return nombre.getText();
	}
	
	public String getPasswordField() {
		return contrasinal.getText();
	}

	public void setTextoDeTextArea(String texto) {
		textArea.setText(texto);
	}

	public void borraCampos() {
		nombre.setText("");
		contrasinal.setText("");
		checkCursiva.setSelected(false);
		checkNegrita.setSelected(false);
	}

	public void setControlador(ControladorWB c) {

		btnEnviar.addActionListener(c);
		btnCancelar.addActionListener(c);
		checkCursiva.addActionListener(c);
		checkNegrita.addActionListener(c);

	}
	
	public boolean isSelectedCursiva() {
		
		return checkCursiva.isSelected();
		
	}
	
	public boolean isSelectedNegrita() {
		
		return checkNegrita.isSelected();
		
	}
	
	public void setTipoLetra(int tipoNC) {
		
		Font novaLetra = new Font("Tahoma", tipoNC, 12);
		textArea.setFont(novaLetra);
		
	}
	
	public void arrinca() {
		this.setVisible(true);

	}
}
