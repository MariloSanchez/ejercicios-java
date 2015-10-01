/**
 *Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un
color diferente.
 *
 * @author Mariló Sánchez
 */ 

public class Ejercicio5 {
	public static void main (String [] args) {
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String blanco = "\033[37m";
	
    System.out.println(rojo + "Lunes\tMartes\tMiérc.\tJueves.\tViernes");
    System.out.println(blanco + "*****\t*****\t*****\t*****\t*****");
    System.out.println(verde + "FOL\tPROG\tSIN\tPROG\tBBDD");
    System.out.println(naranja + "FOL\tPROG\tSIN\tPROG\tBBDD");
    System.out.println(azul + "FOL\tPROG\tSIN\tPROG\tBBDD");
    System.out.println(morado + "PROG\tBBDD\tSIN\tED\tPROG");
    System.out.println(rojo+ "ED\tBBDD\tLM\tLM\tSIM");
    System.out.println(azul + "ED\tBBDD\tLM\tLM\tSIM");

		





		
 }
}
