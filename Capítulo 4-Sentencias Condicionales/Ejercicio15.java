/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido por
teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El programa
debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando
hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio15 {
   public static void main (String [] args) {
     
     System.out.println (" Elija una opción para elegir el vértice de la pirámide");
     System.out.println ("1) Vértice hacia arriba");
     System.out.println ("2)Vértice hacia abajo");
     System.out.println ("3)Vértice hacia la derecha");
     System.out.println("4)Vértice hacia la izquierda");
      System.out.print ("=>");
      int num = Integer.parseInt (System.console().readLine());
      System.out.println ("Ahora introduzca un carácter ya sea letra, número o símbolo para rellenar la pirámide");
      
      
      String t = System.console().readLine();
      
      switch (num) {
        case 1:
        System.out.println( " "+" "+" "+" "+ t);
        System.out.println( " "+" "+" "+t+t+t);
        System.out.println( " "+" "+t+t+t+t+t+t );
        System.out.println( " "+t+t+t+t+t+t+t+t+t);
        break;
        
        case 2:
        System.out.println(t + t + t + t + t);
        System.out.println(" " + t + t + t);
        System.out.println("  " + t);
        break;
        
        case 3:
        System.out.println(t);
        System.out.println(t + " " + t);
        System.out.println(t + " " + t + " " + t);
        System.out.println(t + " " + t);
        System.out.println(t);
        break;
      
        case 4:
        System.out.println("    " + t);
        System.out.println("  " + t + " " + t);
        System.out.println(t + " " + t + " " + t);
        System.out.println("  " + t + " " + t);
        System.out.println("    " + t);
        break;
       
        default:
    }
  }
}
