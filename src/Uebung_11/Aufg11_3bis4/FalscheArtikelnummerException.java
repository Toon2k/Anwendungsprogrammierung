package Uebung_11.Aufg11_3bis4;

public class FalscheArtikelnummerException extends Exception{

    private int artikelnummer;
    private int minArtikelnummer;
    private int maxArtikelnummer;

    public FalscheArtikelnummerException(int a, int b, int c){
        this.artikelnummer = a;
        this.minArtikelnummer = b;
        this.maxArtikelnummer = c;
    }

    public void behandle() {
        System.out.format("Die Artikelnummer %d ist keine zulässige Artikelnummer. Die Artikelnummer muss im" +
                " Intervall [%d, %d] liegen", this.artikelnummer, this.minArtikelnummer, this.maxArtikelnummer);
    }
}
