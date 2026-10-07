package Opgave_5;

public class ElArtikel extends Vare {
    private int WattPrTime;

    public ElArtikel(double pris, String navn, String beskrivelse, int wattPrTime) {
        super(pris, navn, beskrivelse);
        WattPrTime = wattPrTime;
    }

    @Override
    public double beregnPrisMedMoms() {
        //der er 30 % moms på el-artikler (dog mindst 3 kr.)
        double moms = 0.30;
        double prisMedMoms = super.beregnPrisMedMoms(moms);

        if (prisMedMoms < (getPris() + 3)) {
            prisMedMoms = getPris() + 3;
        }

        return prisMedMoms;
    }

}
