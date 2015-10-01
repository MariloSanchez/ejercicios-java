/**
 * Escribe un programa que calcule el total de una factura a partir de la base 
   imponible (precio sin IVA). La base imponible estará almacenada en una 
   variable.
 *
 * @author Mariló Sánchez
 */
 
 public class Ejercicio6 {
   public static void main (String [] args ) {
     int BaseImponible = 50;
     double iva = 0.21;
     double result= 50 * 0.21;
     double total = result + BaseImponible;	
     System.out.println ("El total de mi factura es " + total);
  }
}
