package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaWindowBuilder extends JFrame {

	public static final String ENVIAR = "enviar";
	public static final String CANCELAR = "cancelar";
	public static final String NEGRITA = "negrita";
	public static final String CURSIVA = "cursiva";
	public static final String COLOR_DEFAULT = "default";
	public static final String COLOR_ROJO = "rojo";
	public static final String COLOR_VERDE = "verde";
	public static final String TIPO_LETRA = "letra";
	public static final String SALIR = "aaa";
	public static final String CAMBIARNOME = "www";
	private JPanel contentPane;
	private JButton btnEnviar;
	private JButton btnCancelar;
	private JPasswordField contrasinal;
	private JTextField nombre;
	private JTextArea textArea;
	private JCheckBox checkCursiva;
	private JCheckBox checkNegrita;
	private JRadioButton bDefault;
	private JRadioButton bRojo;
	private JRadioButton bVerde;
	private JComboBox comboBox;
	private JSlider slider;
	private JSpinner spinner;
	private JMenuItem opcionCambiarNome;
	private JMenuItem opcionBorrar;
	private JMenuItem opcionSalir;
	private JTabbedPane tabbedPane;
	private JList lista;
	private JLabel lblNewLabel;

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
		
		///////// PANEL GENERAL /////////////////
		
		tabbedPane = new JTabbedPane (JTabbedPane.TOP);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		opcionBorrar = new JMenuItem("borrar datos");
		opcionBorrar.setActionCommand(VentanaWindowBuilder.CANCELAR);
		mnNewMenu.add(opcionBorrar);
		
		opcionCambiarNome = new JMenuItem("cambiar nome");
		mnNewMenu.add(opcionCambiarNome);
		opcionCambiarNome.setActionCommand(VentanaWindowBuilder.CAMBIARNOME);
		
		opcionSalir = new JMenuItem("salir");
		opcionSalir.setActionCommand(VentanaWindowBuilder.SALIR);
		mnNewMenu.add(opcionSalir);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane.addTab("General", contentPane);

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

		bDefault = new JRadioButton("Por defecto");
		bDefault.setBounds(163, 287, 113, 23);
		bDefault.setActionCommand(VentanaWindowBuilder.COLOR_DEFAULT);
		contentPane.add(bDefault);

		bRojo = new JRadioButton("Rojo");
		bRojo.setBounds(60, 287, 53, 23);
		bRojo.setActionCommand(VentanaWindowBuilder.COLOR_ROJO);
		contentPane.add(bRojo);

		bVerde = new JRadioButton("Verde");
		bVerde.setActionCommand(VentanaWindowBuilder.COLOR_VERDE);
		bVerde.setBounds(305, 287, 63, 23);
		contentPane.add(bVerde);

		ButtonGroup grupoRadio = new ButtonGroup();
		grupoRadio.add(bVerde);
		grupoRadio.add(bRojo);
		grupoRadio.add(bDefault);

		comboBox = new JComboBox();
		comboBox.addItem("Serif");
		comboBox.addItem("Arial");
		comboBox.addItem("SansSerif");
		comboBox.setBounds(173, 331, 63, 22);
		contentPane.add(comboBox);
		comboBox.setActionCommand(VentanaWindowBuilder.TIPO_LETRA);

		slider = new JSlider(0, 40, textArea.getFont().getSize());
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setBounds(60, 381, 236, 45);
		contentPane.add(slider);

		spinner = new JSpinner(new SpinnerNumberModel(textArea.getFont().getSize(), 0, 40, 1));
		spinner.setBounds(305, 381, 63, 29);
		contentPane.add(spinner);

		this.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		///////// FIN PANEL GENERAL /////////////////
		
		///////// PANEL SECUNDARIO /////////////////
		
		JPanel panelSecundario = new JPanel();
		
		tabbedPane.addTab("Secundario", panelSecundario);
		panelSecundario.setLayout(null);
		
		String[] meses = {"Xaneiro", "Febreiro", "Marzo", "Mayo"};
		
		DefaultListModel modeloLista = new DefaultListModel();
		
		for (String mes : meses) {
			modeloLista.addElement(mes);
		}
		
		lista = new JList(modeloLista);
		lista.setVisibleRowCount(3);
		lista.setVisible(true);
		
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		JScrollPane scrollList = new JScrollPane(lista);
		scrollList.setBounds(10, 10, 80, 60);
		panelSecundario.add(scrollList);
		
		lblNewLabel = new JLabel("Seleccionouse:");
		lblNewLabel.setBounds(10, 88, 80, 14);
		panelSecundario.add(lblNewLabel);

		
	}

	public String getNombreLetra() {
		return (String) comboBox.getSelectedItem();

	}

	public String getTextField() {
		return nombre.getText();
	}
	
	public void setTextField(String nome) {
		
		nombre.setText(nome);
		
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
		bDefault.addActionListener(c);
		bRojo.addActionListener(c);
		bVerde.addActionListener(c);
		comboBox.addActionListener(c);
		slider.addChangeListener(c);
		spinner.addChangeListener(c);
		opcionBorrar.addActionListener(c);
		opcionSalir.addActionListener(c);
		opcionCambiarNome.addActionListener(c);
		lista.addListSelectionListener(c);

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

	public void setTipoLetra(String familia) {

		Font novaLetra = new Font(familia, textArea.getFont().getStyle(), textArea.getFont().getSize());
		textArea.setFont(novaLetra);
	}

	public void setColorTextArea(Color c) {

		textArea.setForeground(c);

	}

	public void setTamanoLetra(int tamano) {

		textArea.setFont(new Font(textArea.getFont().getFamily(), textArea.getFont().getStyle(), tamano));

	}

	public int getTamanoLetraSlider() {

		return slider.getValue();

	}

	public void setValueSlider(int value) {

		slider.setValue(value);

	}

	public int getTamanoLetraSpinner() {
		return (int) spinner.getValue();

	}

	public void setValueSpinner(int value) {

		spinner.setValue(value);

	}
	
	public String[] getListaMeses() {
		
		
		int tamano = lista.getSelectedValuesList().size();
		String[] listaMeses = new String[tamano];
		listaMeses = (String[]) lista.getSelectedValuesList().toArray();

		
		return null;
		
	}

	public void setTextoLabelSecundario(String texto) {
		
		lblNewLabel.setText(texto);
		
	}
	public void arrinca() {
		this.setVisible(true);

	}
}
