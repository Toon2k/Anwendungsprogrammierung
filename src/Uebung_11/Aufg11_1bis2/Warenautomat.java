/*  
  Dateiname     : Warenautomat.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201).
  Fragestellung : Warenautomat mit toString.
                  Keine Änderung für Übung 11, bis auf Package,
                  da Basisklasse abgeändert.
  Version       : 12.05.2023
*/
package Uebung_11.Aufg11_1bis2;

public class Warenautomat
extends Automat
{
// Konstanten ("spezielle Klassenattribute"), nur in Klasse lesbar
  private static final int MIN_ANZAHL_BRÖTCHEN = 0;
  private static final int MAX_ANZAHL_BRÖTCHEN = 60;

// Konstanten ("spezielle Klassenattribute"), außerhalb lesbar
  public static final int DEFAULTANZAHL_EDAMERBRÖTCHEN = 50;
  public static final int DEFAULTANZAHL_SALAMIBRÖTCHEN = 10;

// Instanzenattribute
  private int anzahlEdamerbrötchen;
  private int anzahlSalamibrötchen;
  
// Konstruktoren
  public Warenautomat()
  {
// this(DEFAULTANZAHL_EDAMERBRÖTCHEN, DEFAULTANZAHL_SALAMIBRÖTCHEN); 
    anzahlEdamerbrötchen = DEFAULTANZAHL_EDAMERBRÖTCHEN;
    anzahlSalamibrötchen = DEFAULTANZAHL_SALAMIBRÖTCHEN;	
  }
  
  public Warenautomat(int anzahlEdamerbrötchen,
                      int anzahlSalamibrötchen)
  {
// super(); // Automatisch
    if ( anzahlEdamerbrötchen >= MIN_ANZAHL_BRÖTCHEN
  	 && anzahlEdamerbrötchen <= MAX_ANZAHL_BRÖTCHEN )  	
      this.anzahlEdamerbrötchen = anzahlEdamerbrötchen;	

    if ( anzahlSalamibrötchen >= MIN_ANZAHL_BRÖTCHEN
  	 && anzahlSalamibrötchen <= MAX_ANZAHL_BRÖTCHEN )  	
      this.anzahlSalamibrötchen = anzahlSalamibrötchen;	
  }

// Instanzenmethoden
  @Override
  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", getAutomatennummer());
// super.zeigeInfoAn(); // Alternative zur Ausgabe der Automatennummer
    System.out.format("Anzahl Edamerbrötchen = %2d%n", 
                      anzahlEdamerbrötchen);
    System.out.format("Anzahl Salamibrötchen = %2d%n", 
                      anzahlSalamibrötchen);
  }

  @Override
  public String toString()
  {
  StringBuilder info = new StringBuilder("Warenautomat ist " + super.toString());
  
    info = info.append("\n und mit Anzahl Edamerbrötchen = " + anzahlEdamerbrötchen);
    info = info.append("\n und mit Anzahl Salamibrötchen = " + anzahlSalamibrötchen);

    return info.toString();
  }
            
}