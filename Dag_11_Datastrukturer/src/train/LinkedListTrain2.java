package train;

import java.util.NoSuchElementException;

public class LinkedListTrain2 extends LinkedListTrain {
    private WagonNode lastWagon;

    /**
     * Constructs an empty double linked list train.
     */
    public LinkedListTrain2() {
        super();
        this.lastWagon = null;
    }

    public void setLastWagon(WagonNode lastWagon) {
        this.lastWagon = lastWagon;
    }

    /**
     * Returns the last wagon node in the double linked list train.
     *
     * @return the last wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getLast() {
        if (this.lastWagon == null) {
            throw new NoSuchElementException();
        }
        return this.lastWagon;
    }

    /**
     * Adds a wagon node to the end of the double linked list train.
     *
     * @param wagon the wagon node to add
     */
    public void addLast(WagonNode wagon) {
        int trainLength = count();

        if (trainLength < 1) {
            addFirst(wagon);
            lastWagon = wagon;
        } else {
            WagonNode oldLastWagon = lastWagon;
            oldLastWagon.setNextWagon(wagon);
            wagon.setPreviousWagon(oldLastWagon);
            lastWagon = wagon;
        }
    }

//    @Override
//    public void addFirst(WagonNode wagon) {
//        wagon.setNextWagon(firstWagon);
//        firstWagon.setPreviousWagon(wagon);
//        firstWagon = wagon;
//    }

}
