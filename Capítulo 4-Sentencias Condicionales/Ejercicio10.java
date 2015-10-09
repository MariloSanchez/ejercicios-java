/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * @author Mariló Sánchez
 */

public class Ejercicio10 {
  public static void main (String [] args) {
    
    String horoscopo = "";
    
    System.out.println("¿Cuál es tu horóscopo?");
    System.out.println ("Dime el mes de nacimiento (1-12): ");
    int mes = Integer.parseInt (System.console().readLine());
    System.out.println ("Dime el día de nacimiento: " );
    int dia = Integer.parseInt (System.console().readLine());
    
    switch (mes) {
      case 1:
      if (dia <= 19){
        horoscopo = "capricornio";
    } else {
      horoscopo = "acuario";
    }
      break;
      
      case 2:
      if (dia <= 18) {
        horoscopo = "acuario";
      } else {
        horoscopo = "piscis";
      }
        break;
        
      case 3:
      if (dia >= 21) {
        horoscopo = "aries";
      } else {
        horoscopo = "piscis";
      }
        break;
        
      case 4:
      if (dia >= 21) {
        horoscopo = "Tauro";
      } else {
        horoscopo = "Aries";
      }
        break;
        
      case 5:
      if (dia >= 21) {
        horoscopo = "Géminis";
      } else {
        horoscopo = "Tauro";
      }
        break;
        
      case 6:
      if (dia >= 21) {
        horoscopo = "Cáncer";
      } else {
        horoscopo = "Géminis";
      }
        break;
        
      case 7 {
      if (dia >= 21) {
        horoscopo = "Leo";
      } else {
        horoscopo = "Cáncer";
      }
        break;
        
      case 8 {
        if (dia >= 22) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Leo";
        }
          break;
          
        case 9 {
          if (dia >= 23) {
            horoscopo = "Libra";
          } else {
            horoscopo = "Virgo";
          }
            break;
            
          case 10 {
            if (dia >= 23) {
              horoscopo = "Escorpio";
            } else {
              horoscopo = "Libra";
            }
              break;
              
          case 11 {
            if (dia >= 23) {
              horoscopo = "Sagitario";
            } else {
              horoscopo = "Escorpio";
            }
              break;
              
          case 12 {
            if (dia >= 21);
            horoscopo = "Capricornio";
          } else {
            horoscopo = "Sagitario";
          }
            break;
            
        default:
      }
        System.out.println ("Su horóscopo es : " + horoscopo);
  }
}
      
    

        
      
