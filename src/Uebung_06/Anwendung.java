package Uebung_06;

import Uebung_06.Automat;
import Uebung_06.Geldautomat;
import Uebung_06.Warenautomat;

public class Anwendung {

    public static void main(String [] args){
        Automat gAutomat1 = new Geldautomat();
        Automat gAutomat2 = new Geldautomat(529);
        Automat wAutomat1 = new Warenautomat();
        Automat wAutomat2 = new Warenautomat(3, 33);
        Automat OAutomat = new Automat();

        gAutomat1.zeigeInfoAn();
        System.out.format("%n");
        gAutomat2.zeigeInfoAn();
        System.out.format("%n");
        wAutomat1.zeigeInfoAn();
        System.out.format("%n");
        wAutomat2.zeigeInfoAn();
        System.out.format("%n");
        OAutomat.zeigeInfoAn();
    }



}
