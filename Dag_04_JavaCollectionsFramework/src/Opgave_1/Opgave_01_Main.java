package Opgave_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Opgave_01_Main {
    //Lav en klasse AnvendMetoderPaaHashSet – klassen skal have en main() metode.
    public static void main(String[] args) {
        //1) Tilføj til main erklæring og oprettelse af en mængde baseret på et HashSet. Mængden skal indeholde heltal.
        //2) Indsæt tallene 34,12,23,45,67,34,98 i mængden.
        Set<Integer> mængdeAfInts = new HashSet<>(Arrays.asList(34, 12, 23, 45, 67, 34, 98));

        //3) Udskriv indholdet af mængden.
        System.out.println(mængdeAfInts);
        //4) Indsæt tallet 23 i mængden.
        //5) Udskriv indholdet af mængden.
        mængdeAfInts.add(23);
        System.out.println(mængdeAfInts);
        //6) Fjern elementet 67 fra mængden.
        //7) Udskriv indholdet af mængden.
        System.out.println("Remove: " + mængdeAfInts.remove(67));
        System.out.println(mængdeAfInts);

        //8) Undersøg om mængden indeholder elementet 23
        System.out.println(mængdeAfInts.contains(23));
        //9) Udskriv hvor mange elementer der er i mængden
        System.out.println(mængdeAfInts.size());

    }
}
