/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo
 * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
 * número positivo).
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio17 {
   public static void main (String [] args) {
     
     int numIntro = 0;
     int suma = 0;
     do {
       System.out.print ("Introduce un número entero y positivo para sumar los siguientes 100: ");
       numIntro = Integer.parseInt (System.console().readLine());
     if (numIntro < 0 ) {
       System.out.print ( " El número dado no es válido ") ;
     }
   }while (numIntro < 0);
         for (int i = (numIntro +1); i <= (100 + numIntro); i++) {
           suma += numIntro;
         }
       
           
           System.out.print (suma);
  }
}

