package Opgave_2_2;

import java.util.ArrayList;
import java.util.List;

public class Studerende {
    private int studierNr;
    private String navn;
    private List<Integer> karakterer;

    public Studerende(int studierNr, String navn, List<Integer> karakterer) {
        this.studierNr = studierNr;
        this.navn = navn;
        this.karakterer = karakterer;
    }

    public int getStudierNr() {
        return studierNr;
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
                " - studierNr: " + studierNr;
    }
}
