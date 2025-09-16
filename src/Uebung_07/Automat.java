/*  
  Dateiname     : Geldautomat.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Ausgangspunkt für den Aufbau von Automat.
                  Dies ist noch die komplette Version des Datentyps
                  Geldautomat aus dem Abschnitt 01 im Kapitel 04.
                  Im ersten Teil der Übung 5 sollen jetzt nur noch die allgemeinen
                  Aspekte eines Automaten, also die zur Automatennummer
                  gehörenden Aspekte (Attribute maxNummer, automatennummer
                  und die dazu gehörenden Bestandteile in der Klasse) genutzt
                  werden, um den allgemeinen Datentyp Automat zu erstellen.
                  Die speziellen Aspekte eines Geldautomaten (Konstante DEFAULTBETRAG,
                  das Attribut bestand und die dazu gehörenden Bestandteile in der
                  Klasse) sollen gelöscht werden.
                  Mit einer package-Anweisung.
  Version       : 04.11.2024
*/
//bitte anpassen:
package Uebung_07;

public class Automat {

  private static int maxNummer = 0; // 0 auch automatisch zugewiesen
  private int automatennummer;

  
  {
    automatennummer = ++maxNummer; // Hochzählen der Nummer (vor Zuweisung)  	
  }

  public static int getMaxNummer()
  {
    return maxNummer;
  }

  public int getAutomatennummer()
  {
    return automatennummer;
  }

  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", automatennummer);
  }

  public String toString() {
    return String.format("Automat mit der Automatennummer %d", this.getAutomatennummer());

    // alternativ
    //String ausgabe = String.format("Automat mit der Automatennummer %d", this.getAutomatennummer());
    //return ausgabe;
  }
}
