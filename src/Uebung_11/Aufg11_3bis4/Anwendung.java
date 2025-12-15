/*  
  Dateiname     : Anwendung.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Übung 10
                  Anpassungen an abstrakter Klasse Artikel.
                  Überprüfung der Artikelnummer wird hier
                  noch nicht berücksichtigt, evtl. eben Wert 0.
                  Mit neuer Zuweisung an einArtikel.
  Version       : 12.05.2023
*/
package Uebung_11.Aufg11_3bis4;

// import von ArrayList notwendig
import java.util.ArrayList;

public class Anwendung {

  public static void main(String [] argumente) {
    try {
      Buch marquez;
      Buch lumet;
      Kugelschreiber bigblue;

      marquez = new Buch("100 Jahre Einsamkeit");
      lumet = new Buch("Filme machen", 1924);
      bigblue = new Kugelschreiber("Blau", 2020);
      marquez.setArtikelnummer(2345);
      marquez.zeigeInfoAn();
      lumet.zeigeInfoAn();
      bigblue.zeigeInfoAn();


// Jedes Arrayelement ist eine Referenz vom Typ Artikel.
      Artikel[] vieleArtikel = new Artikel[3];

// Eine Referenz vom Typ Artikel kann auf
// Artikel-, Buch- und Kugelschreiberobjekte zeigen.
// Übung 10. Kein Objekt von Artikel mehr möglich!
//  Artikel einArtikel = new Artikel();
      Artikel einArtikel = new Kugelschreiber("Mix");
      einArtikel.zeigeInfoAn();
      vieleArtikel[0] = einArtikel;
      System.out.format("%s%n", einArtikel);

      einArtikel = new Buch("Veronica Teucrium", 2018);
      einArtikel.zeigeInfoAn();
      System.out.format("%s%n", einArtikel.toString());
      vieleArtikel[1] = einArtikel;
      System.out.format("%s%n", einArtikel);

      einArtikel = new Kugelschreiber("Pink", 241128);
      einArtikel.zeigeInfoAn();
      vieleArtikel[2] = einArtikel;
      System.out.format("%s%n", einArtikel);

//    einArtikel.getTitel(); // Nur Bestandteile von
//    einArtikel.getFarbe(); // Artikel sind möglich
      System.out.format("Artikelnummer = %d%n",
              einArtikel.getArtikelnummer());
      System.out.format("Farbe = %s%n",
              bigblue.getFarbe());

// Übung 10. Kein Objekt von Artikel mehr möglich!
//    gebeAus(new Artikel());
      gebeAus(marquez);
      gebeAus(bigblue);
      zeigeListeAn(vieleArtikel);

      ArrayList<Artikel> arlart = new ArrayList<>();

      arlart.add(marquez);
      arlart.add(lumet);
      arlart.add(bigblue);
      arlart.add(vieleArtikel[0]);
      arlart.add(vieleArtikel[1]);
      arlart.add(vieleArtikel[2]);
      arlart.add(1, new Kugelschreiber("Gelb"));
      Artikel del = arlart.remove(5); // Zählweise ab 0!
      System.out.format("Gelöschter Artikel = %2d%n",
              del.getArtikelnummer());
      System.out.format("Anzahl = %2d%n", arlart.size());

      for (Artikel ea : arlart) {
        ea.zeigeInfoAn();
      }

      System.out.format("%nAufruf der Methode%n");
      zeigeAlleArtikelAn(arlart);


    }
    catch(FalscheArtikelnummerException fae){
      fae.behandle();
    }
  }


  public static void zeigeAlleArtikelAn(ArrayList<Artikel> mehrereArtikel)
  {
    for (Artikel einArtikel: mehrereArtikel) {
      System.out.format("Artikelnummer: %d%n", 
                        einArtikel.getArtikelnummer());
      System.out.format("%s%n", einArtikel.toString()); 
    }
  }

// Auch hier ist wieder jedes Arrayelement eine Referenz
// auf einen Artikel. Daher sind nur die Elemente möglich,
// ansprechbar, die schon bei Artikel vorhanden sind. Bei
// überschriebenen Methoden wird aber jeweils die Methode
// aufgerufen, die zum aktuellen Objekt gehört.
  public static void zeigeListeAn(Artikel [] mehrereArtikel)
  {
    for (int i = 0; i < mehrereArtikel.length; i++) {
      mehrereArtikel[i].zeigeInfoAn();	
      System.out.format("Artikelnummer: %d%n", 
                        mehrereArtikel[i].getArtikelnummer());
      System.out.format("%s%n", mehrereArtikel[i].toString()); 
    }
  }

// Anmerkung zum Aufruf wie oben bei zeigeListeAn  
  public static void gebeAus(Artikel einzelnerArtikel)
  {
  	einzelnerArtikel.zeigeInfoAn();
  }

}                                         
