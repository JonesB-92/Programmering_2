package Opgave_3;

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
        Arbejdstræl morten = new Arbejdstræl("Morten", "Pisby", 115);

        ArrayList<Ansat> ansatte = new ArrayList<>();

        ansatte.add(mek1);
        ansatte.add(mek2);
        ansatte.add(mek3);
        ansatte.add(værkfører1);
        ansatte.add(værkfører2);
        ansatte.add(værkfører3);
        ansatte.add(synsmand1);
        ansatte.add(synsmand2);
        ansatte.add(synsmand3);
        ansatte.add(morten);

        System.out.println(samletLoen(ansatte));

    }

    //Generaliseringsstrukturen skal gøre det muligt at skrive følgende operation i en App klasse:
    /**
     * Beregner summen af ugelønnen for alle i listen
     */
    public static double samletLoen(ArrayList<Ansat> list) {
        double samletLøn = 0;
        for (Ansat ansat : list) {
            samletLøn += ansat.beregnUgeLøn();
        }
        return samletLøn;
    }
}
