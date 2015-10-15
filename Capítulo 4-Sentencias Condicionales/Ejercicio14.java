/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o divisible
entre 5.
 * 
 * @author Mariló Sánchez
 */

public class Ejercicio14 {
  public static void main (String [] args);
  System.out.println ("Introduzca un número entero para saber si es par y divisible entre 5: ");
  int num = Integer.parseInt (System.console().readLine());
  
  if ((num % 2) == 0) {
    System.out.print ("El número introducido es par");
  } else { 
    System.out.print ("El número introducido es impar");
  }
    
    if ((num % 5) == 0) {
      System.out.print ("El número es divisible entre 5");
    } else {
      System.out.print ("El número no es divisible entre 5");
    }
  }
}
