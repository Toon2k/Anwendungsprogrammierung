/*  
  Dateiname     : Geldautomat.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Geldautomat - Einstieg.
                  Ein Attribut bestand und eine Methode zeigeInfoAn.
  Version       : 08.10.2020
*/

//package bis201.beispieleausvorlesung.kapitel02.abschnitt2.automat.einstiegsvariante;
package Vorlesung_02;

public class Geldautomat {

  private int bestand;
  
  public Geldautomat(int betrag)
  {
    bestand = betrag;
  }
  // Das Folgende geht nicht:
  /*
  public Geldautomat(int bestand)
  {
    
  }*/
    
  public void zeigeInfoAn()
  {
    System.out.format("Bestand = %d%n", bestand);
  }

}

