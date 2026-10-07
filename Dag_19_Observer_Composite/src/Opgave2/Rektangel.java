package Opgave2;

public class Rektangel extends Figur {
    private double længde;
    private double bredde;

    public Rektangel(double længde, double bredde) {
        super("Rektangel");
        this.længde = længde;
        this.bredde = bredde;
    }

    public double getLængde() {
        return længde;
    }

    public double getBredde() {
        return bredde;
    }

    @Override
    public void tegn() {
        System.out.println(super.getName());
    }

    @Override
    public double getAreal() {
        return længde * bredde;
    }
}
