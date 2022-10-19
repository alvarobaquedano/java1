package pruebas;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class adivinanumero2 {

	public static void main(String[] args) {

		int aleatorio = 0;
		String entrada;
		int num1 = 0;
		int intentos = 0;
		int n;
		
		
		aleatorio = (int)(Math.random()*100+1);
		
		ArrayList<Integer> resultados = new ArrayList<Integer>();   

		
		while (aleatorio != num1){
			
			entrada = JOptionPane.showInputDialog("Por favor introduce un número del 1 al 100");
			
			num1 = Integer.parseInt(entrada);
			
			intentos++;
			n = Integer.parseInt(entrada);
            if (n != 0){
                resultados.add(n);
            }
			
		if (num1 < aleatorio) {
			JOptionPane.showMessageDialog(null, "El número es mayor que " +num1);
			
		}
		else {
			if (num1 > aleatorio) {
				JOptionPane.showMessageDialog(null, "El número es menor que " +num1);
			}
		}
			
		}
		JOptionPane.showMessageDialog(null, "Enhorabuena, lo has conseguido en " + intentos + " intentos");
		
		JOptionPane.showMessageDialog(null, "Estos son tu intentos " + resultados);
		
		
	}
	}


