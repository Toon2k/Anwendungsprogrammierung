/*  
  Dateiname     : GeoMath.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Vererbungsgebundener Polymorphismuse, dynamisches Binden.
                  Methode berechneGesamtfläche mit Array.
                  Andere mögliche Datentypen (noch) nicht besprochen.
                  Hier keine Änderung in Klasse GeoMath bei Wechsel
                  zu abstrakter Klasse GeometrischeFigur. Nur neues Package.
  Version       : 25.11.2020.
*/
package Vorlesung_06;

public class GeoMath {

  public static double berechneGesamtfläche(
                  GeometrischeFigur [] vieleGeometrischeFiguren)
  {
  double gesamtfläche = 0;
  
    for (GeometrischeFigur eineGeometrischeFigur : 
                           vieleGeometrischeFiguren)
      gesamtfläche += eineGeometrischeFigur.berechneFläche();
   
    return gesamtfläche;
  }

}	