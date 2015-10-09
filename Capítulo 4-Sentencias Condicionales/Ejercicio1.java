/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
toca a primera hora ese día.
 * 
 * @author Mariló Sánchez
 */
 
public class Ejercicio1 {
  public static void main (String [] args) {
    System.out.print ("Introduzca un día de la semana = ");
    String DiaSemana = System.console().readLine();
    
    
    switch (DiaSemana) {
      case "Lunes":
      System.out.println ("Fol");
      break;
      case "Martes":
      System.out.println ("Programación");
      break;
      case "Miércoles" :
      System.out.println ("Sistemas informáticos");
      break;
      case "Jueves":
      System.out.println ("Programación");
      break;
      case "Viernes":
      System.out.println ("Base de datos");
      break;
      case "Sábado":
      case "Domingo":
      System.out.println ("Ese día no hay clases");
      break;
      default:
      System.out.println ("No existe ese día de la semana");
    }
    
  }
}
