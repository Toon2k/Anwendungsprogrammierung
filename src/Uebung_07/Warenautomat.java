/*  
  Dateiname     : Warenautomat.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Ausgangspunkt für Übung 5.
  Version       : 10.04.2022
*/
package Uebung_07;

public class Warenautomat extends Automat
{
// Konstanten ("spezielle Klassenattribute")
  public static final int DEFAULTANZAHL_EDAMERBROETCHEN = 50;
  public static final int DEFAULTANZAHL_SALAMIBROETCHEN = 10;

// Instanzenattribute
  private int anzahlEdamerbroetchen;
  private int anzahlSalamibroetchen;
  
// Konstruktoren
  public Warenautomat()
  {
    super();
    anzahlEdamerbroetchen = DEFAULTANZAHL_EDAMERBROETCHEN;
    anzahlSalamibroetchen = DEFAULTANZAHL_SALAMIBROETCHEN;
  }
  
  public Warenautomat(int anzahlEdamerbrötchen,
                      int anzahlSalamibrötchen)
  {
    super();
    this.anzahlEdamerbroetchen = anzahlEdamerbrötchen;
    this.anzahlSalamibroetchen = anzahlSalamibrötchen;
  }

  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", this.getAutomatennummer());
    System.out.format("Anzahl Edamerbrötchen = %2d%n",
            anzahlEdamerbroetchen);
    System.out.format("Anzahl Salamibrötchen = %2d%n",
            anzahlSalamibroetchen);
  }

public String toString() {
    return String.format("Automatennummer: %d%nAnzahl Edamerbrötchen: %d%nAnzahl Salamibrötchen: %d",
            this.getAutomatennummer(), this.anzahlEdamerbroetchen, this.anzahlSalamibroetchen);
}
}