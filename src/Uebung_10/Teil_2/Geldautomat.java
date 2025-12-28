/*  
  Dateiname     : Geldautomat.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Geldautomat - Mit Basisklasse Automat.
  Version       : 18.11.2020
*/

package Uebung_10.Teil_2;

public class Geldautomat
extends Automat {

  public static final int DEFAULTBETRAG = 20000;
  private int bestand;
  private static final int MIN_BESTAND = 0;
  private static final int MAX_BESTAND = 60000;
  
  public Geldautomat()
  {
    this(DEFAULTBETRAG);
  }
    
  public Geldautomat(int betrag)
  {
    super(); // Ruft Konstruktor in übergeordneter Klasse auf
    if (betrag >= MIN_BESTAND && betrag <= MAX_BESTAND) {
      bestand = betrag;
    }
    else {
      bestand = DEFAULTBETRAG;
    }

  }

  @Override
  public void zeigeInfoAn()
  {
    super.zeigeInfoAn();
    System.out.format("Bestand = %d%n", bestand);
  }

}
