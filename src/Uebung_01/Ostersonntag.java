/*  
  Dateiname     : Ostersonntag.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Rahmen zum Aufbau einer Methode ermittleOstersonntag 
                  zur Bestimmung des Ostersonntags nach Gauß.
                  Beschreibung (nach Gauß) in Ostersonntag.pdf
  Version       : 05.10.2024
*/ 
// Bitte hier Ihr Projekt einfuegen:
package Uebung_01;

public class Ostersonntag
{
  public static void main(String [] args)
  {
    for (int i = 2020; i < 2200; i++) {
      ermittleOstersonntag(i);
    }
  }

// Diese Methode mit Berechnung von Ostersonntag
// (tag und monat) aus jahr füllen.
  public static void ermittleOstersonntag(int jahr)
  {
  int tag = 0, monat = 0;
  
  // Hier die Beschreibung von Gauß (den Algorithmus) in
  // Java-Anweisungen übertragen.
  
      System.out.format("Ostersonntag im Jahr %4d am %02d.%02d%n", 
                         jahr, tag, monat);
  }

}

