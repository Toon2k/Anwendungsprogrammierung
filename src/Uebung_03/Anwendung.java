package Uebung_03;

public class Anwendung {

    public static void main(String [] args)
    {
        Warenautomat warenautomat1 = new Warenautomat(5, 8);
        Warenautomat warenautomat2 = new Warenautomat();

        warenautomat1.zeigeInfo();
        warenautomat2.zeigeInfo();


    }

}