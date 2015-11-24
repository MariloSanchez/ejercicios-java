/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números
mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
total acumulado, el contador de los números introducidos y la media.
 * 
 * @author Mariló Sanchez
 */
 
 public class Ejercicio23 {
   public static void main (String [] args) {
     
     System.out.println ("Vaya introdiciendo números, este terminará cuando el total no supere los 10000: ");
     int totalElementos = 0;
     int suma = 0;
     int numIntro;
     
     do {
       numIntro = Integer.parseInt (System.console().readLine());
       
       suma += numIntro;
       totalElementos ++;
     }while (suma <=10000);
     
     System.out.println ("El número total de elementos introducidos es de: " + totalElementos);
     System.out.println ("La suma de todos los números introducidos es: " + suma);
     System.out.println ("La media de los números intoducidos es de: " + suma / totalElementos);
   }
 }

