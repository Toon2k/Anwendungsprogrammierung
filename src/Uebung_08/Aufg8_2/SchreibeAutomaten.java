package Uebung_08.Aufg8_2;

import Uebung_07.Automat;
import Uebung_07.Geldautomat;
import Uebung_07.Warenautomat;

import java.io.IOException;
import java.io.RandomAccessFile;


public class SchreibeAutomaten {

    public static final String DATEI = "D:\\Verwaltungsinformatik\\Anwendungsprogrammierung\\Code\\" +
            "Anwendungsprogrammierung\\src\\Uebung_08\\Aufg8_2\\list.txt";

    public static void main (String[] args) {
        Automat automat = new Automat();
        Geldautomat geldautomat = new Geldautomat();
        Warenautomat warenautomat = new Warenautomat();

        Automat[] aList = new Automat[3];

        aList[0] = automat;
        aList[1] = geldautomat;
        aList[2] = warenautomat;

        try(RandomAccessFile list = new RandomAccessFile(DATEI, "rw")) {
            for (Automat element : aList) {
                list.writeBytes(element.toString() + "\n\n");
            }
        }
        catch (IOException ioe) {
            System.out.format("io Fehler: %s", ioe.getMessage());
        }

    }

}
