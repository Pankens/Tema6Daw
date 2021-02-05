package worksheet1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CopiaBin {

	public static void main(String[] args) {
		
		//Joption
		String rutaentrada = JOptionPane.showInputDialog("Instroduza ruta valida" , null);
		
		JOptionPane.showMessageDialog(null, "Eligio la ruta : " + rutaentrada);
		
		String rutasalida = JOptionPane.showInputDialog("Instroduza ahora una ruta de salida" , null);
		
		// array para almacenar a imaxe
		int contador = 0;
		int[] datosEntrada = new int[274432];
		
		
		try {
			
			FileInputStream entrada = 
					new FileInputStream (rutaentrada);
			
			int byteEntrada;
			
			while((byteEntrada = entrada.read()) != -1) {
				
				datosEntrada[contador] = byteEntrada;
				
				contador++;
								
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Copiar datos entrada a canionesCopia
		
		try {
			FileOutputStream salida =
					new FileOutputStream (rutasalida);
			
			for (int i = 0; i < datosEntrada.length; i++) {
				
				
				salida.write(datosEntrada[i]);
				
			}
			
			
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}