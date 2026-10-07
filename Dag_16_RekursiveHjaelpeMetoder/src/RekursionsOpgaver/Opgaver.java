package RekursionsOpgaver;

import java.util.ArrayList;

public class Opgaver {
    //Opgave 1
    //Lav en rekursiv metode der kan finde antallet af lige tal i en liste.
    //Lav både en version der ikke anvender hjælpemetoder og en der gør. Du kan tilføje metoden i den
    //udleverede klasse HelperMethods, hvor du også kan finde eksempler på rekursive metoder med og
    //uden hjælpemetoder.
    public static int ligeTal(ArrayList<Integer> list) {
        int antalLige;

        if (list.isEmpty()) {
            antalLige = 0;
        } else {
//            int tal = list.removeFirst();
            int tal = list.get(0);
            list.remove(0);
            if (tal % 2 == 0) {
                antalLige = 1 + ligeTal(list);
            } else {
                antalLige = ligeTal(list);
            }
        }
        return antalLige;
    }

    //Opgave 1.1
    public static int ligeTal1(ArrayList<Integer> list) {
        return ligeTal1(list, 0);
    }

    public static int ligeTal1(ArrayList<Integer> list, int i) {
        int antalLige;

        if (i == list.size()) {
            antalLige = 0;
        } else {
            if (list.get(i) % 2 == 0) {
                antalLige = 1 + ligeTal1(list, i + 1);
            } else {
                antalLige = ligeTal1(list, i + 1);
            }
        }
        return antalLige;
    }

    //Opgave 2
    //Skriv en statisk rekursiv metode, der returnerer true, hvis teksten er et palindrom.
    //Anvend hjælpe metoder, så der ikke skal laves substrings.
    // Hvis første og sidste bogstav ikke er det samme = false
    public static boolean palindrom(String tekst) {
        return palindrom(tekst, 0);
    }

    // Tanker:
    // 1. Hjælpemetode, der reverser en substring, sådan at en tekst.length der et lige tal
    // kan splittes i to og sammenligne første del med anden del reversed?
    // 2. Bare tjekke at det er spejlvendt char(++) for char(--) -> sammenligne start char og slut
    //
    // termineringsregel:
    // first != last  ELLER
    // index > midten af ordet
    private static boolean palindrom(String tekst, int index) {
        boolean isPal;
        tekst = tekst.toLowerCase();
        int tekstlængde = tekst.length();

        if (tekstlængde == 1) {
            isPal = true;
        } else if (tekstlængde == 0) {
            isPal = false;
        } else {
            // Base case: hvis vi når midten af ordet eller over stopper vi
            if (index >= (tekstlængde / 2)) {
                isPal = true;
            } else {
                // Sammenligne første og sidste
                char firstCh = tekst.charAt(index);
                char lastCh = tekst.charAt(tekst.length() - 1 - index);

                System.out.println(index + ": comparing " + firstCh + " with " + lastCh);

                // Hvis vi når over midten af ordet
                if (firstCh == lastCh) {
                    isPal = palindrom(tekst, index + 1);
                } else {
                    isPal = false;
                }
            }
        }
        return isPal;
    }

    // CHATTENS
    private static boolean palindrome(String tekst, int index) {
        // Normalize input for case-insensitive comparison
        tekst = tekst.toLowerCase();
        int length = tekst.length();

        // Base case: if we've passed the middle, it's a palindrome
        if (index >= length / 2) {
            return true;
        }

        // Compare mirror characters
        char first = tekst.charAt(index);
        char last = tekst.charAt(length - 1 - index);

        // If mismatch found, not a palindrome
        if (first != last) {
            return false;
        }

        // Otherwise, continue inward
        return palindrom(tekst, index + 1);
    }

    //Opgave 3
    //Lav en metode der kan afgøre om et tal findes i et array af heltal (en søgning). Det kan antages, at
    //tallene i arrayet er sorteret i stigende orden, og at implementationen skal være baseret på binær
    //søgning. Implementationen skal anvende rekursion, idet den rekursive metode er en hjælpemetode,
    //så der ikke skal laves kopier af dele af arrayet i de rekursive kald.
    public static boolean contains(int[] nums, int target) {
        return contains(nums, target, 0, nums.length - 1);
    }

    private static boolean contains(int[] nums, int target, int left, int right) {
        boolean found = false;

        int middle = (left + right) / 2;
        int k = nums[middle];
        if (k == target) {
            found = true;
        } else {
            if (left <= right) {
                if (target < k ) {
                    right = middle - 1;
                    found = contains(nums, target, left, right);
                } else {
                    left = middle + 1;
                    found = contains(nums, target, left, right);
                }
            }
        }
        return found;
    }

    //Opgave 4
    //Beregn antal flytninger der skal laves for at løse Towers of Hanoi for de følgende antal
    //ringe: 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20 og 25. (Lav først beregningen i hånden, udvid
    //dernæst programmet, så det tæller antal flytninger.) Hvor mange flytninger laves hvis
    //problemet er af størrelse n ?
    //Tegn rekursionstræet for at flytte 4 ringe.
    public static int flyt(int n, int fra, int til) {
        int antalFlyt = 0;

        if (n == 1) {
//            antalFlyt++;
            System.out.println("Flyt fraaa " + fra + " til " + til);
//            System.out.println("Antal flytninger: " + antalFlyt);
        } else {
            antalFlyt++;
            int temp = 6 - fra - til;
            flyt(n - 1, fra, temp);
            System.out.println("Flyt fra " + fra + " tillll " + til);
//            System.out.println("Antal flytninger: " + antalFlyt);
            flyt(n - 1, temp, til);
        }
        return antalFlyt;
    }

    // Oracle's version
    public static int flytOracle(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            result = 1 + flytOracle(n - 1) + flytOracle(n - 1);
        }
        return result;
    }

    public static int flyt1(int n, int fra, int til) {
        return flyt(n, fra, til, 0);
    }

    public static int flyt(int n, int fra, int til, int antalFlyt) {
        if (n == 1) {
//            antalFlyt++;
            System.out.println("Flyt fraaa " + fra + " til " + til);
//            System.out.println("Antal flytninger: " + antalFlyt);
        } else {
            antalFlyt++;
            int temp = 6 - fra - til;
            flyt(n - 1, fra, temp);
            System.out.println("Flyt fra " + fra + " tillll " + til);
//            System.out.println("Antal flytninger: " + antalFlyt);
            flyt(n - 1, temp, til);
        }
        return antalFlyt;
    }

    public static void main(String[] args) {
        flyt(6, 1, 3);
    }
}



