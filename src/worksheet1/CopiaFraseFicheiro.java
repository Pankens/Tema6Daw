package worksheet1;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CopiaFraseFicheiro {

	public static void main(String[] args) {

		String fraseTexto = JOptionPane.showInputDialog("Instroduza frase", null);

		JOptionPane.showMessageDialog(null, "Eligio la frase : " + fraseTexto);

		String ruta = JOptionPane.showInputDialog("Instroduza ruta", null);

		JOptionPane.showMessageDialog(null, "Eligio la ruta : " + ruta);

		Escritor e = new Escritor();

		e.escribe(fraseTexto, ruta);
		e.open(ruta);

	}

}

class Escritor {

	public void escribe(String frase, String ruta) {

		String frase1 = frase;

		try {
			FileWriter salida = new FileWriter(ruta);
			BufferedWriter meuBuffer = new BufferedWriter(salida);

			meuBuffer.write(frase1);

			meuBuffer.close();
			salida.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void open(String ruta) {

		try {
			File file = new File(ruta);
			if (!Desktop.isDesktopSupported()) {
				System.out.println("not supported");
				return;
			}
			Desktop desktop = Desktop.getDesktop();
			if (file.exists())
				desktop.open(file);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}