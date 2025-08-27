/*  
  Dateiname     : StringAufgabe.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiel mit String.
  Version       : 04.10.2020
*/
//package bis201.beispieleausvorlesung.kapitel02.abschnitt1.stringbeispiele;
package Vorlesung_02;

public class StringAufgabe {
  
  public static void main(String [] arg)
  {
  String s1 = "Hannover";
  String s2 = new String(s1);
  String s3 = s1;
  
    System.out.format("%s%n", s1);
    System.out.format("%s%n", s2);
    System.out.format("%s%n", s3);
    s1 = "Frankfurt";
    System.out.format("%s%n", s1);
    System.out.format("%s%n", s2);
    System.out.format("%s%n", s3);
    
    
  }
  
}

/*
Ausgabe:
--------
Hannover
Hannover
Hannover
Frankfurt
Hannover
Hannover
*/
