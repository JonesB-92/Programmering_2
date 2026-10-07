package Opgave2;

public class Ellipse extends Figur{
    private double radius1;
    private double radius2;

    public Ellipse(double radius1, double radius2) {
        super("Ellipse");
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    public double getRadius1() {
        return radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    @Override
    public void tegn() {
        System.out.println(super.getName());
    }

    @Override
    public double getAreal() {
        return Math.PI * radius1 * radius2;
    }
}
