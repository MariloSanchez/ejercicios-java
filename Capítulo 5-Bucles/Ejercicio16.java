/**
 * Escribe un programa que diga si un número introducido por teclado es o no primo. Un
 * número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio16 {
   public static void main (String [] args) {
     
     System.out.print ("Introduce un número y sabrás si es primo o no: ");
     int numIntro = Integer.parseInt (System.console().readLine());
     boolean esPrimo = true;
     
     
     for (int i = 2; i < numIntro; i++) {
       if (( numIntro %i) == 0){
         esPrimo = false;
        }
      }
        if (esPrimo) {
          System.out.print ( "El número es primo");
        } else {
          System.out.print ( "El número no es primo");
        }
      }
    }
        

    
       
       
       
     
