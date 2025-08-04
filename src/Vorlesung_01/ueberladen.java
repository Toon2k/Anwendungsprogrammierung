/*  
  Dateiname     : ueberladen.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiele zum Verständnis von Ueberladen. 
  	          
  Version       : 25.09.2024
nach Abts 2020, S.55
*/

package Vorlesung_01;

public class ueberladen {

  public static void main(String [] arg)
  {
     ueberladen ub = new ueberladen(); 
      int result1 =  ub.max(2,3);
        System.out.format("Ergebnis 1 = %d%n", result1);
      double result2 =  ub.max(2.0,3.0);
      System.out.format("Ergebnis 2 = %f%n", result2);
      int result3 =  ub.max(2, 5, 3);
      System.out.format("Ergebnis 2 = %d%n", result3);
  }
  public int max(int a, int b) {
    System.out.format("Funktion mit Int und 2 Werten \n");
      return a < b ? b : a;
    /*
    Schreibweise auch
    if (a < b) {
     return b;
    } else {
        return a;
    }
    */
}
  //Funktion mit gleichem Namen:
  public double max(double a, double b) {
    return a < b ? b : a;
}
  public int max(int a, int b, int c) {
      System.out.format("Funktion mit Int und 3 Werten \n");
    return max(max(a, b), c);
  }
}

/*
Ausgabe:
--------

Funktion mit Int und 2 Werten 
Ergebnis 1 = 3
Ergebnis 2 = 3,000000
Funktion mit Int und 3 Werten 
Funktion mit Int und 2 Werten 
Funktion mit Int und 2 Werten 
Ergebnis 2 = 5
*/