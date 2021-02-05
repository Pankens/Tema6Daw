package test;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FichDir {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Instroduza valor" , null);
		
		System.out.println(valor);
		
		JOptionPane.showMessageDialog(null, valor);
		
		File fichero = new File("Exemplo ficheiro");
		
		System.out.println(fichero.exists());
		
		File ruta = new File ("c:"+File.separator+"ficheros");
		
		File ruta2 = new File ("c:"+File.separator+"ficheros" + File.separator+ "aProba" + File.separator + "fich.txt");
		
		try {
			ruta2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(ruta.exists());
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombresFicheros = ruta.list();
		
//		if (ruta.exists()) {
//		
//		for (int i = 0; i < nombresFicheros.length; i++) {
//			
//			System.out.println(nombresFicheros[i]);
//			
//			
//			
//		}
//			
//		}
		
		for (String s: nombresFicheros) {
			
			System.out.println(s);
			
			File f = new File(ruta.getAbsoluteFile(), s);
			
			if(f.isDirectory()) {
				
				for(String s1 : f.list()) {
					
					System.out.println(" " + s1);
				}
				
			}
			
		}
	
		
		
	}

}
