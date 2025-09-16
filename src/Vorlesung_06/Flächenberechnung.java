/*  
  Dateiname     : Flächenberechnung.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Vererbungsgebundener Polymorphismuse, dynamisches Binden.
                  Hier keine Änderung in Klasse Flächenberechnung bei Wechsel
                  zu abstrakter Klasse GeometrischeFigur. Nur neues Package.
  Version       : 25.11.2020.
*/
package Vorlesung_06;

public class Flächenberechnung {
  
  static public void main(String [] arg)
  {
// Lagerflächen bestimmen
  GeometrischeFigur [] mehrereGeometrischeFiguren = 
                    new GeometrischeFigur[6];
  
    mehrereGeometrischeFiguren[0] = new Rechteck(4, 5);
    mehrereGeometrischeFiguren[1] = new Rechteck(2, 10);
    mehrereGeometrischeFiguren[2] = new Rechteck(8, 3);    
 
    mehrereGeometrischeFiguren[3] = new Kreis(3);
    mehrereGeometrischeFiguren[4] = new Kreis(50);
    mehrereGeometrischeFiguren[5] = new Kreis(7); 

// Flächenberechnung durchführen
    System.out.format("Fläche = %6.2f%n", 
      GeoMath.berechneGesamtfläche(mehrereGeometrischeFiguren));
     
  }
  
  
 
}
