package snacks;

import java.util.Random;

public class Smartie extends Snack {

    public enum Colors {
        Red, Orange, Blue, Green, Yellow, Pink, Violet, Brown
    }

    private Colors color;
    public Smartie() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        this.color = colors[random.nextInt(colors.length)];
    }

    public Smartie(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    // Smarties sorteres efter farve
//    @Override
//    public int compareTo(Snack o) {
//        return Integer.compare(this.getColor().ordinal(), ((Smartie) o).getColor().ordinal());
//    }
}
