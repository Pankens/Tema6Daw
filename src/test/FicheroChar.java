package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FicheroChar {

	public static void main(String[] args) {

	}

	class Lector_Fichero {

		public void le() {

			// Leer el contenido y sacarlo por pantalla
			// Y sacarlo por pantalla
			try {
				FileReader entrada = new FileReader("c:/ficheros/test.txt");
				int c = entrada.read();
				while (c != -1) {

					System.out.print((char) c);
					c = entrada.read();
				}
				entrada.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Fichero no encontrado");
				e.printStackTrace();
			} catch (IOException x) {
				System.out.println("error de lectura");
			}

		}

	}

	class Escritor_Fichero {

		public void escribe() {

			// escribe una string en un fichero
			String frase = "esto es una prueba";

			try {
				FileWriter salida = new FileWriter("c:/ficheros/test2.txt");

				for (int i = 0; i < frase.length(); i++) {

					salida.write(frase.charAt(i));

				}

				salida.close();

			} catch (IOException x) {
				System.out.println("error de escritura");
			}

		}
	}

}
		
		
		
		

