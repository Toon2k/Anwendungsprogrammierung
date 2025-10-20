package Uebung_03;

public class Warenautomat
{
    public static final int ANZAHL_EDAMERBROETCHEN_DEFAULT = 50;
    public static final int ANZAHL_SALAMIBROETCHEN_DEFAULT = 10;

    private int anzahlEdamerbroetchen;
    private int anzahlSalamibroetchen;
    private static int maxNummer;
    private int automatennummer;


    public Warenautomat(int anzahlEdamerbroetchen, int anzahlSalamibroetchen) {
        this.anzahlEdamerbroetchen = anzahlEdamerbroetchen;
        this.anzahlSalamibroetchen = anzahlSalamibroetchen;
        this.automatennummer = ++maxNummer;
    }

    public Warenautomat() {
        this(ANZAHL_EDAMERBROETCHEN_DEFAULT, ANZAHL_SALAMIBROETCHEN_DEFAULT);
    }

    public void zeigeInfo() {
        System.out.format("%d Edamerbroetchen vorhanden %n", anzahlEdamerbroetchen);
        System.out.format("%d Salamaibroetchen vorhanden %n", anzahlSalamibroetchen);
        System.out.format("Automatennummer: %d%n", automatennummer);
    }

    public static int getMaxNummer() {
        return maxNummer;
    }

    public int getAutomatennummer() {
        return automatennummer;
    }
}
