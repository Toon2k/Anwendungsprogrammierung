/*  
  Dateiname     : Anwendung.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Artikel - Buch - Kugelschreiber
                  Übung 9, Teil 2 und Teil 3. Mit ArrayList.
  Version       : 23.11.2023
*/
package Uebung_10.Teil_1;

// Übung 9, import von ArrayList notwendig
import Uebung_10.Teil_1.Kugelschreiber;
import Uebung_10.Teil_1.Buch;
import Uebung_10.Teil_1.Artikel;
import java.util.ArrayList;

public class Anwendung {

  public static void main(String [] argumente)
  {
  Buch marquez = new Buch("100 Jahre Einsamkeit");       
  Buch lumet = new Buch("Filme machen", 1924);           
  Kugelschreiber bigblue = new Kugelschreiber("Blau", 2020);                   

    marquez.setArtikelnummer(2345);
    marquez.zeigeInfoAn();                               
    lumet.zeigeInfoAn();                                 
    bigblue.zeigeInfoAn();                 

// Jedes Arrayelement ist eine Referenz vom Typ Artikel.                  
  Artikel [] vieleArtikel = new Artikel[3];
  
// Eine Referenz vom Typ Artikel kann auf
// Artikel-, Buch- und Kugelschreiberobjekte zeigen.  
  Artikel einArtikel = new Kugelschreiber("Blau", 15);
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

    gebeAus(marquez);
    gebeAus(bigblue); 
    zeigeListeAn(vieleArtikel);

// Übung 9, Teil 2, a bis d
    System.out.format("%nÜbung 9:%n");
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
    
// Übung 9, Teil 2, e, foreach - ArrayList
//  for (einArtikel : arlart) geht nicht: bad initializer for for-loop
//  Bei "foreach" muss Datentyp angegeben werden!
    for (Artikel ea : arlart) {
      ea.zeigeInfoAn();     
    }

// Übung 9, Teil 3, Aufruf
    System.out.format("%nÜbung 9: Aufruf der Methode%n");
    zeigeAlleArtikelAn(arlart);
  }                                             

// Übung 9, Teil 3, Vereinbarung
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
