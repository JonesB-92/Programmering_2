package Opgave_1;

public class Værkfører extends Mekaniker {
    private int værkførerÅr;
    private int ugentligTillæg;

    public Værkfører(String navn, String adresse, int svendeprøveÅr, int værkførerÅr) {
        super(navn, adresse, svendeprøveÅr);
        this.værkførerÅr = værkførerÅr;
        ugentligTillæg = 50;
    }

    public int getVærkførerÅr() {
        return værkførerÅr;
    }

    public void setVærkførerÅr(int værkførerÅr) {
        this.værkførerÅr = værkførerÅr;
    }

    public int getUgentligTillæg() {
        return ugentligTillæg;
    }

    public void setUgentligTillæg(int ugentligTillæg) {
        this.ugentligTillæg = ugentligTillæg;
    }

    // Opgave 2: Udvid så det nu bliver muligt at beregne ugeløn for mekanikere og værk-
    //førere (en metode beregnUgeLoen). Det kan antages at både mekanikere og værkfører har en
    //arbejdsuge på 37 timer
    @Override
    public int beregnUgeLøn() {
        return super.beregnUgeLøn() + ugentligTillæg;
    }
}
