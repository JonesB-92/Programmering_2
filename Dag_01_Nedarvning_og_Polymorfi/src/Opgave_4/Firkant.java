package Opgave_4;

import java.util.Random;

public abstract class Firkant extends Figur {
    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public Firkant(int x, int y, double side1, double side2) {
        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double beregnAreal() {
        return side1 * side2;
    }

}
