package bryghus;

public class SalgsLinje
{
    Salg salg;
    Produkt produkt;
    int antal;
    int samletPris;

    public SalgsLinje(Salg salg, Produkt produkt, int antal, int samletPris)
    {
        this.salg = salg;
        this.produkt = produkt;
        this.antal = antal;
        this.samletPris = samletPris;
    }

    public int getSamletPris()
    {
        return samletPris;
    }

    @Override
    public String toString()
    {
        return antal + " x " + produkt.getNavn() + " (Samlet pris: " + getSamletPris() + ")";
    }
}
