package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class SammensatFigur extends Figur {
    private List<Figur> figurer;
    private String name;

    public SammensatFigur(String name) {
        super(name);
        this.figurer = new ArrayList<>();
    }

    @Override
    public double getAreal() {
        double sum = 0;

        for (Figur f : figurer) {
            sum += f.getAreal();
        }

        return sum;
    }

    @Override
    public void tegn() {
        System.out.println("Tegner sammensat figur: " + getName());
        for (Figur f : figurer) {
            f.tegn();
        }
    }

    public void addFigur(Figur figur) {
        figurer.add(figur);
    }

}
