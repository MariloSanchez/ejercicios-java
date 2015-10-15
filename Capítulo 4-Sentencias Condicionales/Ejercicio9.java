/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax^2 + bx + c =0).
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio9 {
   public static void main (String [] args) {
     
     System.out.println ("Vamos a resolver una ecuacion de segundo grado del tipo ax^2+bx+c = 0");
     System.out.println ("Para ello introduce los valores de: ");
     System.out.print ("a = ");
     double a = Double.parseDouble (System.console().readLine());
     System.out.print ("b = ");
     double b = Double.parseDouble (System.console().readLine());
     System.out.print ("c = ");
     double c = Double.parseDouble (System.console().readLine());
     
      if ((a == 0) && (b == 0) && (c != 0 )) {
        System.out.println ("La ecuación no tiene un resultado real");
      }
      if ((a == 0) && (b != 0) && (c ==0)) {
        System.out.println ("La ecuación no tiene un resultado real");
      }
      if (( a!= 0) && (b == 0) && (c ==0)) {
        System.out.println ("La ecuación no tiene un resultado real");
      }
      if ((a == 0) && (b == 0) && (c == 0)) {
        System.out.println("La ecuación tiene infinitas soluciones.");
      }
      if ((a != 0) && (b != 0) && (c != 0)) {
        double ecuacion = b*b - (4 * a * c);
        System.out.println("x1 = " + (-b + Math.sqrt(ecuacion)));
        System.out.println("x2 = " + (-b - Math.sqrt(ecuacion)));
   }
 }
}

 
