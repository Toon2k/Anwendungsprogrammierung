package Uebung_08.Aufg8_3;

import java.io.IOException;
import java.io.RandomAccessFile;

public class readtxt {

    public static final String DATEI = "D:\\Verwaltungsinformatik\\Anwendungsprogrammierung\\Code\\" +
            "Anwendungsprogrammierung\\src\\Uebung_08\\Aufg8_2\\list.txt";

    public static void main(String[] args) {

        String zeile;

        try(RandomAccessFile list = new RandomAccessFile(DATEI, "rw")) {
            while( (zeile = list.readLine()) != null)
            System.out.println(zeile);
        }
        catch(IOException ioe) {
            System.out.format("IO-Fehler: %s", ioe.getMessage());
        }

    }
}
