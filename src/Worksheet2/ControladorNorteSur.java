package Worksheet2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import test.VentanaWindowBuilder;

public class ControladorNorteSur implements ActionListener {

	private NorteSurJRFrame vista;
	
	public ControladorNorteSur(NorteSurJRFrame vista) {
		
		this.vista = vista;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case NorteSurJRFrame.NORTE:
			
			vista.cambiaNorteSur("Ola dende fondo Norte!");
			
			break;
			
		case NorteSurJRFrame.SUR:
			
			vista.cambiaNorteSur("Ola dende fondo Sur!");
			
			break;

		default:
			break;
		}
		
	}
	
}
