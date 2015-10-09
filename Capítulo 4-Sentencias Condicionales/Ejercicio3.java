/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
   del día de la semana.
 *
 * @author Mariló Sánchez
 */
 
 public class Ejercicio3 {
   public static void main (String [] args) {
     
     System.out.println ("Escribe un número del 1 al 7 para decirte el día de la semana ");
     String linea = System.console().readLine();
     int x = Integer.parseInt (linea);
     
     if (x == 1) {
       System.out.println ("Lunes");
     }
     if (x == 2) {
       System.out.println ("Martes");
     }
     if (x == 3) {
       System.out.println ("Miércoles");
     }
     if (x == 4) {
       System.out.println ("Jueves");
    }
    if (x == 5) {
      System.out.println ("Viernes");
    }
    if (x == 6) {
      System.out.println ("Sábado");
    }
    if ( x == 7) {
      System.out.println ("Domingo");
    }
    if ( x >= 8) {
      System.out.println ("Ese día de la semana no existe");
    }
  }
}
     
     
     
     
     
