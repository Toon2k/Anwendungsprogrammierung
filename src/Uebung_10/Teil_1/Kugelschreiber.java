/*  
  Dateiname     : Kugelschreiber.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Methoden mit final und toString-Methode.
  Version       : 19.11.2023
*/
package Uebung_10.Teil_1;

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
   
  @Override
  public void zeigeInfoAn()
  {
    super.zeigeInfoAn();
    System.out.format(" Farbe = %s%n", farbe);
  }

// Kann nicht mehr in abgeleiteter Klasse verändert werden (final)  
  public final String getFarbe()
  {
    return farbe;
  } 

  @Override
  public String toString()
  {
    return super.toString() + " ist Kugelschreiber mit Farbe " + farbe;
  } 
  
}                  // Ende Klasse Kugelschreiber
