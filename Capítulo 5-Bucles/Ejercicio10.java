/**
 *Escribe un programa que calcule la media de un conjunto de números positivos introduci-
dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo. 
 * 
 * @author Mariló Sánchez
 */

public class Ejercicio10 {
  public static void main (String [] args){
  
  double nueva = 0;//variable para dividir entre los numeros que has introducido
  double numIntro = 0;
  double suma = 0;
   
    System.out.println ("Introduce números positivos. Cuando quieras parar introduce uno negativo: ");
  
  
  while (numIntro >= 0) {
    numIntro = Integer.parseInt (System.console().readLine());
      nueva++;//incrementas la variable para saber cuantos numeros me han dado
      suma+= numIntro;
    }
    
  System.out.print ("La media de los números introducidos es: " + (suma + numIntro)/ (nueva - 1));//la variable nueva la divides por el numero de veces que has introducido un numero positivo
}
}
