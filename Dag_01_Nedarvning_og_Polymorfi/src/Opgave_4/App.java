package Opgave_4;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Create a list to hold all figures
        ArrayList<Figur> figurListe = new ArrayList<>();

        // Add test figures
        figurListe.add(new Kvadrat(0, 0, 4));           // area = 16
        figurListe.add(new Rektangel(2, 3, 5, 2));      // area = 10
        figurListe.add(new Cirkel(10, -2, 3));          // area ≈ 28.27
        figurListe.add(new Ellipse(-5, 5, 4, 2));       // area ≈ 25.13

        // Print original state
        System.out.println("=== OPRINDELIG TILSTAND ===");
        figurListe.get(0).printTilstand(figurListe); // you only need to call it once

        // Move all figures by (2, -1)
        for (Figur figur : figurListe) {
            figur.parallelforskyd(2, -1);
        }

        // Print new state after translation
        System.out.println("\n=== EFTER PARALLELFORSKYDNING (2, -1) ===");

        for (Figur figur : figurListe) {
            System.out.println(figur.printPosition());
        }
    }
}


