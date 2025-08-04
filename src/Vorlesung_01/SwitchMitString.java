/*  
  Dateiname     : SwitchMitString.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Einfaches Beispiel für die Verwendung 
                  von Strings in switch-Anweisungen.
  Version       : 26.09.2024
*/
//package bis201.beispieleausvorlesung.kapitel01.allgemeineaspekte;
package Vorlesung_01;

public class SwitchMitString {

  public static void main(String [] arg)
  {
  String name = "VIS-201";
  //Prüfung welcher Name eingeben wurde
    switch (name) {
      case "BIS-201":
        System.out.format("%s - Anwendungsprogrammierung.%n", name);
        break;
      case "BIS-204-02":
        System.out.format("%s - Webbasierte Informationssysteme.%n", name);
        break;
      case "BIS-222":
        System.out.format("%s - IT-Systeme der Produktion und Logistik.%n", name);
        break;
      default:
        System.out.format("Unbekanntes Kürzel - %s%n", name);
        break;
    }
    
    // Prüfung auf Studiengang
    switch(name.substring(0, 3)) {
        case "BIS":
            System.out.format("%s%n", "Wirtschaftsinformatik");
            break;
        case "VIS":
            System.out.format("%s%n", "Verwaltungsinformatik");
            break;
        default:
            System.out.format("%s%n", "Studium unbekannt");
            break;
    }   
  }

}

/*
Ausgabe:
--------
Unbekanntes K�rzel - VIS-201
Verwaltungsinformatik
*/
