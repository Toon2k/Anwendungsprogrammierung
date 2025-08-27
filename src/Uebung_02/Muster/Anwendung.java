/*  
  Dateiname     : Anwendung.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Anwendungsklasse, Teil 2 - Warenautomat.
  Version       : 09.10.2020
*/
package Uebung_02.Muster;

public class Anwendung {
  
  public static void main(String [] args)
  {
  Warenautomat automat = new Warenautomat(12, 8);
  Warenautomat automatD = new Warenautomat(); 

    automat.zeigeInfoAn();
    automatD.zeigeInfoAn();
    
    System.out.format("Voreinstellung Edamerbrötchen = %2d%n",
                      Warenautomat.DEFAULTANZAHL_EDAMERBRÖTCHEN);
    System.out.format("Voreinstellung Salamibrötchen = %2d%n",
                      Warenautomat.DEFAULTANZAHL_SALAMIBRÖTCHEN);
                      
  }
  
}
