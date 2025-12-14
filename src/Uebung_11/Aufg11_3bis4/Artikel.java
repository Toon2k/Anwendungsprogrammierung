/*  
  Dateiname     : Artikel.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Übung 10, Teil 1.
  Version       : 12.05.2023
*/
package Uebung_11.Aufg11_3bis4;

// Übung 10, Teil 1, a)
abstract public class Artikel{
//Klassen mit mindestens einer abstrakten Methode können abstrakte Klassen sein
    
// Übung 10, Teil 1, b)
  private static final int MIN_ARTIKELNUMMER = 1;
  private static final int MAX_ARTIKELNUMMER = 10000;
  
  private int artikelnummer;

  public Artikel()
  {
    System.out.format("In Konstruktor Artikel()%n");
  }

  public Artikel(int artikelnummer)
         throws FalscheArtikelnummerException
  {
    System.out.format("In Konstruktor Artikel(int)%n");
// Übung 10, Teil 1, c)
// Überprüfung in setArtikelnummer ausgelagert. 
// Eine Stelle für Überprüfung.
    setArtikelnummer(artikelnummer);
  }

// Zugriff auf ein Attribut mit set- und get-Methoden
// Übung 10, Teil 1, c)
// Jetzt nicht mehr jede mögliche Zuweisung erlaubt.
  public final void setArtikelnummer(int artikelnummer)
  throws FalscheArtikelnummerException
  {
    if ( artikelnummer >= MIN_ARTIKELNUMMER
  	 && artikelnummer <= MAX_ARTIKELNUMMER )
      this.artikelnummer = artikelnummer;
    else
      System.out.format("Fehlerhafte Artikelnummer = %d%n",
                        artikelnummer);
      throw new FalscheArtikelnummerException(artikelnummer, MIN_ARTIKELNUMMER, MAX_ARTIKELNUMMER);
  }
    
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