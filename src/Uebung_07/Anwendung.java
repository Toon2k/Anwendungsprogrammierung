package Uebung_07;

import java.util.ArrayList;

public class Anwendung {

    public static void main(String [] args){
        Automat gAutomat1 = new Geldautomat();
        Automat gAutomat2 = new Geldautomat(529);
        Automat wAutomat1 = new Warenautomat();
        Automat wAutomat2 = new Warenautomat(3, 33);
        Automat OAutomat = new Automat();

        Automat[] aList = new Automat[5];

        aList[0] = gAutomat1;
        aList[1] = gAutomat2;
        aList[2] = wAutomat1;
        aList[3] = wAutomat2;
        aList[4] = OAutomat;

        druckeliste(aList);

        // mit ArrayList
        // ArrayList<Automat> aList = new ArrayList<>();

        // aList.add(gAutomat1);
        // aList.add(gAutomat2);
        // aList.add(wAutomat1);
        // aList.add(wAutomat2);
        // aList.add(OAutomat);

    }

    public static void druckeliste(Automat[] autoList) {
        for (Automat automat : autoList) {
            System.out.format("%s%n", automat.toString());
            System.out.format("%n");
        }
    }



}
