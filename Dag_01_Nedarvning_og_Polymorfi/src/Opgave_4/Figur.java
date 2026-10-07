package Opgave_4;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;

public abstract class Figur {
    private int x, y;
    //For at kunne printe
    public String form;

    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getForm() {
        return form;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String printPosition() {
        int x = getX();
        int y = getY();

        return "(x, y) = " + "(" + x + ", " + y + ") \n";
    }

    public void parallelforskyd(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public abstract double beregnAreal();


    public void printTilstand(ArrayList<Figur> figurListe) {
        for (Figur figur : figurListe) {
            if (figur instanceof Firkant) {
                System.out.println("Form: " + figur.getForm() + "\n" + "Side1: " + ((Firkant) figur).getSide1() + "\nSide2: " + ((Firkant) figur).getSide2()
                        + "\nAreal: " + figur.beregnAreal() + "\n" +
                        figur.printPosition());
            }
            if (figur instanceof Cirkulær) {
                System.out.println("Form: " + figur.getForm() + "\n" + "Radius1: " + ((Cirkulær) figur).getRadius1() + "\nRadius2: " + ((Cirkulær) figur).getRadius2()
                        + "\nAreal: " + figur.beregnAreal() + "\n" +
                        figur.printPosition());
            }
        }
    }
}
