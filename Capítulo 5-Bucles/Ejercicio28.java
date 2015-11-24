/**
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio28 {
   public static void main (String [] args) {
     
     System.out.print ("Introduce un número para calcular el factorial: ");
     int numIntro = Integer.parseInt (System.console().readLine());
     
     int factorial = numIntro;
     
     for (int i = 1; i < numIntro; i++) {
     factorial *= i;
    }
    System.out.print("El factorial de " + numIntro + " es " + factorial);
  }
}



