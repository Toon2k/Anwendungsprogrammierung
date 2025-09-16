/*  
  Dateiname     : Kreis.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Vererbungsgebundener Polymorphismuse, dynamisches Binden.
                  Datentyp Kreis jetzt von GeometrischeFigur abgeleitet.
                  Hier keine Änderung in Klasse Kreis bei Wechsel
                  zu abstrakter Klasse GeometrischeFigur. Nur neues Package.
  Version       : 25.11.2020.
*/
package Vorlesung_06;

import static java.lang.Math.*;

public class Kreis
extends GeometrischeFigur {

  private final double radius;
  
  public Kreis(double r)
  {
    radius = r;
  }
  
  @Override
  public double berechneFläche()
  {
    return PI * radius * radius;
  }

}