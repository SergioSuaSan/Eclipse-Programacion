package pruebaArray;

public class ArraysSimultaneos {

	public static void main(String[] args) {
		// Trabajos con arrays simultaneos
		
		int[] notas = {8, 6, 10, 3, 5, 7};
		String[] modulos = {"LM", "Inglés", "Prog", "BBDD", "FOL", "SISI"};
		
		//Listado de módulos aprobados
		/*Modulos aprobados
			LM
			Ingles
			Prog
			Fol
			SIsi
		*/
		System.out.println("Módulos aprobados:");
		
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >=5) {
				System.out.println(modulos[i]);
			}
		}
		
		System.out.println();
		System.out.println("Módulos favoritos:");
		//Módulo favorito
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] ==10) {
				System.out.println(modulos[i]);
			}
		}
		
		System.out.println();
		
		//Media de notas
		int acumulador = 0;
		for (int i = 0; i < notas.length; i++) {
			acumulador += notas[i];
		}
		int media = acumulador/notas.length;
		
		
		System.out.println(media);
		
		
		
	}

}
