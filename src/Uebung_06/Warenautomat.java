/*  
  Dateiname     : Warenautomat.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Ausgangspunkt für Übung 5.
  Version       : 10.04.2022
*/
package Uebung_06;

public class Warenautomat extends Automat
{
// Konstanten ("spezielle Klassenattribute")
  public static final int DEFAULTANZAHL_EDAMERBRÖTCHEN = 50;
  public static final int DEFAULTANZAHL_SALAMIBRÖTCHEN = 10;

// Instanzenattribute
  private int anzahlEdamerbrötchen;
  private int anzahlSalamibrötchen;
  
// Konstruktoren
  public Warenautomat()
  {
    super();
    anzahlEdamerbrötchen = DEFAULTANZAHL_EDAMERBRÖTCHEN;
    anzahlSalamibrötchen = DEFAULTANZAHL_SALAMIBRÖTCHEN;	
  }
  
  public Warenautomat(int anzahlEdamerbrötchen,
                      int anzahlSalamibrötchen)
  {
    super();
    this.anzahlEdamerbrötchen = anzahlEdamerbrötchen;	
    this.anzahlSalamibrötchen = anzahlSalamibrötchen;	
  }

  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", this.getAutomatennummer());
    System.out.format("Anzahl Edamerbrötchen = %2d%n", 
                      anzahlEdamerbrötchen);
    System.out.format("Anzahl Salamibrötchen = %2d%n", 
                      anzahlSalamibrötchen);
  }
            
}