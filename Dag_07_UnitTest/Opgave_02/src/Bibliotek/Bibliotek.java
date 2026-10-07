package Bibliotek;

import java.time.LocalDate;

public class Bibliotek {

    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * Krav: beregnetDato og faktiskDato indeholder lovlige datoer og beregnetDato < faktiskDato
     * (beregnetDato er forventet afleveringsdato og faktiskDato er den dag bogen blev afleveret;
     * voksen er sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        int dageOverskredet = beregnetDato.until(faktiskDato).getDays();

        if (!voksen) {
            if (dageOverskredet < 0) {
                return 0;
            }
            return dageOverskredet > 0 ? dageOverskredet > 7 ? dageOverskredet > 14 ? 45 : 30 : 10 : 0;
        }

        else return dageOverskredet > 0 ? dageOverskredet > 7 ? dageOverskredet > 14 ? 90 : 60 : 20 : 0;
    }
}

