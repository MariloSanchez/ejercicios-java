/**
 *Escribe un programa que dada una hora determinada (horas y minutos), calcule los
segundos que faltan para llegar a la medianoche. 
 * 
 * @author Mariló Sánchez 
 */
 
 public class Ejercicio11 {
   public static void main (String [] args) {
     
     System.out.println("¿Cuánto falta para la media noche?");
     System.out.print("Introduce la hora ");
     int hora = Integer.parseInt (System.console().readLine());
     System.out.print("Introduce los minutos ");
     int min = Integer.parseInt (System.console().readLine());
     
     int hfalta = 24 - hora ; //Las horas que faltan para la media noche
     int minfalta = 60 - min;//Los min que faltan para media noche
     int segundoshora= hfalta * 3600;//Las horas pasadas a segundos
     int segundosmin = minfalta * 60;//Los minutos pasados a segundos
     int falta = segundoshora + segundosmin;
     System.out.print("Falta " + falta + " segundos para que sea media noche");
   }
 }
     
   
     
     
    
