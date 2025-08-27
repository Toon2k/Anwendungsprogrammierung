/*  
  Dateiname     : Warenautomat.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Teil 2 - Warenautomat.
  Version       : 17.03.2021
*/
package Uebung_02.Muster;

public class Warenautomat
{
  public static final int DEFAULTANZAHL_EDAMERBRÖTCHEN = 50;
  public static final int DEFAULTANZAHL_SALAMIBRÖTCHEN = 10;

  private int anzahlEdamerbrötchen;
  private int anzahlSalamibrötchen;

  public Warenautomat()
  {
    anzahlEdamerbrötchen = DEFAULTANZAHL_EDAMERBRÖTCHEN;	
    anzahlSalamibrötchen = DEFAULTANZAHL_SALAMIBRÖTCHEN;	
  }
  

  public Warenautomat(int edamerbrötchen,
                      int salamibrötchen)
  {
    anzahlEdamerbrötchen = edamerbrötchen;	
    anzahlSalamibrötchen = salamibrötchen;	
  }
  
  public void zeigeInfoAn()
  {
    System.out.format("Anzahl Edamerbrötchen = %2d%n", 
                      anzahlEdamerbrötchen);
    System.out.format("Anzahl Salamibrötchen = %2d%n", 
                      anzahlSalamibrötchen);
  }
            
}
