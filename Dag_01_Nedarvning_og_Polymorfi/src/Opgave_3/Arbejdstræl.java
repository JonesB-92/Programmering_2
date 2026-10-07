package Opgave_3;

public class Arbejdstræl extends Ansat {
    private int timerPrUger;

    public Arbejdstræl(String navn, String adresse, int timeløn) {
        super(navn, adresse, timeløn);
        this.timerPrUger = 25;
    }

    public int getTimerPrUger() {
        return timerPrUger;
    }

    public int beregnUgeLøn() {
        return super.beregnUgeLøn();
    }
}
