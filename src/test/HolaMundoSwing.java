package test;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HolaMundoSwing {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("hola mundo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel ("Olaaaa mundo");
		frame.getContentPane().add(label);
		frame.pack();
		frame.setLocationRelativeTo(null);frame.setVisible(true);
		
		
	}

}
