package test;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout {

	public static void main(String[] args) {
		MarcoLayout marco1 = new MarcoLayout();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
	}

}
class MarcoLayout extends JFrame{
	public MarcoLayout() {
		this.setTitle("marco layouts");
		this.setBounds(700, 300, 500, 400);
		this.add(new PanelLayout(), BorderLayout.NORTH);
		this.add(new PanelLayout2(), BorderLayout.SOUTH);
	}
}
class PanelLayout extends JPanel {
	
	public PanelLayout () {
		this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 30));
		add(new JButton("Azul"));
		add(new JButton("Verde"));
		
		if (this.getComponentOrientation().isLeftToRight()) {
			System.out.println("Iz  > De");
		};
		
		this.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
	}
	
}

class PanelLayout2 extends JPanel {
	
public PanelLayout2 () {
		add(new JButton("Rojo"));
	}
	
}