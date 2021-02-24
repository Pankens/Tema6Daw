package Worksheet2;

public class PanelGUI {

	public static void main(String[] args) {
		
		NorteSurJRFrame vista = new NorteSurJRFrame();
		
		ControladorNorteSur controlador = new ControladorNorteSur(vista);
		
		vista.setControlador(controlador);
		
		vista.hazteVisible();

	}

}
