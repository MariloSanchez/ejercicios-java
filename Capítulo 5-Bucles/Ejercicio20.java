/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author MArilo Sanchez
 */ 
 
public class Ejercicio20 {
  public static void main (String [] args) {
    
    System.out.print ("Introduce la altura de la que quiere que conste su pirámide: ");
    int altura = Integer.parseInt (System.console().readLine());
    System.out.print ("Introduce el caracter para dibujar la pirámide: ");
    String caracter = System.console().readLine();
    
    int i,a,j;
    int espaciosDelanteros = altura -1;
    int espaciosInternos = 1;
    
    for ( a = 0; a < altura - 1; a++) {//Los espacios en blanco que hay
        if ( a == 0) {//la primera vez que entramos para pintarme la primera fila
          for (i =0; i < espaciosDelanteros; i++) {//pintar los espacios en blanco
            System.out.print ( " ");//mostrarlos
        }
        System.out.print (caracter);//pinta el caracter
        espaciosDelanteros --;//decrementa espacios delanteros porque cada vez es uno menos
        }
        if ((a > 0) && (a < altura)){//para pintar el cuerpo de la piramide
            for (i =0; i < espaciosDelanteros; i++) {
              System.out.print (" ");
            }
             espaciosDelanteros --;
            System.out.print (caracter);
            for ( j = 0; j < espaciosInternos; j++) {
              System.out.print (" ");
            }
           espaciosInternos += 2;
           System.out.print (caracter);
              
        }  
        System.out.println();
      }
      for ( a = 0; a < (altura * 2) -1; a++) {//pinta la base
        System.out.print (caracter);
      }
      
    }
  }
    

    
   
      
 
