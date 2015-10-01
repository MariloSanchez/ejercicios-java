/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio5 {
   public static void main (String [] args) {
     String linea;
     
     System.out.println ( "Introduzca la base del rectángulo ");
     linea = System.console().readLine();
     double base = Double.parseDouble (linea);
     
     System.out.println ("Introduzca la altura del rectángulo ");
     linea = System.console().readLine();
     double altura = Double.parseDouble (linea);
     
     
     System.out.println ("El área del rectángulo es " + base * altura);
    }
  }
 
