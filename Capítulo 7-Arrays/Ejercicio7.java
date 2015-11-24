/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
   por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
   y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
   la lista generada anteriormente. Los números que se han cambiado deben aparecer
   entrecomillados..
 * 
 * @author Marilo Sanchez
 */

  public class Ejercicio7 {
   public static void main (String [] args) { 
     
     System.out.println("100 números aleatorios del 0 al 20");
     int [] numero = new int [100];
     
     for (int i = 0; i < 100; i++){ //generamos los 100 numeros 
      numero [i] = (int)(Math.random()*21); //generamos numeros aleatorios desde 0 hasta 20
      
      System.out.print(numero [i] + " " );
    }
  }
}
     
      
       
