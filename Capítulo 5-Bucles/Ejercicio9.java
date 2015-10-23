/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Mariló Sánchez 
 */
 
 public class Ejercicio9 {
   public static void main (String [] args) {
     
    int numDigitos = 1;
    
     System.out.println("Introduzca un número: ");
      int num = Math.abs (Integer.parseInt(System.console().readLine()));//Math.abs cuenta los num negativos
     
     
   while ( num > 10) { 
       num /= 10;
       numDigitos++;
     }
     System.out.println ( "El número tiene " + numDigitos + " cifras");
   }
 }
