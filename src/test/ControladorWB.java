package test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorWB implements ActionListener {
	private VentanaWindowBuilder vista;
	
	public ControladorWB(VentanaWindowBuilder vista) {
		
		this.vista = vista;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int tipo = 0;
		
		switch (e.getActionCommand()) {
		case VentanaWindowBuilder.CANCELAR:
			vista.borraCampos();
			vista.setTextoDeTextArea("");
			break;
			
		case VentanaWindowBuilder.ENVIAR:
			vista.setTextoDeTextArea("Nombre: " + vista.getTextField() + System.lineSeparator() + "Contrasinal: " + vista.getPasswordField());
			break;
			
		case VentanaWindowBuilder.CURSIVA:	
			if (vista.isSelectedCursiva()) {
				tipo += Font.ITALIC;
			}
			
		case VentanaWindowBuilder.NEGRITA:
			if (vista.isSelectedNegrita()) {
				tipo += Font.BOLD;
			}
			vista.setTipoLetra(tipo);
			
			break;
			
		default:
			
			break;
		}
		
	}

}
