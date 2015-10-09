/**
 *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
  h. Aplica la fórmula t = √ 2h/g siendo g = 9.81m/s^2
 * 
 * @author Mariló Sánchez
 */

public class Ejercicio6 {
  public static void main (String [] args) {
    
    System.out.println ("Vamos a calcular cuanto tarda en caer un objeto desde una cierta altura");
    System.out.print ("Para ello debe introducir los metros que tiene la caida = ");
    Double m = Double.parseDouble (System.console().readLine());
    
    double resultado = Math.sqrt((m * 2) / (9.81 * 9.81));
    
    System.out.printf ( " El resultado es = %.2f m/s" , resultado) ;
  }
}
