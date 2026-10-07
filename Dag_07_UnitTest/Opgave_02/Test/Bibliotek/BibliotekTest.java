package Bibliotek;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BibliotekTest {

    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * Krav: beregnetDato og faktiskDato indeholder lovlige datoer og beregnetDato < faktiskDato
     * (beregnetDato er forventet afleveringsdato og faktiskDato er den dag bogen blev afleveret;
     * voksen er sand, hvis det er en voksen og falsk ellers)
     */

    @Test
    void testBeregnBøde_0_DagVoksen() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 1);
        boolean voksen = true;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void testBeregnBøde_1_DagVoksen() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 2);
        boolean voksen = true;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 20;
        assertEquals(expected, actual);

    }

    @Test
    void testBeregnBøde_7_DagVoksen() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 8);
        boolean voksen = true;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    void testBeregnBøde_8_DagVoksen() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 9);
        boolean voksen = true;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 60;
        assertEquals(expected, actual);
    }

    @Test
    void testBeregnBøde_14_DagVoksen() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 15);
        boolean voksen = true;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 60;
        assertEquals(expected, actual);

    }

    @Test
    void testBeregnBøde_15_DagVoksen() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 16);
        boolean voksen = true;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 90;
        assertEquals(expected, actual);

    }

    // Barn
    @Test
    void testBeregnBøde_0_DagBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 1);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void testBeregnBøde_1_DagBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 2);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void testBeregnBøde_7_DagBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 8);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 10;
        assertEquals(expected, actual);

    }

    @Test
    void testBeregnBøde_8_DagBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 9);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    void testBeregnBøde_14_DagBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 15);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 30;
        assertEquals(expected, actual);

    }

    @Test
    void testBeregnBøde_15_DagBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 8, 16);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 45;
        assertEquals(expected, actual);

    }

    // Aflevering før dato
    @Test
    void testBeregnBøde_0_DageBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 7, 1);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 0;
        assertEquals(expected, actual);

    }
    @Test
    void testBeregnBøde_30_DagBarn() {
        /** Triple-A Notation */
        //Arrange
        Bibliotek bibliotek = new Bibliotek();
        LocalDate beregnetDato = LocalDate.of(2025, 8, 1);
        LocalDate faktiskDato = LocalDate.of(2025, 9, 1);
        boolean voksen = false;

        //Act
        int actual = bibliotek.beregnBøde(beregnetDato, faktiskDato, voksen);

        //Assert
        int expected = 45;
        assertEquals(expected, actual);

    }

}