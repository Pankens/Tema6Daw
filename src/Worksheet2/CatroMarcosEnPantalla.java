package Worksheet2;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;

import javax.swing.JFrame;


public class CatroMarcosEnPantalla {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		int alturaPantalla = dimension.height;
		int anchoPantalla = dimension.width;
		
		
		MiMarco[] marco = new MiMarco[4];
		
		marco[0] = new MiMarco(0, 0, "Marco1", Color.BLUE);
		marco[1] = new MiMarco(anchoPantalla/2, 0, "Marco2", Color.CYAN);
		marco[2] = new MiMarco(0, alturaPantalla/2, "Marco3", Color.ORANGE);
		marco[3] = new MiMarco(anchoPantalla/2, alturaPantalla/2, "Marco4", Color.PINK);
		
		for (int i = 0; i < marco.length; i++) {

			marco[i].setVisible(true);
			marco[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
	}

}

class MiMarco extends JFrame {
	
	public MiMarco(int posX, int posY, String titulo, Color color) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
		int alturaPantalla = dimension.height;
		int anchoPantalla = dimension.width;
		Image icono =  toolkit.getImage("src/imaxes/pepe.png");
		this.setIconImage(icono);
		this.setResizable(false);
		
		this.setTitle(titulo);
		this.setLocation(posX, posY);
		this.setSize(anchoPantalla/2, alturaPantalla/2);
		this.setBackground(Color.BLUE);
		setBackground(Color.ORANGE);
		
		
		
	}
	
}