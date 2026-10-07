package Opgave_01.eksempeldobbelarray;

/**
 * @author mad
 */
public class AfproevDobbelArray {

    public static void main(String[] args) {

        // Kan oprettes med opremsning
        int[][] array1 = {
                {1, 2, 3, 4}, //row 0
                {5, 6, 7, 8}, //row 1
                {9, 10, 11, 12} //row 2
        };//col  0   1   2   3

        // Ved opremsning behøver de ikke være lige lange
        int[][] array2 = {
                {1, 2},
                {0, 3},
                {4, 5, 6}
        };

        DobbelArray da = new DobbelArray();

        System.out.println("array1:");
        da.udskrivArray(array1);
        System.out.println();
        System.out.println("array2:");
        da.udskrivArray(array2);
        System.out.println();

        // Opretter array der indeholder 3 rækker og 4 kolonner med heltal på alle pladser
        int[][] array3 = new int[3][4];
        array3[0][0] = 5;
        array3[0][1] = 7;
        array3[1][3] = 6;
        array3[2][1] = 4;
        System.out.println("array3:");
        da.udskrivArray(array3);
        System.out.println();
        array3[2][1] = 8;
        da.udskrivArray(array3);
        System.out.println("På række 1 (indeks 0) kolonne 2 (indeks 1) står der: " + array3[0][1]);
        System.out.println();

        // Opretter array der kan indeholde 5 rækker og 8 kolonner med heltal på alle pladser
        int[][] array4;
        array4 = new int[5][8];
        System.out.println("array4 lige efter erklæring: ");
        da.udskrivArray(array4);
        System.out.println();

        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][j] = 9;
            }
        }
        System.out.println();
        da.udskrivArray(array4);
        System.out.println();


        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                array4[i][i] = 1;
            }
        }
        System.out.println();
        da.udskrivArray(array4);

        // Beregn summen af alle tal i række 2 (indeks = 1)
        int sum = 0;
        for (int j = 0; j < array4[1].length; j++) {
            sum = sum + array4[1][j];
        }
        System.out.println("Sum af række med indeks = 1: " + sum);
        System.out.println();

        // Beregn summen af alle tal i den sidste kolonne
        sum = 0;
        for (int i = 0; i < array4.length; i++) {  //array4.length er 5 (antal rækker)
            sum = sum + array4[i][array4[i].length - 1]; //array4[i].length er 8 (antal kolonner)
        }
        System.out.println("Sum af den sidste kolonne: " + sum);

    }
}
