package Uebung_09.Aufg9_1bis3;

import java.util.ArrayList;
import Uebung_08.Aufg8_1.*;


public class Anwendung {
    public static void main (String [] args) {
        ArrayList<Artikel> artikelListe = new ArrayList<>();
        Artikel artikel = new Artikel();
        Buch buch = new Buch("Die Schildkröte kauft einen gelben Panzer", 1);
        Kugelschreiber kugelschreiber = new Kugelschreiber("gelb", 2);

        artikelListe.add(artikel);
        artikelListe.add(buch);
        artikelListe.add(kugelschreiber);

        artikelListe.remove(1);

        System.out.println(artikelListe.size());

        //for(Artikel a : artikelListe) {
        //    a.zeigeInfoAn();
        //}

        zeigeAlleArtikelAn(artikelListe);
    }

    public static void zeigeAlleArtikelAn(ArrayList<Artikel> aListe) {
        for(Artikel artikel : aListe) {
            System.out.println(artikel.toString());
            System.out.println(artikel.getArtikelnummer());
        }
    }

}
