package Uebung_04;

public class Aufg4 {

    {
        System.out.format("in Instanzeninitialisierer%n");
    }

    static {
        System.out.format("in Klasseninitialisierer%n");
    }

    public Aufg4() {
        System.out.format("In AufgabeInitializer\n");
    }
    public Aufg4(int param) {
        System.out.format("In AufgabeInitializer(int)\n");
    }



    static public void main(String [] args) {
        new Aufg4();
        System.out.println();
        new Aufg4(5); // führt classinitializer nicht mit aus, da dieser nur einmal (beim ersten Erstellen der
                            // Klasse) ausgeführt wird
    }
}
