package test;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventosBotones {

	public static void main(String[] args) {

		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	MarcoBotones() {
		this.setTitle("Botones y eventos");
		this.setBounds(300, 100, 500, 300);
		this.add(new LaminaBotones());

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		this.setTitle("Ventana 01");
		Image icono = toolkit.getImage("src/imaxes/pepe.png");
		this.setIconImage(icono);
	}

}

class LaminaBotones extends JPanel {
	JButton naranja = new JButton("Naranja");
	JButton azul = new JButton("azul");

	LaminaBotones() {
		this.add(naranja);
//		naranja.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				setBackground(Color.ORANGE);
//
//			}
//
//		});
		naranja.setActionCommand("NARANJA");
		naranja.addActionListener(new Escoitador());
		this.add(azul);
//		azul.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				setBackground(Color.CYAN);
//			}
//
//		});
//		azul.addActionListener(new Escoitador(Color.CYAN));
//		naranja.addActionListener(new Escoitador(Color.ORANGE));
		azul.setActionCommand("AZUL");
		azul.addActionListener(new Escoitador());
		}
	
	class Escoitador implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			switch (e.getActionCommand()) {
			case "AZUL":
				setBackground(Color.CYAN);
				break;
			case "NARANJA":
				setBackground(Color.ORANGE);
				break;
			}
			
		}
//		private Color colorFondo;
//		public Escoitador (Color c) {
//			colorFondo = c;
//		}
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			setBackground(colorFondo);
//		}
//	}
}}
