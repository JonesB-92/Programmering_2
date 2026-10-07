package Opgave_2_2;

import java.util.HashSet;
import java.util.Set;

public class Skole {
    private String navn;
    //Link enkeltrettet
    private Set<Studerende> studerendeHashSet;

    public Skole(String navn, Set<Studerende> studerendeList) {
        this.navn = navn;
        this.studerendeHashSet = studerendeList;
    }

    public String getNavn() {
        return navn;
    }

    public HashSet<Studerende> getStuderendeHashSet() {
        return new HashSet<>(studerendeHashSet);
    }

    public void addStuderende(Studerende studerende) {
        studerendeHashSet.add(studerende);
    }


    public void removeStuderende(Studerende studerende) {
        studerendeHashSet.remove(studerende);
    }

    //Metoden gennemsnit skal beregne det samlede gennemsnit af alle karakter, for de
    //studerende på skolen.
    public double beregnGennemsnit() {
        double sumAfKarakterer = 0;
        int antalKarakterer = 0;

        for (Studerende stud : studerendeHashSet) {
            for (Integer karakter : stud.getKarakterer()) {
                sumAfKarakterer += karakter;
                antalKarakterer++;
            }
        }
        if (antalKarakterer == 0) {
            return Double.NaN;
        } else {
            return sumAfKarakterer / antalKarakterer;
        }
    }

    //• Metoden findStuderende skal returnerer en studerende med det angivne studieNr,
    //hvis en sådan studerende ikke findes, skal der returneres null
    public Studerende findStuderende(int studierNr) {

        for (Studerende stud : studerendeHashSet) {
            if (stud.getStudierNr() == studierNr) {
                return stud;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return navn;
    }

}

