package Opgave2;

public class Main {
    public static void main(String[] args) {
        Figur trekant = new Trekant(3, 4);
        Figur rektangel = new Rektangel(5, 8);
        Figur ellipse = new Ellipse(2, 3);

        SammensatFigur hus = new SammensatFigur("Hus");
        hus.addFigur(rektangel);
        hus.addFigur(trekant);

        SammensatFigur tegning = new SammensatFigur("Tegning");
        tegning.addFigur(hus);
        tegning.addFigur(ellipse);

        tegning.tegn();

        System.out.println("\nSamlet areal af tegningen: " + tegning.getAreal());
    }
}
