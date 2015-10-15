/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio13 {
   public static void main (String [] args) {
     System.out.println ("Vamos a ordenar 3 números enteros que vayas a introducir");
     System.out.println ("Introduzca el primer número: "); 
     int a = Integer.parseInt (System.console().readLine());
     System.out.println ("Introduzca el segundo número: "); 
     int b = Integer.parseInt (System.console().readLine());
     System.out.println ("Introduzca el tercer número: "); 
     int c = Integer.parseInt (System.console().readLine());
     int aux;
     if ( a > b ) {
       aux = a;
       a = b;
       a = aux;
     }
     if ( b > c ) {
       aux = b;
       b = c;
       b = aux;
     }
     if ( a > c ) {
       aux = c;
       c = b;
       c = aux;
     }
     System.out.println ("Los números introducidos de mayor a menos son " + a + b + c );
   }
 }
       
