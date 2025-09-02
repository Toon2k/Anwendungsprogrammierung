package Uebung_04;

import Uebung_04.WarenautomatUe04.WarenautomatUe04;

public class AnwendungUe04 {

    public static void main(String [] args)
    {
        WarenautomatUe04 warenautomat1 = new WarenautomatUe04(5, 8);
        WarenautomatUe04 warenautomat2 = new WarenautomatUe04();

        warenautomat1.zeigeInfo();
        warenautomat2.zeigeInfo();
    }
}