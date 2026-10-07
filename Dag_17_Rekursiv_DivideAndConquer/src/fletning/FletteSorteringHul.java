package fletning;

import java.util.ArrayList;

public class FletteSorteringHul {

    // den metode der saetter fletningen i gang
    public void fletteSort(ArrayList<Integer> list) {
        mergesort(list, 0, list.size() - 1);
    }

    // den rekursive metode der implementere del-loes og kombiner skabelonen -- PRIVATE
    private void mergesort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    // Kombinering er realiseret ved fletteskabelonen
    // Termineringsregel når en listehalvdel er tom?
    private void merge(ArrayList<Integer> nums, int low, int middle, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int lowerStart = low;
        int upperStart = middle + 1;

        while (lowerStart <= middle && upperStart <= high) {
//            System.out.println("Left half: " + nums.subList(low, middle + 1));
//            System.out.println("Right half: " + nums.subList(middle + 1, high + 1));

            int left = nums.get(lowerStart); // første bogstav i venstre halvdel
            int right = nums.get(upperStart); // første bogstav i højre halvdel
            System.out.println("lowerstart: " + lowerStart + " upperstart: " + upperStart + ": comparing     " + left + "     with    " + right);

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
