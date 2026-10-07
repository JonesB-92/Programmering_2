package Opgave_2_1_Plus_Opgave_3;

import java.util.ArrayList;
import java.util.List;

public class Studerende implements Comparable<Studerende>{
    private int studieNr;
    private String navn;
    private List<Integer> karakterer;

    public Studerende(int studierNr, String navn, List<Integer> karakterer) {
        this.studieNr = studierNr;
        this.navn = navn;
        this.karakterer = karakterer;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public List<Integer> getKarakterer() {
        return new ArrayList<>(karakterer);
    }

    public void addKarakterer(int karakter) {
        karakterer.add(karakter);
    }

    @Override
    public String toString() {
        return "Studerende: " + navn +
                " - studierNr: " + studieNr;
    }

    //Opgave 3
    //Lad klassen Studerende fra opgave 2 implementerer Comparable interfacet, idet to
    //Studerende opfattes som værende ens, hvis de har samme studieNr.
    @Override
    public int compareTo(Studerende o) {
        return Integer.compare(this.studieNr, o.studieNr);
    }

}
