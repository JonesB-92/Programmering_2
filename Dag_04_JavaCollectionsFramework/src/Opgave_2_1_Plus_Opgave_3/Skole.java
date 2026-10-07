package Opgave_2_1_Plus_Opgave_3;

import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn;
    //Link enkeltrettet
    private List<Studerende> studerendeList;

    public Skole(String navn, List<Studerende> studerendeList) {
        this.navn = navn;
        this.studerendeList = studerendeList;
    }

    public String getNavn() {
        return navn;
    }

    public List<Studerende> getStuderendeList() {
        return new ArrayList<>(studerendeList);
    }

    public void addStuderende(Studerende studerende) {
        if (!studerendeList.contains(studerende)) {
            studerendeList.add(studerende);
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (studerendeList.contains(studerende)) {
            studerendeList.remove(studerende);
        }
    }

    //Metoden gennemsnit skal beregne det samlede gennemsnit af alle karakter, for de
    //studerende på skolen.
    public double beregnGennemsnit() {
        double sumAfKarakterer = 0;
        int antalKarakterer = 0;

        for (Studerende stud : studerendeList) {
            for (Integer karakter : stud.getKarakterer()) {
                sumAfKarakterer += karakter;
                antalKarakterer++;
            }

        }if (antalKarakterer == 0) {
            return Double.NaN;
        } else {
            return sumAfKarakterer / antalKarakterer;
        }
    }

    //• Metoden findStuderende skal returnerer en studerende med det angivne studieNr,
    //hvis en sådan studerende ikke findes, skal der returneres null
    public Studerende findStuderende(int studierNr) {

        for (Studerende stud : studerendeList) {
            if(stud.getStudieNr() == studierNr) {
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
