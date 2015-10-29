/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
  negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
  de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
  datos pero no se incluye en el cómputo.
 *
 * @author Marilo Sanchez
 */
 
 public class Ejercicio21 {
   public static void main (String [] args) {
     
     System.out.println ("Ve introduciendo números y cuando quieras parar introduce uno negrativo");
     
     int impares=0;
     int pares=0;
     int sumaImpares=0;
     int maximoPar=0;
     int numIntro; 
     int totalImpares=0;
      
     do {
     
     numIntro = Integer.parseInt (System.console().readLine());
     
      if ((numIntro%2) == 1) {
        sumaImpares += numIntro;
        totalImpares++;
        
      }else{
        if (numIntro > maximoPar) {
        maximoPar = numIntro; 
        }
      }
   }while (numIntro >= 0);
   numIntro--; //quitando de la cuenta el ultimo número introducido
   
   System.out.println ("La media de los números impares es= " + sumaImpares/totalImpares);
   System.out.print ("El mayor número par que has introducido es= " + maximoPar);
 }
}
     
