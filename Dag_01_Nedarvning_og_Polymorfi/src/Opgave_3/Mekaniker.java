package Opgave_3;

public class Mekaniker extends Ansat {
    private int svendeprøveÅr;

    public Mekaniker(String navn, String adresse, int svendeprøveÅr) {
        super(navn, adresse, 200);
        this.svendeprøveÅr = svendeprøveÅr;
    }

    public int getSvendeprøveÅr() {
        return svendeprøveÅr;
    }

    public void setSvendeprøveÅr(int svendeprøveÅr) {
        this.svendeprøveÅr = svendeprøveÅr;
    }


    // Udvid så det nu bliver muligt at beregne ugeløn for mekanikere og værk-
    //førere (en metode beregnUgeLoen). Det kan antages at både mekanikere og værkfører har en
    //arbejdsuge på 37 timer
    public int beregnUgeLøn() {
        return super.beregnUgeLøn();
    }

}
