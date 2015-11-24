/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
   los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
   1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
   posición 0. Finalmente, muestra el contenido del array.
 * 
 * @author Marilo Sanchez
 */

  public class Ejercicio6 {
   public static void main (String [] args) { 
     
     System.out.println("Mete 15 números para guardarlos en un array: ");
     int [] num = new int [15];
     int ultimoNum = 0;
     
     for (int i = 0; i < 15; i++) {
       num [i] = Integer.parseInt (System.console().readLine());
     }
     ultimoNum =  num[14];
     
     
     for (int i = 14; i >0; i--) {
       num[i] = num[i-1];
    }
     num[0]=ultimoNum;
     for (int i = 0; i < 15; i++){
     System.out.print(num[i] + " ");
    }
  }
 }
