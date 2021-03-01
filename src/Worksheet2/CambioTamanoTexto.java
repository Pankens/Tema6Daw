package Worksheet2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CambioTamanoTexto extends JFrame implements ChangeListener{
	
	private JPanel contentPane;
	private JSlider slider;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CambioTamanoTexto frame = new CambioTamanoTexto();
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
	public CambioTamanoTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		slider = new JSlider(0, 40);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setPaintTicks(true);
		slider.setBounds(21, 11, 380, 45);
		slider.addChangeListener(this);
		contentPane.add(slider);
		
		label = new JLabel("En un lugar de La Mancha cuyo nombre no quiero recordar...");
		label.setBounds(21, 92, 380, 112);
		contentPane.add(label);
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		if (e.getSource() instanceof JSlider) {
		this.setTamanoLetra(this.getTamanoLetraSlider());
		}
		
	}
	
	
	
	public void setTamanoLetra(int tamano) {

		
		label.setFont(new Font(label.getFont().getFamily(), label.getFont().getStyle(), tamano));

	}

	public int getTamanoLetraSlider() {

		return slider.getValue();

	}
}
