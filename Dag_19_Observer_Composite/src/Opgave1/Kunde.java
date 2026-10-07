package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
    private String navn;
    //Link
    private List<Bogtitel> købteBøger;


    public Kunde(String navn) {
        this.navn = navn;
        købteBøger = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public List<Bogtitel> getKøbteBøger() {
        return new ArrayList<>(købteBøger);
    }

    public void kundeKøberBog(Bogtitel bogtitel) {
        if (!købteBøger.contains(bogtitel)) {
            købteBøger.add(bogtitel);
            bogtitel.bogKøbtAf(this);
        }
    }
}
