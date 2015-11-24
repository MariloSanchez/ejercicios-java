/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de
 * la semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se
 * puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se
 * debe comprobar que el usuario introduce los datos correctamente y que el segundo día es
 * posterior al primero. A continuación se muestra un ejemplo:
 * Por favor, introduzca la primera hora.
 * Día: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Día: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 * 
 * @author Marilo Sanchez
 */
 
 public class Ejercicio30 {
   public static void main (String [] args) {
     
     System.out.println ("Por favor, introduce la primera hora");
     System.out.print("Día (1-7): ");
     String día = Integer.parseInt (System.console().readLine());
     System.out.print ("Hora (nada de minutos ni segundos): ");
     int hora = Integer.parseInt (System.console().readLine());
     
     System.out.println ("Por favor, introduce la segunda hora");
     System.out.print("Día (1-7): ");
     String díaDos = Integer.parseInt (System.console().readLine());
     System.out.print ("Hora (nada de minutos ni segundos): ");
     int horaDos = Integer.parseInt (System.console().readLine());
