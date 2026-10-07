package Opgave_3;

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
    // Desuden skal det gælde, at evt. specialiserede synsmænd ikke kan få ekstra betaling for deres speciale.
    //dvs: alle evt. subklasser af synsmand IKKE skal have mere i løn end dette: derfor final!
    public final int beregnUgeLøn() {
        return super.beregnUgeLøn() + (synsTillæg * antalSyn);
    }
}
