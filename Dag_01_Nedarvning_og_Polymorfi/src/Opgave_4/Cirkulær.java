package Opgave_4;

public abstract class Cirkulær extends Figur {
    private double radius1;
    private double radius2;

    public double getRadius1() {
        return radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public Cirkulær(int x, int y, double radius1) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius1;
    }

    public Cirkulær(int x, int y, double radius1, double radius2) {
        super(x, y);
        this.radius1 = radius1;
        this.radius2 = radius2;
    }


    @Override
    public double beregnAreal() {
        return Math.PI * radius1 * radius2;
    }

}
