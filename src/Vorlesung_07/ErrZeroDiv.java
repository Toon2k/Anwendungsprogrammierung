/*  
  Dateiname     : ErrZeroDiv.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Beispiel zu ersten Betrachtungen bei
                  der Ausnahmebehandlung.
  Version       : 09.12.2020
*/
package Vorlesung_07;

public class ErrZeroDiv {

  public static void main(String [] args)
  {
  	m();
  }
  
  public static boolean m()
  {
  int zahl = 0;
  int wert = 2;
// Ausgabe 1 3 4
    try {
      System.out.format("1 ");	
      zahl = 10 / wert;
      System.out.format("2 ");
      return true;
    }
    catch (ArithmeticException ae) {
      System.out.format("3 ");
      System.out.format(ae.toString());
      return false;	
    }
    finally {
      System.out.format(" 4 ");	
    }
    //System.out.format("5 ");	

    //return true;
  }
  
}



