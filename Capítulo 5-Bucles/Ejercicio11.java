/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio11 {
   public static void main (String [] args) {
     
     System.out.print("Introduce un número: ");
     int numIntro = Integer.parseInt (System.console().readLine());
     System.out.println ("     n       n²         n³\n.............................");
     System.out.println (".............................");
     for (int i = numIntro; i < numIntro + 5; i++) {
       System.out.printf ("%6d %8d %10d\n" , i , i * i, i * i * i);//"d" es para reservar numero enteros. %4d es para reservar espacios entre numeros.
     }
   }
 }
