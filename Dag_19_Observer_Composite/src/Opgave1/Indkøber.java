package Opgave1;

public class Indkøber implements Observer {
    private String navn;

    public Indkøber(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }


    //Metoden update(Opgave1.Subject s): void på Indkoeber har følgende specifikation:
    //Hvis der er mindre end 6 bøger tilbage af bogtitelen s, udskrives på skærmen, at der
    //skal bestilles 10 bøger med den pågældende titel. Endvidere registreres med det
    //samme at der er købt 10 bøger til lageret.
    @Override
    public void update(Subject subject) {
        if (subject instanceof Bogtitel) {
            Bogtitel bogtitel = (Bogtitel) subject;
            if (bogtitel.getAntal() < 6) {
                System.out.println("Der skal bestilles 10 enheder af " + bogtitel.getTitel() + ". \n" +
                        "Kun " + bogtitel.getAntal() + " tilbage på lager.");
                bogtitel.indkoebTilLager(10);
            }
        }
    }
}
