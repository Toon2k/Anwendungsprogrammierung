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

  public static void ermittleOstersonntag(int jahr)
  {
  int tag = 0, monat = 0;
  int rest19 = jahr % 19;
  int rest4 = jahr % 4;
  int rest7 = jahr % 7;
  int pruefziffer, a6, a7, a8, a9;

  if (jahr >= 1900 && jahr <= 2099) {
    pruefziffer = 5;
  } else {
    pruefziffer = 6;
  }

  a6 = (19 * rest19 + 24) % 30;
  a7 = (2 * rest4 + 4 * rest7 + 6 * a6 + pruefziffer) % 7;
  a8 = 22 + a6 + a7;
  a9 = a6 + a7 -9;

  if (a8 >= 1 && a8 <= 31) {
    tag = a8;
    monat = 3;
  } else if (a9 == 26) {
      tag = 19;
      monat = 4;
  } else if (a9 == 25 && a6 == 28 && rest19 > 10) {
      tag = 18;
      monat = 4;
  } else {
      tag = a9;
      monat = 4;
  }

      System.out.format("Ostersonntag im Jahr %4d am %02d.%02d%n", 
                         jahr, tag, monat);
  }

}

