/*  
  Dateiname     : Anwendung.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Rahmen Anwendungsklasse.
  Version       : 14.10.2024
*/
//Bitte entsprechend anpassen:
package Uebung_02;

public class Anwendung {

  public static void main(String [] args)
  {
   Warenautomat warenautomat1 = new Warenautomat(5, 8);
   Warenautomat warenautomat2 = new Warenautomat();

   warenautomat1.zeigeAnzahl();
   warenautomat2.zeigeAnzahl();
  }

}









