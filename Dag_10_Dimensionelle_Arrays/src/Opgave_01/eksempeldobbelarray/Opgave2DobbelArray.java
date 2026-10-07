package Opgave_01.eksempeldobbelarray;

public class Opgave2DobbelArray {

    public static void main(String[] args) {
        final int ROW = 8;
        final int COL = 8;
        int[][] values = new int[ROW][COL];
        DobbelArrayMethods da = new DobbelArrayMethods();

        //Udskriv values på tabel form
        da.udskrivArray(values);


        // TODO Opgave 2.1  lav ændringer i values så der står 5 på alle pladser
        System.out.println("\nOpgave 2.1: ");
        System.out.println("Nedenfor skulle der stå 5 på alle pladser");
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                values[row][col] = 5;
            }
        }
        da.udskrivArray(values);


        // TODO Opgave 2.2  lav ændringer i values så der står 2 i lige rækker og 3 i ulige
        System.out.println("\nOpgave 2.2: ");
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden række");
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (row % 2 == 0) {
                    values[row][col] = 2;
                } else values[row][col] = 3;
            }
        }
        da.udskrivArray(values);

        // TODO Opgave 2.3  lav ændringer i values så der står 2 i lige søjler og 3 i ulige

        System.out.println("\nOpgave 2.3: ");
        System.out.println("Nedenfor skulle der stå 2 og 3 på hver anden søjle");
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (col % 2 == 0) {
                    values[row][col] = 2;
                } else values[row][col] = 3;
            }
        }
        da.udskrivArray(values);


        // TODO Opgave 2.4 lav ændringer i values så den har skiftende 0'er og 1'er som på et skakbræt
        System.out.println("\nOpgave 2.4: ");
        System.out.println("Nedenfor skulle der stå 0 og 1 på alle pladser som på skakbræt");
        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                values[row][col] = (row + col) % 2;
            }
        }
        da.udskrivArray(values);

        // TODO Opgave 2.5 lav ændringer så alle elementer i nederste og øverste række samt første
        //  og sidste søjle er 5 og resten skal være 2.
        System.out.println("\nOpgave 2.5: ");
        System.out.println("Nedenfor skulle der stå 5 i kanten og 2 ellers");

        for (int row = 0; row < values.length; row++) {
            for (int col = 0; col < values[row].length; col++) {
                if (row == 0 || row == values.length - 1 || col == 0 || col == values[row].length - 1) {
                    values[row][col] = 5;
                } else values[row][col] = 2;
            }
        }
        da.udskrivArray(values);

    }
}
