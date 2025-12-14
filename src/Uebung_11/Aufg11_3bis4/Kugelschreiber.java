/*  
  Dateiname     : Kugelschreiber.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Methoden mit final und toString-Methode.
  Version       : 12.05.2023
*/
package Uebung_11.Aufg11_3bis4;

public class Kugelschreiber extends Artikel {

  private String farbe;
  
  public Kugelschreiber(String farbe)
  {
//  	super();   // Wird automatisch eingefügt
    this.farbe = farbe;
  }

  public Kugelschreiber(String farbe, int artikelnummer)
          throws FalscheArtikelnummerException
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
