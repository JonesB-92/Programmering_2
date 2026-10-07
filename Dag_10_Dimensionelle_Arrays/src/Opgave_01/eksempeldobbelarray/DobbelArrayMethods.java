package Opgave_01.eksempeldobbelarray;

/**
 * @author mad
 */
public class DobbelArrayMethods {

    public void udskrivArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + "  ");
            }
            System.out.println();
        }
    }

    // Opgave 1.1
    /**
     * Der returnerer værdien på plads (row,col) i numbers
     */
    public int getValueAt(int[][] numbers, int row, int col) {
        return numbers[row][col];
    }

    // Opgave 1.2
    /**
     * Opdaterer pladsen (row,col) i numbers til value
     */
    public void setValueAt(int[][] numbers, int row, int col, int value) {
        numbers[row][col] = value;
    }

    // Opgave 1.3
    /**
     * Returnerer summen af tallene i rækken row
     */
    public int sumRow(int[][] numbers, int row) {
        int sum = 0;
        for (int col = 0; col < numbers[row].length; col++) {
            sum += numbers[row][col];
        }
        return sum;

    }

    // Opgave 1.4

    /**
     * Returnerer summen af tallene i kolonnen col
     *
     * @param numbers [][]
     * @param col
     * @return sum of column
     */
    public int sumCol(int[][] numbers, int col) {
        //Row skal plusses og col forbliver
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            sum += numbers[row][col];
        }
        return sum;
    }

    /**
     * Returnerer summen af alle tallene i numbers
     */
    // Opgave 1.5
    public int sum(int[][] numbers) {
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            sum += sumRow(numbers, row);
        }
        return sum;
    }

}
