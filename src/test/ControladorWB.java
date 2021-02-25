package test;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;


public class ControladorWB implements ActionListener, ChangeListener, ListSelectionListener {
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
			
		case VentanaWindowBuilder.COLOR_DEFAULT:
			
			vista.setColorTextArea(null);
			
			break;
			
		case VentanaWindowBuilder.COLOR_ROJO:
			
			vista.setColorTextArea(Color.RED);
			
			break;
			
		case VentanaWindowBuilder.COLOR_VERDE:
			
			vista.setColorTextArea(Color.GREEN);
			
			break;
			
		case VentanaWindowBuilder.TIPO_LETRA:
			
			vista.setTipoLetra(vista.getNombreLetra());
			
		
			break;
			
		case VentanaWindowBuilder.SALIR:
			
			vista.dispose();
			
			break;
			
		case VentanaWindowBuilder.CAMBIARNOME:
			
			String nome = JOptionPane.showInputDialog(vista, "introduza nome");
			
			if (!(nome.equals(""))) {
				
				int resposta = JOptionPane.showConfirmDialog(vista, "Estas seguro?", "CONFIRMACION", JOptionPane.YES_NO_OPTION);
				
				if (resposta == JOptionPane.YES_OPTION) {
					
					vista.setTextField(nome);
					JOptionPane.showMessageDialog(vista, "Indoruciu o nome: " + nome, "Ventana", JOptionPane.WARNING_MESSAGE);;
					
				}
			}
			
			break;
		
		default:
			
			break;
		}
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		if (e.getSource() instanceof JSpinner) {
			
			vista.setTamanoLetra(vista.getTamanoLetraSpinner());
			vista.setValueSlider(vista.getTamanoLetraSpinner());
			
		}
		
		
		if (e.getSource() instanceof JSlider) {
			
			vista.setTamanoLetra(vista.getTamanoLetraSlider());
			vista.setValueSpinner(vista.getTamanoLetraSlider());
			
		}
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
	}

}
