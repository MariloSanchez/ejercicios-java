/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por el
 * menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio18 {
   public static void main (String [] args) {
     
     int primerNum;
     int segundoNum;
     
     do { 
     System.out.print ("Introduce un primer número entero: ");
     primerNum = Integer.parseInt (System.console().readLine());
     System.out.print ("Introduce ahora el segundo número: ");
     segundoNum = Integer.parseInt (System.console().readLine());
     
     } while (primerNum == segundoNum);
       
     if ( primerNum < segundoNum) {
     
       for ( int i = primerNum; i <= segundoNum; i += 7) {
         System.out.print ( i + " " );
       }
     }else if ( segundoNum < primerNum) {
       for ( int i = segundoNum; i <= primerNum; i += 7) {
         System.out.print (i + " ");
       }
     }
  
   }
 }
