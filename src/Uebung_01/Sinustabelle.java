/*  
  Dateiname     : Sinustabelle.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : "Rahmen" zur Aufgabe Sinus-Tabelle.
  Version       : 23.02.2020
*/
package Uebung_01;

public class  Sinustabelle {

  public static void main(String [] args)
  {
      double[] xWerte = new double[40];
      int i = 0;
      double x = 0;
      double[] sinWerte = new double[40];

      // For Schleife 1-40 * pi/20 in array1 füllen
      for (i = 0; i <= xWerte.length-1; i++) {
          x += Math.PI/20;
          xWerte[i] = x;
      }

      // For Schleife 1-40 sin(array1(i)) in array2 füllen
      for (i = 0; i<= xWerte.length-1; i++) {
          sinWerte[i] = Math.sin(xWerte[i]);
      }

      System.out.println("--------------------");
      System.out.println("|   x    | sin(x) |");
      System.out.println("--------------------");
      for (i=0; i< xWerte.length; i++) {
          if (sinWerte[i] < 0) {
              System.out.printf("| %.4f | %.4f |%n", xWerte[i], sinWerte[i]);
              System.out.println("--------------------");
          }
          else {
              System.out.printf("| %.4f | %.4f  |%n", xWerte[i], sinWerte[i]);
              System.out.println("--------------------");
          }
      }

  }

}
