/*  
  Dateiname     : Artikel.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Methoden mit final und toString-Methode.
  Version       : 19.11.2023
    
    Lösung für Aufgabe 8.1
*/
package Uebung_10.Teil_1;

public abstract class Artikel{

  private int artikelnummer;
  private static final int MIN_ARTIKELNUMMER = 1;
  private static final int MAX_ARTIKELNUMMER = 10000;

  public Artikel()
  {
    System.out.format("In Konstruktor Artikel()%n");
  }

  public Artikel(int artikelnummer)
  {
    System.out.format("In Konstruktor Artikel(int)%n");
    setArtikelnummer(artikelnummer);
  }

// Zugriff auf ein Attribut mit set- und get-Methoden
// Auch wenn wir hier jede mögliche Zuweisung erlauben.
  
// Kann nicht mehr in abgeleiteter Klasse verändert werden (final)
  public final void setArtikelnummer(int artikelnummer)
  {
    if (artikelnummer >= MIN_ARTIKELNUMMER && artikelnummer <= MAX_ARTIKELNUMMER) {
    this.artikelnummer = artikelnummer;
  }
    else {
      System.out.format("Die angegebene Artikelnummer %d ist ungültig. Sie muss zwischen 1 und 10.000 liegen", artikelnummer);
  }
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