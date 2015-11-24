/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
   inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 *
 * @author Marilo Sanchez
 */
 
 public class Ejercicio3 {
   public static void main (String [] args) {
     
     System.out.print("Introduce 10 números: ");
     int [] num = new int [10];
     
     for (int i = 0; i < 10;i++) {
       num [i]= Integer.parseInt (System.console().readLine());
     }
     
     System.out.println("Los arrays son los siguientes: ");
     for (int j = 9; j >= 0; j--) {
       System.out.print(num[j] + " ");
     }
   }
 }
