package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Sælger implements Observer {
    private String navn;

    public Sælger(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    //at metoden update(Opgave1.Subject s): void på Saelger har følgende specifikation:
    //Der er udskrevet en liste på skærmen med titlen på de bøger, der er købt af andre
    //kunder, der også har købt den netop solgte bog s. Listen må ikke indeholde den
    //samme titel flere gange. Endvidere skal listen ikke indeholde titlen på den aktuelle bog.
    @Override
    public void update(Subject subject) {
        // Nødt til at lave en ny liste, der indeholder øvrige købte bøger?
        List<Bogtitel> øvrigeBøger = new ArrayList<>();

        if (subject instanceof Bogtitel) {
            // Caster det, vi opdaterer, til en bogtitel, hvis den er den type
            Bogtitel bogtitel = (Bogtitel) subject;

            // Tjekke hvem har købt bogen: det ved vi allerede, da bogen selv ved det!
            // Vise alle kunders øvrige køb
            for (Kunde k : bogtitel.getKunder()) {
                for (Bogtitel bog : k.getKøbteBøger()) {
                    if (!øvrigeBøger.contains(bog) && !bog.equals(bogtitel)) { // Undgå dubletter!
                        øvrigeBøger.add(bog);
                    }
                }
            }
        }
        System.out.println("Kunder har også købt: ");
        System.out.println(øvrigeBøger);
    }
}
