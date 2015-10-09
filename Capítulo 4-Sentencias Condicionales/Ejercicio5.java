/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio5 {
   public static void main (String [] args) {
     
    System.out.println ("Vamos a reolver una ecuación del tipo: ax + b = 0");
    System.out.print ("Para ello introduzca el valor de a = ");
    Double a = Double.parseDouble (System.console().readLine());
    
    System.out.print ("Y ahora introduzca el valor de b = ");
    Double b = Double.parseDouble (System.console().readLine());
    
    if (a == 0) {
      System.out.println ("La ecuación no tiene un valor real");
    } else {
    System.out.print ( "x = " + ( -b / a) );
  }
  }
}
