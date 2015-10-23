/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio8 {
   public static void main (String [] args) {
   
   System.out.println ("Introduce un número para mostrar su tabla de múltiplicar: ");
   int num = Integer.parseInt (System.console().readLine());
  
   for (int i = 0; i <=10; i++) {
   System.out.println( num + " x " + i + " = " + num * i);
    }
  }
}
