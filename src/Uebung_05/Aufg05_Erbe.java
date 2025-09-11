package Uebung_05;

public class Aufg05_Erbe extends Aufg05_Basis{

    public Aufg05_Erbe (int zahl) {
        int lokal = zahl;
    }

    public Aufg05_Erbe (int zahl, int param) {
        super(zahl, param);
        int lokal = zahl + param;
    }
}
