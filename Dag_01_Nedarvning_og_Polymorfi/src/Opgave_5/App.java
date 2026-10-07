package Opgave_5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Opret varer
        Vare rugbrød = new Fødevare(25, "Rugbrød", "Fuldkorn", 7);         // moms 5%
        Vare snaps = new Spiritus(100, "Snaps", "Akvavit", 365, 40.0);     // moms 120%
        Vare vin = new Spiritus(80, "Rødvin", "Italiensk", 365, 13.5);    // moms 80%
        Vare elkedel = new ElArtikel(60, "Elkedel", "1.5L rustfri", 2000); // moms 30% men check for min. 3 kr.
        Vare tastatur = new ElArtikel(500, "Tastatur", "Mekanisk RGB", 5); // moms 30%


        // Læg dem i kurven
        ArrayList<Vare> indkøbsliste = new ArrayList<>();
        indkøbsliste.add(rugbrød);
        indkøbsliste.add(snaps);
        indkøbsliste.add(vin);
        indkøbsliste.add(elkedel);
        indkøbsliste.add(tastatur);

        Kurv kurv = new Kurv(indkøbsliste);

        // Udskriv total
        System.out.printf("Samlet pris inkl. moms: %.2f kr.\n", kurv.beregnSamledeSalgspris());

        kurv.printKassebon();
    }
}
