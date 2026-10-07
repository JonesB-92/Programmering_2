package Opgave_03.opgave3Teater;

import java.util.Scanner;

public class TheaterFloorApp {

	public static void main(String[] args) {
		TheaterFloor theater = new TheaterFloor();

		Scanner input = new Scanner(System.in);

		boolean running = true;

		while(running) {
			System.out.println();

			theater.printTheaterFloor();

		}
	}
}
