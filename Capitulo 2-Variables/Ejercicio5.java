/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir
   deberá estar almacenada en una variable.
 *
 * @author Mariló Sánchez
 */
 
 public class Ejercicio5 {
   public static void main (String [] args) {
     int pesetas = 20;
     double mult = 166.386;
     System.out.printf ( "20 pesetas son  %.2f  euros", pesetas / mult); //%.x, es para poner el número de decimales que quieres tener detrás
  }
}   
