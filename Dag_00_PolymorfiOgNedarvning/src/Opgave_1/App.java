package Opgave_1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //c Opret i anvendelsesklassen et antal mekanikere og værkførere, samt indsæt dem i en
        //ArrayList<Mekaniker>. Beregn dernæst den samlede ugeløn for alle i listen.

        Mekaniker mek1 = new Mekaniker("Mikkel", "Gellerup", 2025);
        Mekaniker mek2 = new Mekaniker("Mikkel2", "Gellerup", 2025);
        Mekaniker mek3 = new Mekaniker("Mikkel3", "Gellerup", 2025);
        Værkfører værkfører1 = new Værkfører("Søren", "Volsmose", 2024, 2025);
        Værkfører værkfører2 = new Værkfører("Søren", "Volsmose", 2024, 2025);
        Værkfører værkfører3 = new Værkfører("Søren", "Volsmose", 2024, 2025);
        Synsmand synsmand1 = new Synsmand("Oliver", "8210", 2026, 15);
        Synsmand synsmand2 = new Synsmand("Oliver", "8210", 2026, 10);
        Synsmand synsmand3 = new Synsmand("Oliver", "8210", 2026, 2);

        ArrayList<Mekaniker> mekanikere = new ArrayList<>();

        mekanikere.add(mek1);
        mekanikere.add(mek2);
        mekanikere.add(mek3);
        mekanikere.add(værkfører1);
        mekanikere.add(værkfører2);
        mekanikere.add(værkfører3);
        mekanikere.add(synsmand1);
        mekanikere.add(synsmand2);
        mekanikere.add(synsmand3);

        System.out.println(samletLoen(mekanikere));

    }

    //Generaliseringsstrukturen skal gøre det muligt at skrive følgende operation i en App klasse:

    /**
     * Beregner summen af ugelønnen for alle i listen
     */
    public static double samletLoen(ArrayList<Mekaniker> list) {
        double samletLøn = 0;
        for (Mekaniker mekaniker : list) {
            samletLøn += mekaniker.beregnUgeLøn();
        }

        return samletLøn;
    }
}
