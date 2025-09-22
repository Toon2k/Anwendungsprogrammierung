/*  
  Dateiname     : Buch.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiel für den Einstieg in die Vererbung.
                  Demo Polymorphismus.
                  Ergänzt um Methoden getTitel und toString.
  Version       : 28.10.2021
*/
package Uebung_08.Aufg8_1;

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
  
  public void zeigeInfoAn()
  {
//    System.out.format(" Artikelnummer = %d%n",
//                       getArtikelnummer());
    super.zeigeInfoAn();
    System.out.format(" Titel = %s%n", titel);
  }

  // Neue Methode:
  public String getTitel()
  {
    return titel;
  } 

  public String toString()
  {
    return "Buch mit dem Titel " + titel;
  } 
  
}        // Ende Klasse Buch 




  
