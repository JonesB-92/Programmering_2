public class BilForsikring {
    // angiver den til enhver tid gældende grundpræmie for en bilforsikring
    private double grundPraemie;

    public double getGrundPraemie() {
        return grundPraemie;
    }

    public void setGrundpraemie(double grundPr) {
        if (grundPr <= 0) {
            throw new RuntimeException("grundPr skal vaere positiv");
        }
        grundPraemie = grundPr;
    }

    /**
     * Beregner og returnerer en præmie udregnet ud fra følgende regler:
     * grundPræmie danner udgangspunkt for præmien
     * hvis der er tale om unge under 25 tillægges grundPræmien 25%
     * hvis der er tale om en kvinde reduceres præmien med 5%
     * hvis man har kørt skadefrit i:
     * 0 til 2 år reduceres præmien med 0%
     * 3 til 5 år reduceres præmien med 15%
     * 6 til 8 år reduceres præmien med 25%
     * over 8 år reduceres præmien med 35%
     * ovenstående skal udregnes i den angivne rækkefølge
     *
     * Hvis parametrene ikke er indenfor det gyldige område
     * kastes en exception med en passende tekst
     *
     * Krav: grundPræmie er tildelt værdi.
     */
    public double beregnPraemie(int alder, boolean isKvinde, int skadeFrieÅr) {
        double praemie = grundPraemie;
        if (praemie == 0) {
            throw new RuntimeException("GrundPraemie har ikke fået en værdi");
        }
        if (alder < 18) {
            throw new RuntimeException("Du er for ung til at tegne en forsikring");
        }
        if (alder - skadeFrieÅr < 18) {
            throw new RuntimeException("Du kan ikke have kørt skadefri så længe");
        }
        if (skadeFrieÅr < 0) {
            throw new RuntimeException("Antal skadefrie år skal være positiv");
        }
        if (alder < 25) {
            praemie = 1.25 * grundPraemie;
        }
        if (isKvinde) {
            praemie = praemie * 0.95; // 5%
        }
        if (skadeFrieÅr < 3) {        // 0%
        } else if (skadeFrieÅr < 6) {
            praemie = praemie * 0.85; // 15%
        } else if (skadeFrieÅr < 9) {
            praemie = praemie * 0.75; // 25%
        } else {
            praemie = praemie * 0.65; // 35%
        }
        return praemie;
    }
}
