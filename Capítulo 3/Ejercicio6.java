/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio5 {
   public static void main (String [] args) {
     String linea;
     
     System.out.println ( "Introduzca la base del triángulo ");
     linea = System.console().readLine();
     double base = Double.parseDouble (linea);
     
     System.out.println ("Introduzca la altura del triángulo ");
     linea = System.console().readLine();
     double altura = Double.parseDouble (linea);
     
     
     System.out.println ("El área del triángulo es " + (base * altura) / 2);
    }
  }
