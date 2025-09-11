package Uebung_05;

import Uebung_05.Geldautomat;
import Uebung_05.Warenautomat;

public class Anwendung {

    public static void main(String [] args){
        Geldautomat gAutomat1 = new Geldautomat();
        Geldautomat gAutomat2 = new Geldautomat(529);
        Warenautomat wAutomat1 = new Warenautomat();
        Warenautomat wAutomat2 = new Warenautomat(3, 33);

        gAutomat1.zeigeInfoAn();
        System.out.format("%n");
        gAutomat2.zeigeInfoAn();
        System.out.format("%n");
        wAutomat1.zeigeInfoAn();
        System.out.format("%n");
        wAutomat2.zeigeInfoAn();
    }



}
