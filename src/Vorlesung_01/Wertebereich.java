/*  
  Dateiname     : Wertebereich.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Unterschiedliche Wertebereiche bei ganzzahligen Datentypen.
  	          Zahlenkreis. 
  	          Keine Fehlermeldung bei "Verlassen" des Wertebereichs.
  Version       : 04.10.2020
*/

package Vorlesung_01;

public class Wertebereich {

  public static void main(String [] arg)
  {
  long zahl = 15;
  //int wert = zahl; // Compiler-Meldung: error: possible loss of precision
  int wert = (int)zahl; //Umwandlung in Integer
  
    zahl = Long.MAX_VALUE;
    System.out.format("zahl = %d%n", zahl);
    System.out.format("(int)zahl = %d%n", (int)zahl); //wird von Integer nicht abgedeckt
   
    zahl = Integer.MAX_VALUE;
    System.out.format("zahl = %d%n", zahl);
    System.out.format("(int)(zahl+1) = %d%n", (int)(zahl+1));
      
    //float zahl2 = 2.0;
    float zahl2 = Float.MAX_VALUE;   
    System.out.format("zahl2 = %f%n", zahl2);
    zahl2 = 1.75f; //f markiert hier den Float Datentyp, nicht Double
    System.out.format("zahl2 = %d%n", (int)zahl2);
    
    float ergebnis1 = 1.0f/3.0f;
    System.out.format("Ergebnis1 = %f%n", ergebnis1);
    int wert1 = 1;
    int wert2 = 3;     
    double ergebnis2 = wert1/wert2; //Werte müssen zuerst gecastet werden
    System.out.format("Ergebnis2 = %f%n", ergebnis2);
    
    long zahlL = Long.MAX_VALUE;
    System.out.format("zahlL = %d%n", zahlL);
    System.out.format("zahlL+1 = %d%n", zahlL+1);
   /* */
/*
    //Weniger relevant
    System.out.format("Byte.MAX_VALUE = %d%n", Byte.MAX_VALUE);
    System.out.format("(byte)(Byte.MAX_VALUE+1) = %d%n", (byte)(Byte.MAX_VALUE+1));
    System.out.format("Byte.MAX_VALUE+1 = %d%n", Byte.MAX_VALUE+1); // In int-Bereich ermittelt
*/
  }

}

/*
Ausgabe:
--------

zahl = 9223372036854775807
(int)zahl = -1
zahl = 2147483647
(int)(zahl+1) = -2147483648
zahl2 = 340282346638528860000000000000000000000,000000
zahl2 = 1
Ergebnis1 = 0,333333
Ergebnis2 = 0,000000
zahlL = 9223372036854775807
zahlL+1 = -9223372036854775808
*/
