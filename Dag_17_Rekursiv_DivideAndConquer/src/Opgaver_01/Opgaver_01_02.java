package Opgaver_01;

import java.util.ArrayList;

public class Opgaver_01_02 {
    //Opgave 1
    //Skriv en rekursiv metode, der kan summere alle elementerne i en List<Integer>. Det kan antages
    //at listen udelukkende består af Integer objekter. Anvend del, løs og kombiner skabelonen.
    public int summering(ArrayList<Integer> nums) {
        return sum(nums, 0, nums.size() - 1);
    }

    private int sum(ArrayList<Integer> nums, int l, int r) {
        int result;

        // Termineringsregel
        if (nums.isEmpty()) {
            result = 0;
        } else if (l == r) {
            result = nums.get(l);
        } else {
            int m = (l + r) / 2; // Halvdelen
            int h1 = sum(nums, l, m); // Rekursivt kald på venstre halvdel af liste
            int h2 = sum(nums, m + 1, r); // Rekursivt kald på højre halvdel af liste
            result = h1 + h2;
        }
        return result;
    }

    //Opgave 2
    //Skriv en rekursiv metode, der tæller antallet af elementer med værdien 0 i en List<Integer>
    //objekter. Anvend del, løs og kombiner skabelonen.
    public int amountOfZeros(ArrayList<Integer> nums) {
        return amountOfZerosHelper(nums, 0, nums.size() - 1);
    }

    private int amountOfZerosHelper(ArrayList<Integer> nums, int l, int r) {
        int antal;

        if (nums.isEmpty()) {
            antal = 0;
        } else if (l == r) {
            antal = (nums.get(l) == 0) ? 1 : 0;
        } else {
            int m = (l + r) / 2;
            int firstHalf = amountOfZerosHelper(nums, l, m);
            int SecndHalf = amountOfZerosHelper(nums, m + 1, r);
            antal = firstHalf + SecndHalf;
        }
        return antal;
    }

    //Opgave 3
    //I klassen FletteSorteringHul kan det meste af koden til flettesortering findes. Dog mangler
    //implementationen af metoden merge. Programmer denne som en konkretisering af
    //fletteskabelonen. Afprøv dernæst flettesortering på eksemplet [8, 56, 45, 34, 15, 12, 34, 44].

    // Den metode der sætter fletningen i gang
    public void fletteSort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    // Rekursive metode, der implementerer div conquer skabelonen,
    // dvs. splitter listen op i to, indtil en liste kun indeholder ét element
    private void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m); // venstre side sorteres
            mergesort(list, m + 1, h); // højre side sorteres
            merge(list, l, m, h); // fletter begge halvdele sammen
        }
    }

    // TODO
    // Kombinering er realiseret ved fletteskabelonen
    private void merge(ArrayList<Integer> nums, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int lowerStart = low;
        int upperStart = middle + 1;

        while (lowerStart <= middle && upperStart <= high) {
            System.out.println("Left half: " + nums.subList(low, middle + 1));
            System.out.println("Right half: " + nums.subList(middle + 1, high + 1));

            int left = nums.get(lowerStart); // første bogstav i venstre halvdel
            int right = nums.get(upperStart); // første bogstav i højre halvdel
            System.out.println("i: " + lowerStart + " j: " + upperStart + ": comparing     " + left + "     with    " + right);

            if (left <= right) {
                temp.add(left);
                lowerStart++;
            } else {
                temp.add(right);
                upperStart++;
            }
            System.out.println(temp);
        }

        // "Termineringsregel" når en listehalvdel er tom
        // resten af venstre
        while (lowerStart <= middle) {
            temp.add(nums.get(lowerStart));
            lowerStart++;
        }

        // resten af højre
        while (upperStart <= high) {
            temp.add(nums.get(upperStart));
            upperStart++;
        }

        System.out.println(temp);

        // Kopierer sorteret liste over i originale liste (abstrakt type)
        for (int k = 0; k < temp.size(); k++) {
            nums.set(low + k, temp.get(k));
        }

    }
}
