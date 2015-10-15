/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio12 {
   public static void main (String [] args) {
     
     int puntos = 0;
     String respuesta;
     
      System.out.println ("CUESTIONARIO");
      
      System.out.println ("1º ¿Cuál es el lenguaje con el que estamos programando en Geany?");
      System.out.println ("a) HTML");
      System.out.println ("b)JAVA");
      System.out.println ("c)PHP");
      respuesta = System.console().readLine();
      if (respuesta.equals("b")) {
       puntos++;
     
      }
      
      System.out.println ("2º ¿La RAM es necesaria para que un ordenador encienda?");
      System.out.println ("a)Sí");
      System.out.println ("b)No");
      System.out.println ("c)Los pollos pían");
      respuesta = System.console().readLine();
      if (respuesta.equals("a")) {
        puntos++;
      }
      
      System.out.println ("3º ¿Qué etiqueta se utiliza para poner una palabra en negrita?");
      System.out.println ("a)<p>");
      System.out.println ("b)<h1>");
      System.out.println ("c)<b>");
      respuesta = System.console().readLine();
      if (respuesta.equals("c")) {
        puntos++;
      }
      
      System.out.print (" Ha obtenido " +  puntos + " puntos");
    }
  }
