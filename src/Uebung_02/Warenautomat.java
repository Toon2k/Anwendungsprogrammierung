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
    public static final int ANZAHL_EDAMERBROETCHEN_DEFAULT = 50;
    public static final int ANZAHL_SALAMIBROETCHEN_DEFAULT = 10;

    private int anzahlEdamerbroetchen;
    private int anzahlSalamibroetchen;


    public Warenautomat(int anzahlE, int anzahlS) {
        this.anzahlEdamerbroetchen = anzahlE;
        this.anzahlSalamibroetchen = anzahlS;
    }

    public Warenautomat() {
        this.anzahlEdamerbroetchen = ANZAHL_EDAMERBROETCHEN_DEFAULT;
        this.anzahlSalamibroetchen = ANZAHL_SALAMIBROETCHEN_DEFAULT;
    }

    public void zeigeAnzahl() {
        System.out.format("%d Edamerbroetchen vorhanden %n", anzahlEdamerbroetchen);
        System.out.format("%d Salamaibroetchen vorhanden %n", anzahlSalamibroetchen);
    }
}
