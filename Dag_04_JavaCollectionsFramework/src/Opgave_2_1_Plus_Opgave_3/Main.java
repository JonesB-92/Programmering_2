package Opgave_2_1_Plus_Opgave_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Skole EAA = new Skole("EAA", new ArrayList<>(List.of(
                new Studerende(201269, "Oliver Ølver", new ArrayList<>(List.of(12, 02, 7, 10, 10))),
                new Studerende(200675, "Ionas B", new ArrayList<>(List.of(12, 12, 12, 12, 12, 12))),
                new Studerende(200676, "Ole Firesyn", new ArrayList<>(List.of(02, 02, 02, 02, 02, 02, 02, 02, 02))),
                new Studerende(2006420, "Måt Måt", new ArrayList<>(List.of(7, 10, -3, -3, 4, 12))))));

        System.out.println(EAA);
        System.out.println();
        EAA.getStuderendeList().forEach(studerende -> System.out.println(studerende));
        Collections.sort(EAA.getStuderendeList());
        System.out.println("Opgave 3: ");
        EAA.getStuderendeList().forEach(studerende -> System.out.println(studerende));


        System.out.println("\nEAA gennemsnit: " + EAA.beregnGennemsnit());
        System.out.println("\nStudNr 200675 (Ionas): - " + EAA.findStuderende( 200675));
        System.out.println("\nStudNr 200676 (Ole Firesyn): - " + EAA.findStuderende(200676));
        System.out.println("\nFind invalidt stud. Nr: " + EAA.findStuderende(200124124));


    }
}
