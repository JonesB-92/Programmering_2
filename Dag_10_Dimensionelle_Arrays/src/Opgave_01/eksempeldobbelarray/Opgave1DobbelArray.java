package Opgave_01.eksempeldobbelarray;

public class Opgave1DobbelArray {

    public static void main(String[] args) {
        int[][] values = {
                {0, 4, 3, 9, 6},
                {1, 3, 5, 2, 2},
                {3, 3, 1, 0, 1},
                {0, 0, 9, 7, 1}
        };

        DobbelArrayMethods da = new DobbelArrayMethods();
        System.out.println("Værdien af tabellen udskrives");
        da.udskrivArray(values);

        //TODO Tilføj kode der afprøver metoderne du programmerer i klassen DobbelArray til opgave 1
        // Opgave 1.1
        System.out.print("\nOpgave 1: \n" + da.getValueAt(values, 0, 0));
        System.out.println("\nOpgave 1: \n" + da.getValueAt(values, 1, 0));

        // Opgave 1.2
        da.udskrivArray(values);
        da.setValueAt(values, 0, 0, 2);
        System.out.println("\nOpgave 2: 0,0 = 2\n" + da.getValueAt(values, 0, 0));

        //Opgave 1.3
        System.out.println("\nOpgave 3: sum af række 2, 3 og 4 ");
        da.udskrivArray(values);
        System.out.println(da.sumRow(values, 1) + " " + da.sumRow(values, 2) + " " + da.sumRow(values, 3));

        //Opgave 1.4
        System.out.println("\nOpgave 4: sum af col 1, 2 og 3 ");
        da.udskrivArray(values);
        System.out.println(da.sumCol(values, 0) + " " + da.sumCol(values, 1) + " " + da.sumCol(values, 2) + "\n");

        //Opgave 1.5
        System.out.println();
        da.udskrivArray(values);
        System.out.println("\nOpgave 5: sum af alle rækker: ");
        System.out.println(da.sum(values));

    }

}
