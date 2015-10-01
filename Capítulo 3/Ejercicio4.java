/**
 * Escribe un programa que sume, reste, multiplique y divida dos números 
 introducidos por teclado.
 *
 * @author Mariló Sánchez
 */
 
 public class Ejercicio4 {
   public static void main (String [] args) {
     String linea;
     
     System.out.println ("Introduce un número de tipo entero");
     linea = System.console().readLine();
     int primerNumero = Integer.parseInt (linea);
     
     System.out.println ("Introduce otro número");
     linea = System.console().readLine();
     int segundoNumero = Integer.parseInt (linea);
     
     int suma = primerNumero + segundoNumero;
     int resta = primerNumero - segundoNumero; 
     int mult = primerNumero * segundoNumero;
     double div = (double)primerNumero / segundoNumero;
     
     System.out.println ("La suma de los dos números introducidos es " + suma);
     System.out.println ("La resta de los dos números introducidos es " + resta);
     System.out.println ("La multiplicación de los dos números introducidos es " + mult);
     System.out.println ("La división de los dos números introducidos es " + div);
   }
  }
     
     
      
