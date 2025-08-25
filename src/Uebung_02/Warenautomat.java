/*  
  Dateiname     : Warenautomat.java.
  Veranstaltung : Anwendungsprogrammierung (BIS-201).
  Fragestellung : Rahmen Warenautomat.
  Version       : 09.10.2020
*/
//Bitte entsprechend anpassen:
package Uebung_02;

public class Warenautomat
{
    private int anzahlEdamerbroetchen;
    private int anzahlSalamibroetchen;
    public static final int anzahlEdamerbroetchenDefault = 50;
    public static final int getAnzahlSalamibroetchenDefault = 10;

    public Warenautomat(int anzahlE, int anzahlS) {
        anzahlEdamerbroetchen = anzahlE;
        anzahlSalamibroetchen = anzahlS;
    }

    public Warenautomat() {
        anzahlEdamerbroetchen = anzahlEdamerbroetchenDefault;
        anzahlSalamibroetchen = getAnzahlSalamibroetchenDefault;
    }

    public void zeigeAnzahl() {
        System.out.format("%d Edamerbroetchen vorhanden %n", anzahlEdamerbroetchen);
        System.out.format("%d Salamaibroetchen vorhanden %n", anzahlSalamibroetchen);
    }
}

