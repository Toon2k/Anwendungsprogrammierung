package Uebung_09.Aufg9_4;

public class GenTyp<E> {

    private E attribut;

    public E m(E p) {
        System.out.println("Methode m wurde aufgerufen");
        return p;
    }
}
