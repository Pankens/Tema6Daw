package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FicheroChar2 {

//Exemplo con buffers	

	public static void main(String[] args) {

		Lector_Ficheiro2 meuLector = new Lector_Ficheiro2();
		meuLector.le();

		Escritor_Ficheiro2 meuEscritor = new Escritor_Ficheiro2();
		meuEscritor.escribe();

	}

}

class Lector_Ficheiro2 {
	public void le() {

		try {
			FileReader entrada = new FileReader("C:\\test.txt");
			BufferedReader meuBuffer = new BufferedReader(entrada);

			String linea;

			while ((linea = meuBuffer.readLine()) != null) {

				System.out.println(linea);

			}

			entrada.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

class Escritor_Ficheiro2 {

	public void escribe() {

		String frase = "Lo que el viento se llevo";

		try {
			FileWriter salida = new FileWriter("C:/Users/Vbox/Desktop/t33.txt");
			BufferedWriter meuBuffer = new BufferedWriter(salida);
			
			for (int i = 0; i < frase.length(); i++) {
				
				meuBuffer.write(frase.charAt(i));
				
			}
			
			salida.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}