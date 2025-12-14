/*  
  Dateiname     : Geldautomat.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Geldautomat - Mit toString.
                  Keine Änderung für Übung 11, bis auf Package,
                  da Basisklasse abgeändert.
  Version       : 12.05.2023
*/
package Uebung_11.Aufg11_1bis2;

public class Geldautomat
extends Automat {

  private static final int MIN_BESTAND = 0;
  private static final int MAX_BESTAND = 60000;

  public static final int DEFAULTBETRAG = 20000;
  private int bestand;
  
  public Geldautomat()
  {
    this(DEFAULTBETRAG);
  }
    
  public Geldautomat(int betrag)
  {
    super();
    if ( betrag >= MIN_BESTAND
  	 && betrag <= MAX_BESTAND )  	
      bestand = betrag;
    else
      bestand = DEFAULTBETRAG;
  }

  @Override
  public void zeigeInfoAn()
  {
    super.zeigeInfoAn();
    System.out.format("Bestand = %d%n", bestand);
  }

  @Override
  public String toString()
  {
    return "Geldautomat ist " + super.toString() + 
           "\n und mit Bestand " + bestand;
  }

}
