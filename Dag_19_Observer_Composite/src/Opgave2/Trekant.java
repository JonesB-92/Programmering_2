package Opgave2;

public class Trekant extends Figur {
    //givet ved højde og grundlinje
    private double højde;
    private double grundlinje;

    public Trekant(double grundlinje, double højde) {
        super("Trekant");
        this.grundlinje = grundlinje;
        this.højde = højde;
    }

    public double getHøjde() {
        return højde;
    }

    public double getGrundlinje() {
        return grundlinje;
    }

    @Override
    public void tegn() {
        System.out.println(super.getName());
    }

    @Override
    public double getAreal() {
        return højde / 2 * grundlinje;
    }
}
