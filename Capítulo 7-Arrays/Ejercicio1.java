/**
 * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
   que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
   sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio1 {
   public static void main (String [] args) {
     
     int [] n = new int [12];
     n[0]=39;
     n[1]=-2;
     n[4]=0;
     n[6]=14;
     n[8]=5;
     n[9]=120;
     
     System.out.println("Los arrays son los siguientes: ");
     for (int i = 0; i < 12; i++) {
       System.out.print(n[i] + " ");
     }
   }
 }
       
     
