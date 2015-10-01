/**
 * Realiza un programa que pida dos números y que luego muestre el resultado de 
  su multiplicación
  * 
  * @author Mariló Sánchez
  */
  
  public class Ejercicio1 {
    public static void main (String [] args) {
    String linea;
    
    System.out.println ("Por favor, introduce un número ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt (linea);
    
    System.out.println ("Por favor, introduce otro número ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt (linea);
    
    int mult = segundoNumero * primerNumero;
    
    System.out.println ("La multiplicación de ambos números es " + mult);
  }
}
