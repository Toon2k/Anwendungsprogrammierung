/*  
  Dateiname     : Anwendung.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Datentyp Geldautomat.
                  Einstieg.
  Version       : 08.10.2020
*/

//package bis201.beispieleausvorlesung.kapitel02.abschnitt2.automat.einstiegsvariante;
package Vorlesung_02;

public class Anwendung {

  public static void main(String [] args)
  {
  Geldautomat automat = new Geldautomat(29000);

    automat.zeigeInfoAn();
  }
  
}