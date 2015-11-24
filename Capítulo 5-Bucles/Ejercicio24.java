/**
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas
como en la siguiente figura:
    1
   121
  12321
 1234321
 * 
 * @author Mariló Sanchez
 */
 
 public class Ejercicio24 {
   public static void main (String [] args) {
     
     System.out.println ("Este programa pintará una pirámide con números");
     System.out.print ("Para ello introduzca la altura de la pirámide: ");
     int alturaIntroducida = Integer.parseInt (System.console().readLine());
     
     int altura = 1;
     int espacios = alturaIntroducida - 1;
     
     while (altura<=alturaIntroducida) {
      
      //pinta los espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print (" ");
      }
      
      //pinta la línea de números
      for (int i = 1; i < altura; i++) {
        System.out.print (i);
      }
      
      for (int i = altura; i > 0; i--) {
        System.out.print (i);
      }
      System.out.println();
      altura++;
      espacios--;
    }
  }
}
