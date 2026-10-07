package bryghus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Salg
{
    int ordreNr;
    LocalDate dato;
    ArrayList<SalgsLinje> salgsLinjer = null;
    SalgsStatus status;

    public Salg(int ordreNr)
    {
        this.ordreNr = ordreNr;
        this.dato = LocalDate.now();
        this.salgsLinjer = new ArrayList<SalgsLinje>();
        this.status = SalgsStatus.EjBetalt;
    }

    public SalgsLinje createSalgsLinje(Produkt produkt, int antal, int samletPris)
    {
        SalgsLinje salgsLinje = new SalgsLinje(this, produkt, antal, samletPris);

        salgsLinjer.add(salgsLinje);

        return salgsLinje;
    }

    public int getSamletPris()
    {
        int samletPris = 0;

        for (SalgsLinje s : salgsLinjer)
        {
            samletPris += s.getSamletPris();
        }
        return samletPris;
    }

    @Override
    public String toString()
    {
        return "Ordre nr: " + ordreNr + " (Samlet pris: " + getSamletPris() + ")";
    }
}
