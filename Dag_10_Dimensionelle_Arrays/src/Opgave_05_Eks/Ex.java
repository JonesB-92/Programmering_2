package Opgave_05_Eks;

public class Ex {

    //Skulle lave en metode der tog en liste og en parameter (for row) som skulle returnere en collumn skrevet baglæns.
    //Derefter skulle jeg lave en metode der skulle returnere en boolean med true hvis hver collumn indholdte to af det samme bogstav i træk

    public static void main(String[] args) {

        // Kan oprettes med opremsning
        String[][] array1 = {{"H", "A", "S", "T"}, {"A", "L", "A", "V"}, {"I", "S", "T", "A"}, {"B", "A", "B", "Y"}};

        System.out.println("array1");
        udskrivArray(array1);
        System.out.println("Rowreader: row 2");

        rowReader(array1,2 );
        System.out.println(hasConsecutives(array1));
    }

    public static void udskrivArray(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + "  ");
            }
            System.out.println();
        }
    }

    public static void rowReader(String[][] array, int row) {
        for (int col = array[row].length - 1; col >= 0; col--) {
            System.out.print(array[row][col] + "  ");
        }
        System.out.println();
    }

    public static boolean hasConsecutives(String[][] array) {
        String consecutive = "";
        boolean consecutives = false;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (consecutive == array[row][col]) {
                    consecutives = true;
                } else {
                    consecutive = array[row][col];
                }
            }
        }
        return consecutives;
    }
}

