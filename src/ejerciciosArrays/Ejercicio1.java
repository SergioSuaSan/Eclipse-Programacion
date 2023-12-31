package ejerciciosArrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. En un array de 20 elementos hay almacenados números enteros. Haz un
programa que pida un número y diga cuantas veces aparece el número dentro del
array.
		 */

		int[] datos = new int[20];
		
		Scanner teclado = new Scanner(System.in);
		//Rellenamos el array con datos aleatorios
		for (int i = 0; i < datos.length; i++) {
			datos [i] =  (int) (Math.random()*50);
		}
		Arrays.sort(datos);
		System.out.println(Arrays.toString(datos));
		
		System.out.println("Teclea un número: ");
		int numero = teclado.nextInt();
		//Hacemos la búsqueda
		int contador = 0;
//		for (int i = 0; i < datos.length; i++) {
//			if (datos[i] == numero) {
//				contador++;
//			}
//		}
		
		//Foreach
		for (int valor : datos) {     //foreach tiene 2 problemas: NO SABES SU POSICIÓN, Y DEBE MIRAR TODO EL ARRAY
			if (valor == numero) {
				contador ++;
			}
		}
		
		System.out.println(contador);
		
		
		
		
	}

}
