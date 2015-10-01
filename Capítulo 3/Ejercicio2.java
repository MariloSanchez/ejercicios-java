/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
   convertir debe ser introducida por teclado.
 *
 * @author Mariló Sánchez
 */

public class Ejercicio2 {
  public static void main (String [] args) {
    String linea;
    
    System.out.println ("Introduzca una cantidad de euro ");
    linea = System.console().readLine();
    double euro = Double.parseDouble(linea);
    double peseta = 166.386;
    
    System.out.println ( "La cantidad introducida en pesetas es " + euro * peseta);
  }
}
    
    
    
