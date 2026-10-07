package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Bogtitel implements Subject {
    private String titel;
    private int antal;
    //Link
    private List<Kunde> kunder;
    private List<Observer> observers;

    public Bogtitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        kunder = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public List<Kunde> getKunder() {
        return new ArrayList<>(kunder);
    }

//    public List<Opgave1.Observer> getObservers() {
//        return new ArrayList<>(observers);
//    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public void indkoebTilLager(int antal) {
        this.antal += antal;
    }

    //at metoden etKoeb(k: Opgave1.Kunde): void på BogTitel har følgende specifikation:
    //Associeringen mellem den aktuelle bogtitel og kunden k er opdateret, bogens antal er
    //reduceret med en ("og alle observers skal have information om, at bogen er solgt" = Dette skal vi bruge mock til, svært at teste).
    public void bogKøbtAf(Kunde kunde) {
        if (!kunder.contains(kunde)) {
            kunder.add(kunde);
            kunde.kundeKøberBog(this);
            antal--;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(this);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String toString(){
        return titel;
    }

}
