package test;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Marcos {

	public static void main(String[] args) {
		
		MiMarco marco1 = new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MiMarco extends JFrame {
	
	public MiMarco() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		
		int alturaPantalla = dimension.height;
		int anchoPantalla = dimension.width;
		
		setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
		
		this.setTitle("Ventana 01");
		Image icono =  toolkit.getImage("src/imaxes/pepe.png");
		this.setIconImage(icono);
//		this.setSize(500, 500);
//		this.setLocation(500, 200);
//		this.setBounds(500, 200, 500, 500);
		this.setResizable(false);
	}
	
}
