/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido
 *por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio18 {
   public static void main (String [] args) {
     System.out.print ("Introduce un número entero. Máximo 5 cifra: ");
     int num = Integer.parseInt (System.console().readLine());
     int primera = 0;
     
     if ( num < 10 ) {
      primera = num;
    }
    
    if (( num >= 10 ) && ( num < 100 )) {
      primera = num / 10;
    }
    
    if (( num >= 100 ) && ( num < 1000 )) {
      primera = num / 100;
    }
    
    if (( num >= 1000 ) && ( num < 10000 )) {
      primera = num / 1000;
    }
    
    if ( num >= 10000 ) {
      primera = num / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primera);
  }
 }
 
     
