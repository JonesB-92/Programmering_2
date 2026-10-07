package rekursion;

public class MazeTester {

	public static void main(String[] args) {
		Maze labyrint = new Maze();
		System.out.println(labyrint);
		MazeSolver solver = new MazeSolver(labyrint);
		if (solver.traverse(0, 0)) {
			System.out.println("Der var en vej gennem labyrinten");
		} else {
			System.out.println("Der var IKKE en vej gennem labyrinten");
		}

		System.out.println(labyrint);

	}
}
