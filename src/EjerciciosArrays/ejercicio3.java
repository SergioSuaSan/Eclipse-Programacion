package EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crea una agenda para almacenar nombres y direcciones de N personas. Después
haz un programa que permita ir consultando el nombre y la dirección de las
personas almacenadas.
		 */

		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántas personas vas a meter?");
		int numero = teclado.nextInt();
		
		String[] nombres = new String[ numero];
		
		for (int i = 0; i < numero; i++) {
			System.out.println("Escribe un nombre: ");
			String nombre = teclado.nextLine();
			nombres[i] =nombre;
		}
		
		System.out.println(Arrays.toString(nombres));
		
		
	}

}
