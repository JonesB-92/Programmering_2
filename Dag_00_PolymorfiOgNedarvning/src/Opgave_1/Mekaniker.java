package Opgave_1;

public class Mekaniker extends Person {
    private int svendeprøveÅr;
    private int timeløn;

    public Mekaniker(String navn, String adresse, int svendeprøveÅr) {
        super(navn, adresse);
        this.svendeprøveÅr = svendeprøveÅr;
        timeløn = 200;
    }

    public int getSvendeprøveÅr() {
        return svendeprøveÅr;
    }

    public void setSvendeprøveÅr(int svendeprøveÅr) {
        this.svendeprøveÅr = svendeprøveÅr;
    }

    public int getTimeløn() {
        return timeløn;
    }

    public void setTimeløn(int timeløn) {
        this.timeløn = timeløn;
    }

    // Udvid så det nu bliver muligt at beregne ugeløn for mekanikere og værk-
    //førere (en metode beregnUgeLoen). Det kan antages at både mekanikere og værkfører har en
    //arbejdsuge på 37 timer

    public int beregnUgeLøn() {
        return getTimeløn() * 37;
    }

}
