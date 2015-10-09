/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
por teclado
 *
 * @author Mariló Sánchez
 */
 
 public class Ejercicio2 {
   public static void main (String [] args) {
     
     System.out.println (" ¿Qué hora es? No introduzcas los minutos: ");
     String linea = System.console().readLine();
     int x = Integer.parseInt (linea);
     
      if ((x >= 6) && (x <= 12)) {
      System.out.print ("Buenos días! :D");
    }
      if ((x >= 13) && (x <= 20)) {
        System.out.print ("Buenas tardes");
    }
      if (((x >= 21) && (x <= 24)) || ((x <= 5) && (x >= 1))){
        System.out.print ("Buenas noches!");
    }
      if ((x >= 25) || (x <= 0)) {
        System.out.print ("Esa hora no es correcta");
    }
  }
}
     
    
