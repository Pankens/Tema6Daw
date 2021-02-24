package Worksheet2;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CreaMarcosComplex {

	public static void main(String[] args) {
		MarcoPrincipal marco1 = new MarcoPrincipal();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
		

	}

}

class MarcoPrincipal extends JFrame {

	public MarcoPrincipal() {

		this.setBounds(900, 100, 400, 400);
		this.add(new LaminaPrincipal());

	}

}

class LaminaPrincipal extends JPanel {
	JButton BotonCerrar;

	public LaminaPrincipal() {
		JButton botonNuevo = new JButton("Nuevo");
		add(botonNuevo);
		botonNuevo.addActionListener(new OyenteNuevo());
		BotonCerrar = new JButton("Cerrar Todo");
		add(BotonCerrar);
	}

	class OyenteNuevo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			for (int i = 0; i < 100; i++) {
				MarcoEmergente marco = new MarcoEmergente(BotonCerrar);
				marco.setVisible(true);
				
			}
			
			
		}

	}

}

class MarcoEmergente extends JFrame {

	private static int contador = 0;

	public MarcoEmergente(JButton botonCerrar) {

		Random r = new Random();
		int randomInt = r.nextInt(1600) + 1;
		int randomInt2 = r.nextInt(1600) + 1;

		contador++;
		this.setTitle("ventana" + contador);
		this.setBounds(randomInt, randomInt2, 400, 200);
		botonCerrar.addActionListener(new CierraTodos());
	}

	class CierraTodos implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			contador = 0;

		}

	}
}
