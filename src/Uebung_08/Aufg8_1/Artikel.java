/*  
  Dateiname     : Artikel.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiel für den Einstieg in die Vererbung.
                  Basisklasse Artikel mit Artikelnummer.
  Version       : 08.11.2020
*/
package Uebung_08.Aufg8_1;

public class Artikel{

  private int artikelnummer;

  public Artikel()
  {
    System.out.format("In Konstruktor Artikel()%n");
  }

  public Artikel(int artikelnummer)
  {
    System.out.format("In Konstruktor Artikel(" + artikelnummer + ")%n");
    this.artikelnummer = artikelnummer;
  }

// Zugriff auf ein Attribut mit set- und get-Methoden
// Auch wenn wir hier jede mögliche Zuweisung erlauben.
  public final void setArtikelnummer(int artikelnummer)
  {
    this.artikelnummer = artikelnummer;   	
  }
    
  public final int getArtikelnummer()
  {
    return artikelnummer;   	
  }
    
  public void zeigeInfoAn()
  {
    System.out.format(" Artikelnummer = %d%n", artikelnummer);
  }

  public String toString() {
    return String.format("Dies ist ein Artikel mit Artikelnummer %d", this.getArtikelnummer());
  }

}       // Ende Klasse Artikel