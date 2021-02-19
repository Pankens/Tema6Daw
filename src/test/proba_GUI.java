package test;

public class proba_GUI {

	public static void main(String[] args) {
		VentanaWindowBuilder vista = new VentanaWindowBuilder();
		
		ControladorWB controlador = new ControladorWB(vista);
		
		vista.setControlador(controlador);
		
		vista.arrinca();
	}

}
