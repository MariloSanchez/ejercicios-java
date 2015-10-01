/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere 
  convertir deberá estar almacenada en una variable.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio4 {
   public static void main (String [] args) {
     int euros = 8;
     double div = 166.386;
     System.out.printf ( "8 euros son  %.2f  pesetas", euros / div); //%.x, es para poner el número de decimales que quieres tener detrás
  }
}
