package Opgave_3;

public abstract class Ansat extends Person {
    private int timeløn;
    private int arbejdstimer;

    public Ansat(String navn, String adresse, int timeløn) {
        super(navn, adresse);
        this.timeløn = timeløn;
        arbejdstimer = 37;
    }

    public Ansat(String navn, String adresse, int timeløn, int arbejdstimer) {
        super(navn, adresse);
        this.timeløn = timeløn;
        this.arbejdstimer = arbejdstimer;
    }

    public int getTimeløn() {
        return timeløn;
    }

    public int beregnUgeLøn() {
        return timeløn * arbejdstimer;
    }
}
