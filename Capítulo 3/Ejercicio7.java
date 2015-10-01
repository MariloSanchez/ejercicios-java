/**
 * Escribe un programa que calcule el total de una factura a partir de la base 
 imponible.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio7 {
   public static void main (String [] args){
     String linea;
     
     System.out.println ("Introduce la base imponible de tu factura ");
     linea = System.console().readLine();
     double baseImponible = Double.parseDouble (linea);
     double facIva = baseImponible * 0.21;
     
     System.out.println ("El I.V.A. es 21%, por lo que el I.V.A de tu factura es " + facIva);
     
     System.out.println ("El total de tu factura es " + (facIva + baseImponible));
  }
}
     
