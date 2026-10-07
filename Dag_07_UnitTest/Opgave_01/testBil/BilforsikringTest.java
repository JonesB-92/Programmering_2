import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BilforsikringTest {
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
     * <p>
     * Hvis parametrene ikke er indenfor det gyldige område
     * kastes en exception med en passende tekst
     * <p>
     * Krav: grundPræmie er tildelt værdi.
     */
    // TEST PÅ REGNESTYK -------------------------- Alder, MAN, SKADEFRI 0
    @Test
    void testBeregnPræmie_Alder18_M_år0_() {
        // Arrange
        BilForsikring bilforsikring = new BilForsikring();

        bilforsikring.setGrundpraemie(1000);
        int alder = 18;
        boolean isKvinde = false;
        int skadeFrieÅr = 0;
        double expected = 1250;

        // Act
        double actual = bilforsikring.beregnPraemie(alder, isKvinde, skadeFrieÅr);

        // Assert
        assertEquals(expected, actual);
    }



    // TEST PÅ EXCEPTION THROWS
    @Test
    void testBeregnPræmie_FejlPåAlder() {

        // Arrange
        BilForsikring bilforsikring = new BilForsikring();

        bilforsikring.setGrundpraemie(1000);
        int alder = 17;
        boolean isKvinde = false;
        int skadeFrieÅr = 0;

        // Act and assert
        Exception exception = assertThrows(RuntimeException.class, () -> {
            bilforsikring.beregnPraemie(alder, isKvinde, skadeFrieÅr);
        });
        assertEquals("Du er for ung til at tegne en forsikring", exception.getMessage());
    }
}
