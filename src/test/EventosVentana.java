package test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {
		
		MarcoVentana m1 = new MarcoVentana("ventana 1", 100, 200, 500, 350);
		MarcoVentana m2 = new MarcoVentana("ventana 2", 700, 200, 500, 350);
		m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}

class MarcoVentana extends JFrame {
	
	public MarcoVentana (String t, int x, int y, int tamx, int tamy) {
		
		this.setTitle(t);
		this.setBounds(x, y, tamx, tamy);
		this.setVisible(true);
		addWindowListener(new EscoitadorVentana());
		
	}
	
}

class EscoitadorVentana extends WindowAdapter {

	
	
//	@Override
//	public void windowOpened(WindowEvent e) {
//		System.out.println("ventana Abierta");
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("ventana Cerrando");
//		
//	}
//
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("ventana Cerrada");
		
	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		System.out.println("ventana Minimizada");
//		
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		System.out.println("ventana Restaurada");		
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		System.out.println("ventana Activada");
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		System.out.println("ventana Desactivada");
//	}
	
	
}