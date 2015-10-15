/**
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por
 *teclado.
 *
 * @author Mariló Sánchez
 */
 
 public class Ejercicio17 {
   public static void main (String [] args) {
     System.out.print ("Introduzca un número entero: ");
     int num = Integer.parseInt (System.console().readLine());
     System.out.print ("La última cifra del número que has introducido es: " + num % 10);
   }
 } 
