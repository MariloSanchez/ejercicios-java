/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio27 {
   public static void main (String [] args) {
     
     System.out.print ("Introduce un número: ");
     int numIntro= Integer.parseInt (System.console().readLine());
      int cuenta = 0;
      int suma = 0;
     
    for ( int i = 1; i < numIntro; i++) {
       if (( i % 3) == 0) {
         System.out.print (i + " ");
         cuenta++;
         suma +=i;
      }
    }
     System.out.print( "\nDesde 1 hasta " + numIntro + " hay " + cuenta+"\n");
     System.out.print( "La suma de todos ellos es " + suma);
   }
 }

