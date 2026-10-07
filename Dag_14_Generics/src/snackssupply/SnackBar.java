package snackssupply;

import java.util.*;

public class SnackBar<E> {
    // TODO: Implement sortSnacks(E[] snackContainer)
    public ArrayList<E> sortSnacks(E[] snackContainer) {
        List<E> snackList = new ArrayList<>(Arrays.asList(snackContainer));

        Collections.sort(snackList, new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                return 0;
            }
        });

        return null;
    }


}
