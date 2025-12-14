/*  
  Dateiname     : Anwendung.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201).
  Fragestellung : Gemeinsame Anwendungsklasse für 
                  Geldautomat und Warenautomat.
                  Übung 11, Teil 1
  Version       : 23.05.2025
*/
package Uebung_11.Aufg11_1bis2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Anwendung {
  
  public static void main(String [] args)
  {  	
  Automat [] vieleAutomaten = new Automat[5]; 

    System.out.format("Höchste Automatennummer = %d%n",
                      Geldautomat.getMaxNummer());
// Automat jetzt abstrakt, so also nicht mehr verwendbar
//    vieleAutomaten[0] = new Automat();
// Beispiel für zu hohen Betrag, 
// dann wird Defaultbetrag gesetzt
    vieleAutomaten[0] = new Geldautomat(60000);
    vieleAutomaten[1] = new Geldautomat(25000);
    vieleAutomaten[2] = new Geldautomat();
    vieleAutomaten[3] = new Warenautomat(12, 8);
    vieleAutomaten[4] = new Warenautomat();

    System.out.format("%nfor:%n");
    for (int i = 0; i < vieleAutomaten.length; i++) {
      System.out.format("Automatennummer ist %2d%n", 
                        vieleAutomaten[i].getAutomatennummer());
      vieleAutomaten[i].zeigeInfoAn();
    }
    // foreach
    System.out.format("%n\"foreach\":%n");
    for (Automat einAutomat : vieleAutomaten) {
      System.out.format("Automatennummer ist %2d%n", 
                        einAutomat.getAutomatennummer());
      einAutomat.zeigeInfoAn();
    }
    
    System.out.format("%nHöchste Automatennummer = %d%n",
                      Warenautomat.getMaxNummer());
    System.out.format("Voreinstellung Edamerbrötchen = %2d%n",
                      Warenautomat.DEFAULTANZAHL_EDAMERBRÖTCHEN);
    System.out.format("Voreinstellung Salamibrötchen = %2d%n",
                      Warenautomat.DEFAULTANZAHL_SALAMIBRÖTCHEN);
                      
    druckeListe(vieleAutomaten);

// Zu Übung 11, Teil 1    
    int nummer = 2000;
    try {
//      Automat.speichereAutomatennummer();
      Automat.speichereAutomatennummer(nummer);
//      System.out.format("Nummer = %d eingetragen%n",
//                        nummer);
    }
    catch (FileNotFoundException fnfe) {
      System.out.format("fnfe-Fehlernachricht: %s", fnfe.getMessage());
    }
    catch (IOException ioe) {
      System.out.format("ioe-Fehlernachricht: %s", ioe.getMessage());
    }
  }
  
  public static void druckeListe(Automat [] mehrereAutomaten)
  {
    System.out.format("%n\"druckeListe\":%n");
    for (Automat einAutomat : mehrereAutomaten) {
      System.out.format("%s%n", einAutomat.toString());
      einAutomat.zeigeInfoAn();
    }
    	
  }
  
}
