/**
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
 * término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 * 144... El número n se debe introducir por teclado.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio12 {
   public static void main (String [] args) {
     
     System.out.print ("Introduce un número para mostrarte los n primeros números de la serie Fibonacci: ");
     int numIntro = Integer.parseInt (System.console().readLine());
     
     switch (numIntro) {
       case 1:
       System.out.println ("0");
       break;
       case 2:
       System.out.println ("0  1");
       break;
       default:
       System.out.print (" 0 1 ");
       int f1 = 0;
       int f2 = 1;
       int aux;
       while ( numIntro > 2 ) {
         aux = f1;
         f1 = f2;
         f2 = aux + f2;
         System.out.print ( "  " + f2);
         numIntro--;
       }
     }
     System.out.print("");
   }
 }
         
     
