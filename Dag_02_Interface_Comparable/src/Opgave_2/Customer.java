package Opgave_2;

public class Customer implements Comparable<Customer> {
    //Lav en Customer-klasse med fornavn, efternavn og alder. Klassen skal have en constructor samt
    //set- og get-metoder.
    private String fornavn;
    private String efternavn;
    private int alder;

    public Customer(String fornavn, String efternavn, int alder) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public int getAlder() {
        return alder;
    }

    @Override
    // Programmér metoden compareTo, så en kunde kommer før en anden kunde, hvis kundens efternavn kommer før en anden kundes
    //efternavn i henhold til den naturlige ordning på Strings. Hvis to kunder har samme efternavne,
    //sammenlignes yderligere på fornavn, og hvis begge fornavne er ens, sammenlignes på alder (yngst
    //først).
    public int compareTo(Customer o) {
        if (o == null) {
            // Example: treat null as "less than" this customer
            return 1;
        }

        int customer = efternavn.compareTo(o.getEfternavn());

        //Tjekker om efternavn er det samme
        if (customer == 0) {
            customer = fornavn.compareTo(o.getFornavn());
            //Tjekker om alder er det samme
            if (customer == 0) {
                customer = Integer.compare(alder, o.getAlder());
                /** Samme som: */
                //customer = alder - o.alder
            }
        }
        return customer;
    }

    @Override
    public String toString() {
        return "Efternavn: " + efternavn + '\'' +
                "\nFornavn: " + fornavn + '\'' +
                "\nAlder: " + alder + "\n";
    }
}

