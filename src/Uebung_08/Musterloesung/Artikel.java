/*  
  Dateiname     : Artikel.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Methoden mit final und toString-Methode.
  Version       : 19.11.2023
    
    Lösung für Aufgabe 8.1
*/
package Uebung_08.Musterloesung;

public class Artikel{

  private int artikelnummer;

  public Artikel()
  {
    System.out.format("In Konstruktor Artikel()%n");
  }

  public Artikel(int artikelnummer)
  {
    System.out.format("In Konstruktor Artikel(int)%n");
    this.artikelnummer = artikelnummer;
  }

// Zugriff auf ein Attribut mit set- und get-Methoden
// Auch wenn wir hier jede mögliche Zuweisung erlauben.
  
// Kann nicht mehr in abgeleiteter Klasse verändert werden (final)
  public final void setArtikelnummer(int artikelnummer)
  {
    this.artikelnummer = artikelnummer;   	
  }

// Kann nicht mehr in abgeleiteter Klasse verändert werden (final)
  public final int getArtikelnummer()
  {
    return artikelnummer;   	
  }
    
  public void zeigeInfoAn()
  {
    System.out.format(" Artikelnummer = %d%n", artikelnummer);
  }

  @Override
  public String toString()
  {
    return "Artikel mit der Artikelnummer " + artikelnummer;
  } 
  
}       // Ende Klasse Artikel