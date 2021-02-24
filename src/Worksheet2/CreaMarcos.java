package Worksheet2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class CreaMarcos {
	
		public static void main(String[] args) {
			MarcoPrincipal2 marco1 = new MarcoPrincipal2();
			marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			marco1.setVisible(true);
			

		}

	}

	class MarcoPrincipal2 extends JFrame {

		public MarcoPrincipal2() {

			this.setBounds(900, 100, 400, 400);
			this.add(new LaminaPrincipal2());

		}

	}

	class LaminaPrincipal2 extends JPanel {

		public LaminaPrincipal2() {
			JButton botonNuevo = new JButton("Nuevo");
			add(botonNuevo);
			botonNuevo.addActionListener(new OyenteNuevo2());
		}

		class OyenteNuevo2 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
					MarcoEmergente2 marco = new MarcoEmergente2();
					marco.setVisible(true);
			
				
				
				
			}

		}

	}

	class MarcoEmergente2 extends JFrame {

		private static int contador = 0;

		public MarcoEmergente2() {

			contador++;
			this.setTitle("ventana" + contador);
			this.setBounds(contador*12, contador*20, 400, 400);
		}


		}

