/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 * total (los puntos que suman entre los tres dados).
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio1 {
   public static void main (String [] args) {
     
     int tirada;
     int suma = 0;
     System.out.print("La tirada es: " );
     for (int i = 0; i < 3 ; i++) {
     tirada = (int) (Math.random() * 6) + 1;
     System.out.print(tirada + " , ");
     suma += tirada;
    }
    System.out.print("\nLa suma de la tirada es: " + suma);
  }
}
  
     
