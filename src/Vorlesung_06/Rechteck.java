/*  
  Dateiname     : Rechteck.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Vererbungsgebundener Polymorphismuse, dynamisches Binden.
                  Datentyp Rechteck jetzt von GeometrischeFigur abgeleitet.
                  Hier keine Änderung in Klasse Rechteck bei Wechsel
                  zu abstrakter Klasse GeometrischeFigur. Nur neues Package.
  Version       : 25.11.2020.
*/
package Vorlesung_06;

public class Rechteck
extends GeometrischeFigur {

  private final double seiteA;
  private final double seiteB;
  
  public Rechteck(double a, double b)
  {
    seiteA = a;
    seiteB = b;
  }
  
  @Override
  public double berechneFläche()
  {
    return seiteA * seiteB;
  }

}