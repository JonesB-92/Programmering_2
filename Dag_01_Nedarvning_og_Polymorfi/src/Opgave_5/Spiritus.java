package Opgave_5;

public class Spiritus extends Fødevare {
    private double alkProcent;

    public Spiritus(double pris, String navn, String beskrivelse, int shelfLifeDays, double alkProcent) {
        super(pris, navn, beskrivelse, shelfLifeDays);
        this.alkProcent = alkProcent;
    }


    @Override
    public double beregnPrisMedMoms() {
        //80 % moms på spiritus (dog 120 % hvis netto prisen er over 90 kr.).
        double moms;
        if (this.getPris() > 90) {
            moms = 1.20;
        } else {
            moms = 0.8;
        }
//        double moms = (getPris() > 90) ? 1.20 : 0.80;
        return super.beregnPrisMedMoms(moms);
    }
}
