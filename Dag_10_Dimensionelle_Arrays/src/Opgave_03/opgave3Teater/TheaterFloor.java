package Opgave_03.opgave3Teater;

public class TheaterFloor {
    private int[][] seats = {
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
            {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}};


    public int[][] getSeats() {
        return seats;
    }

    public void setSeats(int[][] seats) {
        this.seats = seats;
    }

    /**
     * Hvis plads seat på række row er ledig, reserveres pladsen og prisen på pladsen
     * returneres. Der returneres 0 hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */
    public int buySeat(int row, int seat) {
        int price = 0;

        if (seats[row][seat] == 0) {
            return 0;
        } else {
            price = seats[row][seat];
            seats[row][seat] = 0;
        }

        return price;
    }


    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public int buySeat(int price) {
        int pris = 0;

        for (int row = 0; row < seats.length; row++) {
            for (int seat = 0; seat < seats[row].length; seat++) {
                if (seats[row][seat] == price) {
                    seats[row][seat] = 0;
                    return price;
                }
            }
        }
        return pris;
    }

    public void printTheaterFloor() {
        System.out.printf("%-8s", "Sæde :");
        for (int i = 1; i <= seats[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-------------------------------------------------");
		//9 rows
        for (int row = 0; row < seats.length; row++) {
            System.out.printf("Række %-2d:", (row + 1));
			//10 cols
            for (int col = 0; col < seats[row].length; col++) {
                System.out.printf("%4d", seats[row][col]);
            }
            System.out.println();
        }
    }
}
