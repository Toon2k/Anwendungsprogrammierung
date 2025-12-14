/*  
  Dateiname     : Automat.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201, VIF-201)
  Fragestellung : Automat.
                  Übung 11.
                  Demo Speicherung der Automatennummer mit Ausnahmebehandlung.
                  Methode, Rethrowing, Überladen, Kommentare.
  Version       : 12.05.2023
*/
package Uebung_11.Aufg11_1bis2;

import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

abstract public class Automat {

// Name der Datei mit der Automatennummer    
  private static final String AUTOMATENNUMMER_DATEI = "D:\\Verwaltungsinformatik\\Anwendungsprogrammierung\\Code\\" +
                "Anwendungsprogrammierung\\src\\Uebung_11\\Aufg11_1bis2\\list.txt";
  
  private static int maxNummer;
  private int automatennummer;

  static{
    try (RandomAccessFile automatennummerdatei = new RandomAccessFile(AUTOMATENNUMMER_DATEI, "r")) {
      System.out.println("gelesene Automatennummer:" + automatennummerdatei.readLine());
    }
    catch (FileNotFoundException fnfe) {
      System.out.format("fnfe-Fehlermeldung %s%n", fnfe.getMessage());
      maxNummer = 200;
    }
    catch (IOException ioe) {
      System.out.format("ioe-Fehlermeldung %s%n", ioe.getMessage());
      maxNummer = 200;
    }
  }

  {
    automatennummer = ++maxNummer; // Hochzählen der Nummer (vor Zuweisung)  	
  }
  
  public static final int getMaxNummer()
  {
    return maxNummer;
  }
  
// Klassenmethode zur Speicherung einer Automatennummer  
// Wenn keine Unterscheidung zwischen FileNotFoundException
// und IOException nötig, dann auch nur ein catch-Block für
// IOException und throws-Klausel nur mit IOException.
  public static final void speichereAutomatennummer(int nummer)
// Für Rethrowing jetzt nötig          
  throws FileNotFoundException, IOException
  {
 
    try ( RandomAccessFile automatennummerDatei =
         new RandomAccessFile(AUTOMATENNUMMER_DATEI, "rw") ) {
        //new RandomAccessFile("DATEI2/automat.nummer", "rw") ) {
      automatennummerDatei.setLength(0);
      automatennummerDatei.writeInt(nummer);
    }
    catch (FileNotFoundException fnfe) {    
// Evtl. Protokollierung in eine Log-Datei.    	        
      System.out.format("speichereAutomatennummer = %s%n", 
                        fnfe);  
// Rethrowing      
      throw fnfe;                        
    }
    catch (IOException ioe) {   	
// Evtl. Protokollierung in eine Log-Datei.    	        
      System.out.format("speichereAutomatennummer = %s (%d)%n", 
                        ioe, nummer);    	
// Rethrowing      
      throw ioe;                        
    }
   
  } 

// Klassenmethode zur Speicherung der maxNummer    
  public static final void speichereAutomatennummer()
  throws FileNotFoundException, IOException
  {
    speichereAutomatennummer(maxNummer);
  }

  public final int getAutomatennummer()
  {
    return automatennummer;
  }

  public void zeigeInfoAn()
  {
    System.out.format("Automatennummer = %d%n", automatennummer);
  }

  @Override
  public String toString()
  {
    return "Automat mit der Automatennummer " + automatennummer;
  }

}
