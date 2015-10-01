/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere 
   convertir debe ser introducida por teclado.Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
debe ser introducida por teclado.
 *
 * @author Mariló Sánchez
 */
 public class Ejercicio3 {
   public static void main (String [] args) {
     String linea;
     
    System.out.println ("Introduzca una cantidad de peseta ");
    linea = System.console().readLine();
    double euro = Double.parseDouble(linea);
    double peseta = 166.386;
    
    System.out.printf ( "La cantidad introducida %.2f son euros " , euro / peseta);
  }
}
