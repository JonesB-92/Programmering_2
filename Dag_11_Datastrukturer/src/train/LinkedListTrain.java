package train;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedListTrain {
    WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain() {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     *
     * @return the first wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst() {
        if (this.firstWagon == null) {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     *
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon) {
        WagonNode oldFirstWagon = firstWagon;
        firstWagon = wagon; // Opdaterer param wagon til firstWagon
        firstWagon.setNextWagon(oldFirstWagon); // Added wagon kigger på første wagon
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @return the removed wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst() {
        if (firstWagon == null) {
            throw new NoSuchElementException();
        }
        WagonNode removedWagon = firstWagon; //Gemmer for at kunne returnere
        firstWagon = firstWagon.getNextWagon(); //Fjerner essentielt sidste wagon, ved at gøre den, vi kigger på, til næste wagon i listen.
        removedWagon.setNextWagon(null); //fjerner removeWagons forbindelser til andre nodes

        return removedWagon;
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     *
     * @return the number of wagon nodes
     */
    public int count() {
        int count = 0;

        WagonNode currentWagon = firstWagon;

        while (currentWagon != null) {
            count++;
            currentWagon = currentWagon.getNextWagon();
        }
        return count;
    }

    /**
     * Removes the specified wagon node in the linked list train.
     *
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     * <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon) {

        WagonNode currentWagoon = firstWagon;
        WagonNode nextWagoon = firstWagon.getNextWagon();

        boolean removed = false;
        while (currentWagoon != null && nextWagoon != null) {
            nextWagoon = currentWagoon.getNextWagon();

            if (firstWagon == wagon) {
                //Eller remove first?!
                WagonNode newFirstWagon = firstWagon.getNextWagon();
                firstWagon.setNextWagon(null);
                firstWagon = newFirstWagon; //Opdaterer det nye førerhoved
                return true;

            } else if (nextWagoon == wagon) {
                currentWagoon.setNextWagon(nextWagoon.getNextWagon()); //Får vognen til at pege på to pladser frem
                wagon.setNextWagon(null); // Fjerner forbindelsen
                return true;

            } else {
                currentWagoon = nextWagoon;
            }
        }
        return removed;
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     *
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position) {
        int trainLength = count();

        //Undgå 'outOfBounds'
        if (position > trainLength || position < 0) {
            throw new IndexOutOfBoundsException("Attempted insertion is out of bounds.");
        }

        //Hvis indsættes forrest eller på et tomt tog
        if (position == 0) {
            addFirst(wagon);
        }

        WagonNode currentWagon = firstWagon;
        boolean inserted = false;
        int i = 1;
        while (currentWagon.getNextWagon() != null && !inserted) { //Løbe hele toget igennem fra first, til vi er ved den rigtige position
            if (i == position) {
                WagonNode insertedWagonsNext = currentWagon.getNextWagon();
                currentWagon.setNextWagon(wagon);
                wagon.setNextWagon(insertedWagonsNext);
                inserted = true;
            } else {
                i++;
                currentWagon = currentWagon.getNextWagon();
            }
        }
    }
}