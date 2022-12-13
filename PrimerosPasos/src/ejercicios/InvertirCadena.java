package ejercicios;

import java.util.Scanner;

public class InvertirCadena {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce una palabra");
			String cadena = entrada.nextLine();
			
			String invertida = "";

			for (int indice = cadena.length() - 1; indice >= 0; indice--) {
				
				invertida += cadena.charAt(indice);
			}
			System.out.println("Cadena original: " + cadena);
			System.out.println("Cadena invertida: " + invertida);
		}


	}

}
