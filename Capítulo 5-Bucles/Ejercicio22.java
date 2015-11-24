/**
 *Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio22 {
   public static void main (String [] args) {
     
     System.out.println ("Este programa te mostrará los números primos del 2 al 100:");
    
     boolean esPrimo = true;
     
     for (int num =2; num <= 100; num++) {
       
       //Comprueba si es primo
       esPrimo = true;
       for (int i = 2; i < num; i++) {
         if(num%i == 0) esPrimo = false;
       }
       //Si es primo lo muestra por pantalla
       if (esPrimo){
         System.out.print (num + " ");
       }
     }
     System.out.println();
   }
 }
     
         
