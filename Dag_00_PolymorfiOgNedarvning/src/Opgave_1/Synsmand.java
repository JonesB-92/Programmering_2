package Opgave_1;

public class Synsmand extends Mekaniker {
    private int synsTillæg;
    private int antalSyn;

    public Synsmand(String navn, String adresse, int svendeprøveÅr, int antalSyn) {
        super(navn, adresse, svendeprøveÅr);
        synsTillæg = 29;
        this.antalSyn = antalSyn;
    }

    public int getSynsTillæg() {
        return synsTillæg;
    }

    public void setSynsTillæg(int synsTillæg) {
        this.synsTillæg = synsTillæg;
    }

    public int getAntalSyn() {
        return antalSyn;
    }

    public void setAntalSyn(int antalSyn) {
        this.antalSyn = antalSyn;
    }

    @Override
    public int beregnUgeLøn() {
        return super.beregnUgeLøn() + (synsTillæg * antalSyn);
    }
}
