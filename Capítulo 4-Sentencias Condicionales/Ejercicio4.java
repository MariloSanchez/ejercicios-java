/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
A partir de la hora 41, se pagan a 16 euros la hora
 *
 * @author Mariló Sánchez
 */
 
 public class Ejercicio4 {
   public static void main (String [] args) {
     
     System.out.print ("Introduce las horas trabajadas a la semana: ");
     String linea = System.console().readLine();
     int horas = Integer.parseInt (linea);
     
     if ((horas >= 0) && (horas <= 40)){
       System.out.println ("Has cobrado a lo largo de la semana " + horas * 12 + " euros");
   }
   if (horas >= 41) {
     System.out.println ("Has cobrado a lo largo de la semana " + ((40 * 12) + (horas- 40) * 16) + " euros");
   }
 }
}
     
  
      
