/*  
  Dateiname     : Automat.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Aus Geldautomat ausgelagerte Basisklasse.
  Version       : 18.11.2020
*/

package Uebung_10.Teil_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public abstract class Automat {

  private static int maxNummer;
  private int automatennummer;
  public static final String DATEIPFAD = "datei.txt";
  
  {
    automatennummer = ++maxNummer; // Hochzählen der Nummer (vor Zuweisung)  	
  }
  
  public static int getMaxNummer()
  {
    return maxNummer;
  }

  public int getAutomatennummer()
  {
    return automatennummer;
  }

  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", automatennummer);
  }

  public static void speichereAutomatennummer(int nummer) {
    try (RandomAccessFile liste = new RandomAccessFile(DATEIPFAD, "rw")) {
      liste.writeInt(nummer);
    }
    catch (FileNotFoundException fnfe) {
      System.out.format("Fehlermeldung fnfe: %s%n", fnfe.getMessage());
    }
    catch (IOException ioe) {
      System.out.format("Fehlermeldung ioe: %s%n", ioe.getMessage());
    }
  }

  public static void speichereAutomatennummer() {
    speichereAutomatennummer(maxNummer);
  }



}
