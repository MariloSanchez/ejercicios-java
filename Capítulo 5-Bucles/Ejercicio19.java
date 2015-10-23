/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
 * teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 *
 * @author Marilo Sanchez
 */

public class Ejercicio19 {
  public static void main (String [] args) {
    
    System.out.print ("Introduce la altura de la que quiere que conste su pirámide: ");
    int altura = Integer.parseInt (System.console().readLine());
    System.out.print ("Introduce el caracter para dibujar la pirámide: ");
    String caracter = System.console().readLine();
    int ultimoPiso = altura + altura - 1;//Numero caracter utimo piso
    for (int i = 1; i <= altura; i ++) {//i-Piso que vamos a dibujar
      int pintado = i+i-1;
      int blanco = ultimoPiso - pintado;
      blanco = blanco/2;//la mitad de blancos en cada lado
      for (int j = 1; j <= blanco + pintado; j++) {//j-Numero de caracteres del piso que vamos a dibujar
        if (j <= blanco){
          System.out.print (" ");
        }else{
          System.out.print (caracter);
        }
      }
              System.out.println();

    }
  }
}        
        
        
        
