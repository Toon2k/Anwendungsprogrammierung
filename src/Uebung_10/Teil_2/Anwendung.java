/*  
  Dateiname     : Anwendung.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Gemeinsame Anwendungsklasse für 
                  Geldautomat und Warenautomat.
                  Hier noch einzelne Variablen. Sie kennen schon eine
                  bessere Lösung, die wir dann auch noch verwenden werden.
  Version       : 10.04.2022
*/
package Uebung_10.Teil_2;

// import bis201.uebung.uebung05.automaten.Automat;
// Nur nötig, wenn auch Automat direkt verwendet wird.

import Uebung_10.Teil_2.Geldautomat;
import Uebung_10.Teil_2.Warenautomat;

public class Anwendung {
  
  public static void main(String [] args)
  {
  Geldautomat automatG, automatGS;
  Warenautomat automatW, automatWD;

    System.out.format("Höchste Automatennummer = %d%n",
                      Geldautomat.getMaxNummer());

    automatG = new Geldautomat(25000);
    automatGS = new Geldautomat();

    automatG.zeigeInfoAn();
    automatGS.zeigeInfoAn();

    System.out.format("Höchste Automatennummer = %d%n",
                      Geldautomat.getMaxNummer());
    System.out.format("Höchste Automatennummer = %d%n",
                      Warenautomat.getMaxNummer()); 
// Automat.getMaxNummer(), nur mit "import Automat".
// Für andere Elemente hier ist dies nicht nötig
//    System.out.format("Höchste Automatennummer = %d%n",
//                      Automat.getMaxNummer()); 

    automatW = new Warenautomat(12, 8);
    automatWD = new Warenautomat(); 

    automatW.zeigeInfoAn();
    automatWD.zeigeInfoAn();

    System.out.format("Höchste Automatennummer = %d%n",
                      Warenautomat.getMaxNummer());
    System.out.format("Voreinstellung Edamerbrötchen = %2d%n",
                      Warenautomat.DEFAULTANZAHL_EDAMERBROETCHEN);
    System.out.format("Voreinstellung Salamibrötchen = %2d%n",
                      Warenautomat.DEFAULTANZAHL_SALAMIBROETCHEN);

    System.out.format("Automatennummer = %2d%n", 
                      automatG.getAutomatennummer());
    System.out.format("Automatennummer = %2d%n", 
                      automatGS.getAutomatennummer());
    System.out.format("Automatennummer = %2d%n", 
                      automatW.getAutomatennummer());
    System.out.format("Automatennummer = %2d%n", 
                      automatWD.getAutomatennummer());                           
  }
}
  