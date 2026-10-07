package Opgave_5;

public class Fødevare extends Vare {
    private int shelfLifeDays;

    public Fødevare(double pris, String navn, String beskrivelse, int shelfLifeDays) {
        super(pris, navn, beskrivelse);
        this.shelfLifeDays = shelfLifeDays;
    }

    @Override
    public double beregnPrisMedMoms() {
        double moms = 0.05;

        return super.beregnPrisMedMoms(moms);
    }

}
