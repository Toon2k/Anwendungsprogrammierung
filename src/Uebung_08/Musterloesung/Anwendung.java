/*  
  Dateiname     : Anwendung.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Zu Methoden mit final. Hier kein Unterschied!
                  Nur die Ausgabe von toString jetzt neu.
  Version       : 19.11.2023
*/
package Uebung_08.Musterloesung;

public class Anwendung {

  public static void main(String [] argumente)
  {
  Buch marquez = new Buch("100 Jahre Einsamkeit");       
  Buch lumet = new Buch("Filme machen", 1924);           
  Kugelschreiber bigblue = 
    new Kugelschreiber("Blau", 2020);                   

    marquez.setArtikelnummer(2345);
    marquez.zeigeInfoAn();                               
    lumet.zeigeInfoAn();                                 
    bigblue.zeigeInfoAn();                 

// Jedes Arrayelement ist eine Referenz vom Typ Artikel.                  
  Artikel [] vieleArtikel = new Artikel[3];
  
// Eine Referenz vom Typ Artikel kann auf
// Artikel-, Buch- und Kugelschreiberobjekte zeigen.  
  Artikel einArtikel = new Artikel();
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
    
    gebeAus(new Artikel());
    gebeAus(marquez);
    gebeAus(bigblue); 
    zeigeListeAn(vieleArtikel);
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