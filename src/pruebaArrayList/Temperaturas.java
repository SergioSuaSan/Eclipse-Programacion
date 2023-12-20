package pruebaArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Temperaturas {

	public static void main(String[] args) {
		/*
		 * Guardamos temperaturas en un array list
		 */
		
		ArrayList<Double> temperaturas = new ArrayList<Double>(Arrays.asList(8.4, 1.3, 12.5, 11.0, 34.1, 23.1, 18.2));
		
		//sacar la media de las temperaturas
		
		double acumulador = 0;
		
		for (Double double1 : temperaturas) {
			acumulador+=double1;
		}
		System.out.println("La media es: " + (double) (acumulador/temperaturas.size() ) );

		//qué dia fue el más caluroso
		double mayor = 0;
		
		for (Double double1 : temperaturas) {
			if (double1>mayor) {
				mayor = double1;
			}
		}
		System.out.println("La temperatura mayor es: " + mayor);

	
	
	
	
	
	
	
	
	
	}
	

}
