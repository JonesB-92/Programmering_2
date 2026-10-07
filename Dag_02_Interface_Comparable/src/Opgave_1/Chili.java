package Opgave_1;

public class Chili implements Measurable {
    String navn;
    double scoville;

    public Chili(String navn, double scoville) {
        this.navn = navn;
        this.scoville = scoville;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getScoville() {
        return scoville;
    }

    public void setScoville(double scoville) {
        this.scoville = scoville;
    }

    public double getMeasure() {
        return getScoville();
    }

    @Override
    public String toString() {
        return navn;
    }
}
