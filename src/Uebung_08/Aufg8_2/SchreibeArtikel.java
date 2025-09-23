/*  
  Dateiname     : SchreibeAutomaten.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Rahmen für Übung 8, Teil 2, Schreiben in Datei, Artikel.
  Version       : 25.11.2024
*/
package Uebung_08.Aufg8_2;

import Uebung_08.Aufg8_1.Kugelschreiber;
import Uebung_08.Aufg8_1.Buch;
import Uebung_08.Aufg8_1.Artikel;

import java.io.IOException;
import java.io.RandomAccessFile;

public class SchreibeArtikel {

    public static final String DATEI = "D:\\Verwaltungsinformatik\\Anwendungsprogrammierung\\Code\\" +
            "Anwendungsprogrammierung\\src\\Uebung_08\\Aufg8_2\\list.txt";
    public static void main(String [] args)
    throws Exception
    {
        Artikel artikel = new Artikel(1);
        Buch buch = new Buch("dem Hirsch ist ein Geweih gewachsen", 2);
        Kugelschreiber kugelschreiber = new Kugelschreiber("gelb", 3);
        Artikel[] aList = new Artikel[3];


        aList[0] = artikel;
        aList[1] = buch;
        aList[2] = kugelschreiber;

        try (RandomAccessFile list = new RandomAccessFile(DATEI, "rw")) {
            for (Artikel element : aList) {
              list.writeBytes(element.toString() + "\n\n");
            }
            System.out.format("Dateien in list.txt geschrieben");
        }
        catch (IOException ioe) {
            System.out.format("Fehlernachricht: %s", ioe.getMessage());
            }
    }
}
