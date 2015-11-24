/**
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores
 * a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio29 {
   public static void main (String [] args) {
     
     System.out.print ("Introduce un número relativamente grande ");
     int numGrande = Integer.parseInt (System.console().readLine());
     
     System.out.print("Introduce un número relativamente pequeño: ");
     int numPequeño = Integer.parseInt (System.console().readLine());
     
     System.out.println ("Los números enteros positivos menores a " + numGrande + " que no son divisibles entre " + numPequeño + " son: ");
     for (int i = 1; i < numGrande; i++) {
       if ((i % 30) != 0) {
         System.out.print (i + " ");
       }
     }
   }
 }
  
