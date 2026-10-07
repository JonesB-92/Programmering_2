package Opgave_5;

import java.util.ArrayList;

public class Kurv {
    //Lav en klasse, der repræsenterer en indkøbsvogn. Det skal være muligt at lægge en vare i
    //indkøbsvognen samt udregne den samlede salgspris for de varer, der er i indkøbsvognen.
    private ArrayList<Vare> varer;

    public Kurv(ArrayList<Vare> varer) {
        this.varer = varer;
    }

    public ArrayList<Vare> getVarer() {
        return new ArrayList<>(varer);
    }

    public double beregnSamledeSalgspris() {
        double samledePris = 0;

        for(Vare vare : varer) {
            samledePris += vare.beregnPrisMedMoms();
        }

        return samledePris;
    }

    public void printKassebon() {
        System.out.println("KASSEBON");
        System.out.println("------------------------------");
        System.out.printf("%-15s %15s\n", "Vare", "Pris inkl. moms");
        System.out.println("------------------------------");

        double samletPris = 0;

        for (Vare vare : varer) {
            String navn = vare.getNavn();
            double prisMedMoms = vare.beregnPrisMedMoms();
            samletPris += prisMedMoms;

            System.out.printf("%-15s %15.2f\n", navn, prisMedMoms);
        }

        System.out.println("------------------------------");
        System.out.printf("Samlet pris inkl. moms: %.2f kr.\n", samletPris);
    }

}
