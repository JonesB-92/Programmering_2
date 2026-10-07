package Opgave_5;

public abstract class Vare {
    private double pris;
    private String navn;
    private String beskrivelse;


    public Vare(double pris, String navn, String beskrivelse) {
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public double beregnPrisMedMoms(double moms) {
        return pris + (pris * moms);
    }

    public double beregnPrisMedMoms() {
        return beregnPrisMedMoms(0.25);
    }

//    -----------------------------------------------------------------

    ///Man KUNNE også lave en metode med fast moms og en uden:

    // New shared calculation logic

    //    protected double beregnPrisMedFastMoms(double moms) {
    //        return pris + (pris * moms);
    //    }
    //
    //    // Abstract method subclasses must implement
    //    public abstract double beregnPrisMedMoms();


    /// Som så kan lede til dette
    //@Override
    //    public double beregnPrisMedMoms() {
    //        double moms = 0.05;
    //        return super.beregnPrisMedFastMoms(moms);
    //    }

}
