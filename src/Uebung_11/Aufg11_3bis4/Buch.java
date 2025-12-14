/*  
  Dateiname     : Buch.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Methoden mit final und abgeänderte toString-Methode.
  Version       : 12.05.2023
*/
package Uebung_11.Aufg11_3bis4;

public class Buch extends Artikel {

  private String titel;
  
  public Buch(String titel)
  {
    super();
    this.titel = titel;
  }
  
  public Buch(String titel, int artikelnummer)
          throws FalscheArtikelnummerException
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




  
