package Opgave1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BogtitelTest {
    private Sælger sælger;
    private Indkøber indkøber;
    private Kunde læsehest1;
    private Kunde læsehest2;
    private Kunde læsehest3;
    private Bogtitel bogtitel;
    private Bogtitel bogtitel1;

    @BeforeEach
    void setUp() {
        // Opgave1.Sælger / Opgave1.Indkøber
        sælger = new Sælger("Hansen");
        indkøber = new Indkøber("Jensen");
        // Bøger
        bogtitel = new Bogtitel("Anders And", 6);
        bogtitel1 = new Bogtitel("Java", 8);
        // Kunder
        læsehest1 = new Kunde("læsehest1");
        læsehest2 = new Kunde("læsehest2");
        læsehest3 = new Kunde("læsehest3");
    }

    @Test
    void bogKøbt_ved_8stk() {
        // Act
        bogtitel1.bogKøbtAf(læsehest1);

        // Assert
        int expectedAntal = 7;
        int actualAntal = bogtitel1.getAntal();
        assertEquals(expectedAntal, actualAntal);

        // TJekke at bog er opdateret med dets købere
        assertTrue(bogtitel1.getKunder().contains(læsehest1));
        // Tjekke at kunde er opdateret med købte bog
        assertTrue(læsehest1.getKøbteBøger().contains(bogtitel1));

        assertTrue(læsehest1.getKøbteBøger().size() == 1);

    }

    @Test
    void bogKøbt_ved_6stk() {
        // Arrange
        bogtitel.addObserver(indkøber);

        // Act
        bogtitel.bogKøbtAf(læsehest1);

        // Assert
        int expectedAntal = 15;
        int actualAntal = bogtitel.getAntal();
        assertEquals(expectedAntal, actualAntal);

        // Tjekke at bog er opdateret med dets købere
        assertTrue(bogtitel.getKunder().contains(læsehest1));
        // Tjekke at kunde er opdateret med købte bog
        assertTrue(læsehest1.getKøbteBøger().contains(bogtitel));

        assertTrue(læsehest1.getKøbteBøger().size() == 1);

    }


    @Test
    void bogKøbt_ØvrigListe() {
        // Arrange
        //Bogen Java købes af Læsehest1
        //Bogen Java købes af Læsehest2
        //Bogen Java købes af Læsehest3
        //Bogen Anders And købes af Læsehest1
        //Bogen Anders And købes af Læsehest2
        //Bogen Anders And købes af Læsehest3
        bogtitel.addObserver(indkøber);
        bogtitel.addObserver(sælger);

        // Act
        bogtitel1.bogKøbtAf(læsehest1);
        bogtitel1.bogKøbtAf(læsehest2);
        bogtitel1.bogKøbtAf(læsehest3);
        bogtitel.bogKøbtAf(læsehest1);
        bogtitel.bogKøbtAf(læsehest2);
        bogtitel.bogKøbtAf(læsehest3);

        // Assert
        // Tjekke at bog er opdateret med dets købere
        assertTrue(bogtitel.getKunder().contains(læsehest1));
        assertTrue(bogtitel1.getKunder().contains(læsehest1));
        assertTrue(bogtitel.getKunder().contains(læsehest2));
        assertTrue(bogtitel1.getKunder().contains(læsehest2));
        assertTrue(bogtitel.getKunder().contains(læsehest3));
        assertTrue(bogtitel1.getKunder().contains(læsehest3));
        // Tjekke at kunde er opdateret med købte bog
        assertTrue(læsehest1.getKøbteBøger().contains(bogtitel));
        assertTrue(læsehest1.getKøbteBøger().contains(bogtitel1));
        assertTrue(læsehest2.getKøbteBøger().contains(bogtitel));
        assertTrue(læsehest2.getKøbteBøger().contains(bogtitel1));
        assertTrue(læsehest3.getKøbteBøger().contains(bogtitel));
        assertTrue(læsehest3.getKøbteBøger().contains(bogtitel1));

        assertTrue(læsehest1.getKøbteBøger().size() == 2);
        assertTrue(læsehest2.getKøbteBøger().size() == 2);
        assertTrue(læsehest3.getKøbteBøger().size() == 2);

    }

}