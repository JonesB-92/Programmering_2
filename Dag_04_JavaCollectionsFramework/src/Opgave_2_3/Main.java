package Opgave_2_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Skole EAA = new Skole("EAA", new HashMap<>(Map.of(
                201269, new Studerende(201269,"Oliver Ølver", new ArrayList<>(List.of(12, 02, 7, 10, 10))),
                200675, new Studerende(200675, "Ionas Belmaizi", new ArrayList<>(List.of(12, 12, 12, 12, 12, 12))),
                200676, new Studerende(200676, "Ole Firesyn", new ArrayList<>(List.of(02, 02, 02, 02, 02, 02, 02, 02, 02))),
                2006420, new Studerende(2006420, "Måt Måt", new ArrayList<>(List.of(7, 10, -3, -3, 4, 12))))));

        //ELLER
        // Skole EAA = new Skole("EAA", new HashMap<>(Map.ofEntries(
        //        Map.entry(201269, new Studerende(201269, "Oliver Ølver", new ArrayList<>(List.of(12, 2, 7, 10, 10)))),
        //        Map.entry(200675, new Studerende(200675, "Ionas Belmaizi", new ArrayList<>(List.of(12, 12, 12, 12, 12, 12)))),
        //        Map.entry(200676, new Studerende(200676, "Ole Firesyn", new ArrayList<>(List.of(2, 2, 2, 2, 2, 2, 2, 2, 2)))),
        //        Map.entry(2006420, new Studerende(2006420, "Måt Måt", new ArrayList<>(List.of(7, 10, -3, -3, 4, 12))))
        //)));

        System.out.println(EAA);
        System.out.println();
        EAA.getStuderendeMap().values().forEach(studerende -> System.out.println(studerende));
        //EAA.getStuderendelist().forEach(System.out::println);

        System.out.println("\nEAA gennemsnit: " + EAA.beregnGennemsnitMap());
        System.out.println("\nStudNr 200675 (Ionas): - " + EAA.findStuderende( 200675));
        System.out.println("\nStudNr 200676 (Ole Firesyn): - " + EAA.findStuderende(200676));
        System.out.println("\nFind invalid stud. nr: " + EAA.findStuderende(200124124));

    }
}
