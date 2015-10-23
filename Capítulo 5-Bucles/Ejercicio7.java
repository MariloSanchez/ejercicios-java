/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 *El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
 *mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 *ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Mariló Sánchez
 */
 
 public class Ejercicio7 {
   public static void main (String [] ars) {
     
     int numero;
     boolean salir = false; //salir es falso si quedan oportunidades y todavia 
                             //no hemos introducido correctamente la contraseña
     int intentos = 0;
     do {
       System.out.println ("Contraseña de la caja fuerte: ");
       numero = Integer.parseInt (System.console().readLine());
       
       if ( numero == 1234 ) {
         salir = true;
       } else { 
         System.out.println ("Lo siento, esa no es la combinación");
       }
       if ((intentos == 4) && (!salir)) {
         System.out.println ("Ha agotado los 4 intentos");
         salir = true;
         
       };//intentos = intentos +1
     } while ( !salir );
   }
 }  
