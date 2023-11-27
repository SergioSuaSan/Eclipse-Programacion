package pruebaArray;

public class Temperaturas {

	public static void main(String[] args) {
		// Crear un Array con las temperaturas de la semana
		
		double[] temperaturas = {14,12,13.4,16,11,14.6,15};
		
		
		
		
		//Calcular la temperatura media de la semana
		
		double acumulador = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			acumulador += temperaturas[i];
		}
		
		System.out.println(acumulador/temperaturas.length);

	}

}
