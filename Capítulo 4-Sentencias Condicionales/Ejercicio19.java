/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Mariló Sánchez 
 */
 
 public class Ejercicio19 {
   public static void main (String [] args) {
     System.out.println ("Introduce un número entero. Puede ser de hasta cinco cifras y negativo o positivo");
     int num = Math.abs (Integer.parseInt (System.console().readLine()));//Math.abs tiene en cuenta los números negativos
     int digitos = 0;
     
     if (num < 10) {
       digitos = 1;
     }
     if ((num >=10) && (num <100)) {
       digitos = 2;
     }
     if ((num >=100) && (num < 1000)) {
       digitos = 3;
     }
     if ((num >= 1000) && (num < 10000)) {
       digitos = 4;
     }
     if (num >=10000) {
       digitos = 5;
     }
     System.out.print ("El número introducido tiene " + digitos + " digitos");
   }
 }
