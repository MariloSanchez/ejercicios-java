/**
 *Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
notable o sobresaliente).
 * 
 * @author Mariló Sánchez
 */ 

public class Ejercicio8 {
   public static void main (String [] args) {
     
     System.out.println ("Vamos a calcular la media de tres notas");
     System.out.print ("Para ello introduceme la primera nota = ");
     Double a = Double.parseDouble (System.console().readLine());
     System.out.print ("Introduce la segunda nota =  ");
     Double b = Double.parseDouble (System.console().readLine());
     System.out.print ("Introduce la tercera nota =  ");
     Double c = Double.parseDouble (System.console().readLine());
     
     double resultado = (a + b + c) / 3;
     
     if ((resultado <= 4) && (resultado >= 0)) {
       System.out.println ("La media de esas tres notas es = " + resultado + " por lo que es un insuficiente");
    }
     if (resultado == 5) {
       System.out.println ("La media de esas tres notas es = " + resultado + " por lo que es un suficiente");
    }
     if ((resultado >= 6) && (resultado <=7)) {
       System.out.println ("La media de esas tres notas es = " + resultado + " por lo que es un bien");
    }
     if (resultado == 8) {
       System.out.println ("La media de esas tres notas es = " + resultado + " por lo que es un notable");
    }
     if ((resultado >= 9) && (resultado <= 10)) {
       System.out.printf ("La media de esas tres notas es = %.2f" + resultado + " por lo que es un sobresaliente");
    }
  }
 }
