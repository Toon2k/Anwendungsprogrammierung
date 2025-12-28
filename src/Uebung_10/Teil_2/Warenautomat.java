/*  
  Dateiname     : Warenautomat.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Warenautomat mit Basisklasse Automat.
  Version       : 27.10.2021
*/

package Uebung_10.Teil_2;

public class Warenautomat
extends Automat
{
// Konstanten ("spezielle Klassenattribute")
  public static final int DEFAULTANZAHL_EDAMERBROETCHEN = 50;
  public static final int DEFAULTANZAHL_SALAMIBROETCHEN = 10;
  private static final int MIN_BROETCHEN = 0;
  private static final int MAX_BROETCHEN = 60;

// Instanzenattribute
  private int anzahlEdamerbroetchen;
  private int anzahlSalamibroetchen;

  
// Konstruktoren
  public Warenautomat()
  {
// this(DEFAULTANZAHL_EDAMERBRÖTCHEN, DEFAULTANZAHL_SALAMIBRÖTCHEN); 
    anzahlEdamerbroetchen = DEFAULTANZAHL_EDAMERBROETCHEN;
    anzahlSalamibroetchen = DEFAULTANZAHL_SALAMIBROETCHEN;
  }
  
  public Warenautomat(int anzahlEdamerbroetchen,
                      int anzahlSalamibroetchen)
  {
// super(); // Automatisch
    if(anzahlEdamerbroetchen >= MIN_BROETCHEN && anzahlEdamerbroetchen <= MAX_BROETCHEN) {
      this.anzahlEdamerbroetchen = anzahlEdamerbroetchen;
    }

    if(anzahlSalamibroetchen >= MIN_BROETCHEN && anzahlSalamibroetchen <= MAX_BROETCHEN) {
      this.anzahlSalamibroetchen = anzahlSalamibroetchen;
    }

  }

// Instanzenmethoden
  @Override
  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", getAutomatennummer());
// super.zeigeInfoAn(); // Alternative zur Ausgabe der Automatennummer
    System.out.format("Anzahl Edamerbrötchen = %2d%n",
            anzahlEdamerbroetchen);
    System.out.format("Anzahl Salamibrötchen = %2d%n",
            anzahlSalamibroetchen);
  }
            
}