/**
 * Realiza un programa que calcule la media de tres notas.
 * @author Mariló Sánchez
 */
 
 public class Ejercicio7 {
   public static void main (String [] args) {
     
     System.out.println ("Vamos a calcular la media de tres notas");
     System.out.print ("Para ello introduceme la primera nota = ");
     Double a = Double.parseDouble (System.console().readLine());
     System.out.print ("Introduce la segunda nota =  ");
     Double b = Double.parseDouble (System.console().readLine());
     System.out.print ("Introduce la tercera nota =  ");
     Double c = Double.parseDouble (System.console().readLine());
     
     double nota = a + b + c;
     double resultado = nota / 3;
     
     System.out.print ("La media de esas tres notas es = " + resultado);
   }
 }
