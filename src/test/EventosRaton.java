package test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		MarcoRaton marco1 = new MarcoRaton();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoRaton extends JFrame{
	
	
	public MarcoRaton (){
		
		this.setBounds(900, 200, 300, 300);
		this.setVisible(true);
		this.addMouseListener(new EscuchadorRaton());
		this.addMouseMotionListener(new EscuchadorRaton());
	}

}



class EscuchadorRaton implements MouseListener, MouseMotionListener {

	int mover = 1;
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Arrastrando" + mover);
		
		mover--;
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		System.out.println("moviendo " + mover);
		
		mover++;
		
	}
	
	//Mouse Listener

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Coord x: " + e.getX() + " coord y: " + e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		switch (e.getButton()) {
		case MouseEvent.BUTTON1:
			System.out.println("Izquierdo");
			break;
		case MouseEvent.BUTTON2:
			System.out.println("Ruedita");
			break;
		case MouseEvent.BUTTON3:
			System.out.println("Derecho");
			break;
		default:
			break;
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


}