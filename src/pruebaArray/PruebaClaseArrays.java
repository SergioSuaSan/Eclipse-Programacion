package pruebaArray;

import java.util.Arrays;

public class PruebaClaseArrays {

	public static void main(String[] args) {
		// Probamos la clase Arrays, que es una clase especial que nos ayuda con el manejo de los arrays
		
		
		int[] numeros = {4, 7, 45, 32, 6, 34,23, 4};
		
		//Imprimir array en pantalla
		System.out.println(Arrays.toString(numeros));

		//buscar un valor en un array (Tiene que estar ordenado)
		System.out.println("Búsqueda: " + Arrays.binarySearch(numeros, 32));
		
		
		
	}

}
