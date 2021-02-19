package test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosTeclado {

	public static void main(String[] args) {
		
		MarcoConTeclas marco1 = new MarcoConTeclas();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTeclas extends JFrame {
	
	public MarcoConTeclas () {
		
		setBounds(400,400,300,300);
	
		this.setVisible(true);
		this.addKeyListener(new OyenteDeTeclado());
	}
	
}

class OyenteDeTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
//		System.out.println(e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
//		System.out.println(e.getKeyCode());
		
	}
	
	
	
}