/*  
  Dateiname     : Buch.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Methoden mit final und abgeänderte toString-Methode.
  Version       : 19.11.2023
*/
package Uebung_10.Teil_1;

public class Buch extends Artikel {

  private String titel;
  
  public Buch(String titel)
  {
    super();
    this.titel = titel;
  }
  
  public Buch(String titel, int artikelnummer)
  {
    super(artikelnummer);
    this.titel = titel;
  }
  
  @Override
  public void zeigeInfoAn()
  {
//    System.out.format(" Artikelnummer = %d%n",
//                       getArtikelnummer());
    super.zeigeInfoAn();
    System.out.format(" Titel = %s%n", titel);
  }

// Kann nicht mehr in abgeleiteter Klasse verändert werden (final)  
  public final String getTitel()
  {
    return titel;
  } 

  @Override
  public String toString()
  {
    return super.toString() + " ist Buch mit dem Titel " + titel;
  } 

}        // Ende Klasse Buch 




  
