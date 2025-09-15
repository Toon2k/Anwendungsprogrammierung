/*  
  Dateiname     : Geldautomat.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Ausgangspunkt für Übung 5.
  Version       : 10.04.2022
*/

//Bitte anpassen:
package Uebung_06;

public class Geldautomat extends Automat {

  public static final int DEFAULTBETRAG = 20000;
  private int bestand;

  public Geldautomat()
  {
    super();
    bestand = DEFAULTBETRAG;
  }
    
  public Geldautomat(int betrag)
  {
    super();
    bestand = betrag;
  }

  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", this.getAutomatennummer());
    System.out.format("Bestand = %d%n", bestand);
  }

}
