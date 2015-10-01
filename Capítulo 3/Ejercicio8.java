/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a 
 las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio8 {
   public static void main (String [] args) {
     String linea;

     System.out.println ("Introduzcas las horas trabajadar en un día ");
     linea = System.console().readLine();
     int horasDias = Integer.parseInt (linea);
     int horasSem = horasDias * 5;
     
     System.out.println ("En una semana trabajas " + horasSem + " horas");
     System.out.println ("Si te pagan 12 euros la hora en una semana has cobrado " + (horasSem * 12));
  }
}
     
