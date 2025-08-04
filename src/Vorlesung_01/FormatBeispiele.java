/*  
  Dateiname     : FormatBeispiele.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiele für die formatierte Ausgabe
                  mit der Methode format. Feste Werte nur als Beispiel.
                  Aufruf z.B. mit System.out.format, also
                  einer Klassenmethode des Datentyps PrintStream.
                  Anderer Name ist printf (in Analogie zu C/C++).
                  Die format-Methode von String erzeugt einen
                  entsprechend formatierten String, mit dem dann
                  weiter gearbeitet werden kann.
  Version       : 22.09.2020
*/
//package bis201.beispieleausvorlesung.kapitel01.allgemeineaspekte;
package Vorlesung_01;

public class FormatBeispiele {

  public static void main(String [] arg)
  {
    System.out.format("*%6d*%n", 123);     // ___123
    System.out.format("%06d%n", 123);    // 000123
    System.out.format("*%d*%n", 123);      // 123
    System.out.format("*% d*%n", 123);     // _123
    System.out.format("*%+6d*%n", 123);    // __+123
    System.out.format("*%f*%n", 12.3);     // 12,300000
    System.out.format("*%6f*%n", 12.3);    // 12,300000
    System.out.format("*%10f*%n", 12.3);   // _12,300000
    System.out.format("*%6.3f*%n", 12.3);  // 12,300
    System.out.format("*%-7.3f*%n", 12.3); // 12,300_
    System.out.format("*%e*%n", 12.3);     // 1,230000e+01
    System.out.format("*%9.2e*%n", 12.3);  // _1,23e+01
    System.out.format("*%09.2e*%n", 12.3); // 01,23e+01
    System.out.format("*%9.2e*%n", 0.000003);  // _3,00e-06
    System.out.format("*%09.2e*%n", 0.000003); // 03,00e-06
    
    // Statt %n auch \n
    System.out.format("*%09.2e*\n", 0.000003); // 03,00e-06
    
    // Analog mit printf
    System.out.printf("*%09.2e*\n", 0.000003); // 03,00e-06

    // Ebenso String.format
    String fs = String.format("*%09.2e*%n", 0.000003);
    System.out.println(fs);  // 03,00e-06
  }

}

/*
Ausgabe:
--------

*   123*
*000123*
*123*
* 123*
*  +123*
*12,300000*
*12,300000*
* 12,300000*
*12,300*
*12,300 *
*1,230000e+01*
* 1,23e+01*
*01,23e+01*
* 3,00e-06*
*03,00e-06*
*03,00e-06*
*03,00e-06*
*03,00e-06*

*/
