/**
 *Escribe un programa en el que se declaren las variables enteras x e y . Asignales los valores
144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
la suma, la resta, la división y la multiplicación.
 *
 *@author Mariló Sánchez Cañete
 */

public class Ejercicio1 {
  public static void main (String [] args) {
    int x = 144;
    int y = 999;
    int sum = x + y;
      System.out.println ("La suma de mis variables es " + sum);
    int rest = x - y;
      System.out.println ("La resta de mis variables es " + rest);
    int div = y / x;
      System.out.println ("La división de mis variables es " + div);
    int mult = x * y;
      System.out.println ("La multiplicación de mis variables es " + mult);  
    }
  }
