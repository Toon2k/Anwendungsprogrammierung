/*  
  Dateiname     : Kugelschreiber.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiel für den Einstieg in die Vererbung.
                  Demo Polymorphismus.
                  Ergänzt um Methode getFarbe.
  Version       : 08.11.2020
*/
package Uebung_08.Aufg8_1;

public class Kugelschreiber extends Artikel {

  private String farbe;
  
  public Kugelschreiber(String farbe)
  {
//  	super();   // Wird automatisch eingefügt
    this.farbe = farbe;
  }

  public Kugelschreiber(String farbe, int artikelnummer)
  {
    super(artikelnummer);  
    this.farbe = farbe;
  }
   
  public void zeigeInfoAn()
  {
    super.zeigeInfoAn();
    System.out.format(" Farbe = %s%n", farbe);
  }

  // Neue Methode:
  public String getFarbe()
  {
    return farbe;
  } 

  public String toString() { return String.format("Kugelschreicber mit Farbe %s", this.getFarbe()); }

}                  // Ende Klasse Kugelschreiber
