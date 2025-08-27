/*  
  Dateiname     : EinstiegMitString.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Einstieg in Objektorientierung mit String.
  Version       : 06.09.2020
*/

//package bis201.beispieleausvorlesung.kapitel02.abschnitt1.stringbeispiele;
package Vorlesung_02;

public class EinstiegMitString {
  
  public static void main(String [] arg)
  {
  String name = "BIS-201";
  
   System.out.format("%s%n", name.substring(4));
    System.out.format("%s%n", name.substring(2,5));
   /*System.out.format("%s%n", name.substring(4));
    System.out.format("%s%n", name.substring(2,5));
    System.out.format("%s%n", name.substring(0));
    System.out.format("%s%n", name.substring(7));
    System.out.format("%d%n", name.length());*/

  String anfang = "Anfang";
  String ende = "Ende";
  
    System.out.format("main - anfang: %s%n", anfang);      
    System.out.format("main - ende: %s%n", ende); 
 
    beispiel1(anfang, ende);     
    System.out.format("main - anfang: %s%n", anfang);      
    System.out.format("main - ende: %s%n", ende); 
    
    beispiel2(anfang, ende);     
    System.out.format("main - anfang: %s%n", anfang);      
    System.out.format("main - ende: %s%n", ende); 
  }
  
  public static void beispiel1(String eins, String zwei)
  {
    System.out.format("beispiel1 - eins: %s%n", eins);      
    System.out.format("beispiel1 - zwei: %s%n", zwei); 
  	eins = "Ende";
  	zwei = "Anfang";
    System.out.format("beispiel1 - eins: %s%n", eins);      
    System.out.format("beispiel1 - zwei: %s%n", zwei);   	
  }
  
  public static void beispiel2(String eins, String zwei)
  {
    System.out.format("beispiel2 - eins: %s%n", eins);      
    System.out.format("beispiel2 - zwei: %s%n", zwei); 
  	String tmp = eins;
  	eins = zwei;
  	zwei = tmp;
    System.out.format("beispiel2 - eins: %s%n", eins);      
    System.out.format("beispiel2 - zwei: %s%n", zwei);   	
//    System.out.format("%s%n", tmp);      
  }

}

/*
Ausgabe:
--------
201
S-2
BIS-201

7
main - anfang: Anfang
main - ende: Ende
beispiel1 - eins: Anfang
beispiel1 - zwei: Ende
beispiel1 - eins: Ende
beispiel1 - zwei: Anfang
main - anfang: Anfang
main - ende: Ende
beispiel2 - eins: Anfang
beispiel2 - zwei: Ende
beispiel2 - eins: Ende
beispiel2 - zwei: Anfang
main - anfang: Anfang
main - ende: Ende
*/
