/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
 * y cuántos son negativos.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio13 {
   public static void main (String [] args){
   int i = 0;
   int negativo = 0;
   int positivo = 0;
   int numIntro;
    
    
    do {
      System.out.print (" Introduce un número: ");
      numIntro = Integer.parseInt(System.console().readLine());
      if (numIntro >= 0) {
        positivo++;
      }else{
        negativo++;
      }
      i++;
      }while (i < 10);
      System.out.print (" Hay " + positivo + " números positivos y " + negativo + " números negativos");
    }
  }
