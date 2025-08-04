/*  
  Dateiname     : ForeachDemo.java
  Veranstaltung : Anwendungsprogrammierung (BIS-201)
  Fragestellung : Beispiele für foreach, inklusive nicht möglicher Varianten.
                  Hier bei der Arbeit mit Array.
                  In der Schleife kann somit ein komplettes Array vereinfacht
                  behandelt werden, allerdings nur dann, wenn die Elemente
                  nicht verändert werden sollen.
  Version       : 26.09.2024
*/
//package bis201.beispieleausvorlesung.kapitel01.allgemeineaspekte;
package Vorlesung_01;

public class ForeachDemo {


  public static void main(String [] arg)
  {
  int [] feld = {1, 3, 4, 5, 8, 9, 7, 6};
  
  
// Bisherige for-Schleife zur Ausgabe der Array-Elemente  
    for (int i = 0; i < feld.length; i++){
      System.out.format(" %d", feld[i]);
      System.out.format("%n");}
      
   
// While Schleife zur Ausgabe der Array-Elemente  
int o = 0;
    while (o < feld.length){
        System.out.format(" %d", feld[o]);
        o = o + 1;  }
    System.out.format("%n");

// While do Schleife zur Ausgabe der Array-Elemente  
int p = 0;
do {
    System.out.format(" %d", feld[p]);
    p++; 
    } while (p < feld.length);
System.out.format("%n");      

// Pruefung, ob Wert zu klein
int schwellenwert = 5; 
int w = 0;
do {
    if(feld[w] < schwellenwert){
        System.out.format(" %d", feld[w]);
    }
    else{
        System.out.format(" %s", "Zu gross!");        
    }
    w++; 
    } while (w < feld.length);
System.out.format("%n");  

 
// Neue Variante "foreach"  
    for (int f : feld)
      System.out.format(" %d", f);
    System.out.format("%n");
  
// Möglich: Berechnungen bei dem über das komplette Array gelaufen wird
  int summe = 0;
    for (int f : feld)
      summe = summe + f;
    System.out.format("%d%n", summe); //43
   
// Nicht möglich: Wertzuweisung an Arrayelement, selbst in einfachster Form.
// Hieran auch Ablauf erkennbar: 
// f wird vor Schleifendurchlauf mit aktuellem Arrayelement belegt
    for (int f : feld) {
      System.out.format(">%d%n", f);
      f = 10;
      System.out.format("<%d%n", f);
    }
    

// Nicht möglich: Behandlung mehrerer Arrays, z.B. Skalarprodukt
// Hier müsste auch noch unterschiedliche Länge von feld und feld1 behandelt werden.
  int [] feld0 = {1, 2, 4, 5, 8, 9, 7, 6};
  int skalarprodukt = 0;

    for (int i = 0; i < feld.length; i++)
      skalarprodukt = skalarprodukt + feld[i] * feld0[i];
    System.out.format("Skalarprodukt %d%n", skalarprodukt);
/*
// Nur als Hinweis. So nicht möglich:
// mehrere Variablen
//    for (int f : feld; int j : feld0) ;
//    for (int f : feld, int j : feld0) ;
//    for (int f : feld, feld0) ;*/
  }

}

/*
Ausgabe:
--------

 1
 3
 4
 5
 8
 9
 7
 6
 1 3 4 5 8 9 7 6
 1 3 4 5 8 9 7 6
 1 3 4 Zu gross! Zu gross! Zu gross! Zu gross! Zu gross!
 1 3 4 5 8 9 7 6
43
>1
<10
>3
<10
>4
<10
>5
<10
>8
<10
>9
<10
>7
<10
>6
<10
Skalarprodukt 278
*/