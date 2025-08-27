/*  
  Dateiname     : StringBufferAufgabe.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiel mit veränderbarem StringBuffer.
  Version       : 09.10.2024
*/
//package bis201.beispieleausvorlesung.kapitel02.abschnitt1.stringbeispiele;
package Vorlesung_02;

public class StringBufferAufgabe {
  
  public static void main(String [] arg)
  {
  String s1 = "Hannover";
  
  StringBuffer sb1 = new StringBuffer("Hannover");
  StringBuffer sb2 = new StringBuffer(s1);
  StringBuffer sb3 = sb1;
  
    System.out.format("%s%n", sb1);
    System.out.format("%s%n", sb2);
    System.out.format("%s%n", sb3);
    
    sb1.replace(0, sb1.length(), "Frankfurt");
    
    System.out.format("%s%n", sb1);
    System.out.format("%s%n", sb2);
    System.out.format("%s%n", sb3);
    
    //---- Beispiel Unterschied StringBuilder vs. Datentyp String
    StringBuilder sb = new StringBuilder("Hallo");
    //String sb = "Hallo"; //<-- So funktioniert das nicht!
    sb.append(" Welt!");
    System.out.println(sb.toString()); // Ausgabe: "Hallo Welt!"
    //System.out.println(sb);
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
Frankfurt
Hallo Welt!
*/
