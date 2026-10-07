package Opgave_02;

public class Counter {
    //Opgave 2
    //Skriv en klasse Counter med et Singleton pattern. Klassen skal have en instansvariabel
    //value, som initialiseres til 0.
    private int value;

    // Singleton pattern
    // ------------------------------------------------------
    private static Counter instance;

    private Counter() {
        value = 0;
    }

    // Så vi sørger for konstant kun at have en instans af Counter ved at bruge getteren som kald til constructoren.
    public static Counter getInstance() {
        if (instance == null) {
            instance = new Counter();
        }
        return instance;
    }
    // -------------------------------------------------------

    //• count() som tæller value op med 1
    public void count() {
        value++;
    }

    //• times2() som fordobler value
    public void times2() {
        value *= 2;
    }

    //• zero() som nulstiller value
    public void reset() {
        value = 0;
    }

    //• getValue() som returnerer værdien af value
    public int getValue() {
        return value;
    }

}
