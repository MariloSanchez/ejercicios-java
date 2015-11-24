/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
   Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
   almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
   deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
   contenido de los tres arrays dispuesto en tres columnas.
 *
 * @author Marilo Sanchez
 */
 
 public class Ejercicio4 {
   public static void main (String [] args) { 
     
     int num [] = new int [20];
     System.out.println("Números\tCuadrado\tCubo");
     System.out.println("-------\t---------\t----");
     
     for ( int i = 0; i < 20; i++) {
       num [i] = (int)(Math.random()*100);
       
        System.out.print(num[i] + "    ");
        System.out.print("      " + num[i] * num[i] + "    ");
        System.out.print("     " + num[i] * num[i] * num[i] + "    ");
        System.out.println();
     }
   }
 }
