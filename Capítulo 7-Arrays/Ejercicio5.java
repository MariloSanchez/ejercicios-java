/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
respectivamente.
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio5 {
   public static void main (String [] args) { 
     
     System.out.print("Mete 10 números en el array: ");
     
     int [] num = new int [10];
     int maximo=0;
     int minimo=2000;
     
    for (int i = 0; i < 10; i++){
     num [i] = Integer.parseInt (System.console().readLine());
  
      if (num[i] < minimo) {
       minimo = num[i];
      }
      if (num[i] > maximo) {
       maximo = num[i];
      }
    }
     System.out.println("El mínimo es: " + minimo);
     System.out.print("El máximo es: " + maximo);
   }
 }
     
     
