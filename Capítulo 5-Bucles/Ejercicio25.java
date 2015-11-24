/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al
 * revés.
 *
 * @author Marilo Sanchez
 */
 
 public class Ejercicio25 {
   public static void main (String [] args) {
     
     System.out.print ("Introduce un número para mostrartelo al revés: ");
     int numIntro = Integer.parseInt (System.console().readLine());
     
     int volteado = 0;
     
     while (numIntro > 0) {
       volteado = (volteado * 10) + (numIntro % 10);
       numIntro /= 10;
     }
     System.out.print ("Si le damos la vuelta al número obtenemos el " + volteado);
   }
 }
