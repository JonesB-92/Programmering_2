package rekursion;

public class MazeSolver {
	private Maze maze;

	public MazeSolver(Maze maze) {
		this.maze = maze;

	}

	public boolean traverse(int row, int column) {
		boolean done = false;
		if (maze.validPosistion(row, column)) {

			maze.tryPosition(row, column);
			if (row == maze.getRows() - 1 && column == maze.getCols() - 1) {
				done = true;
			} else {
				done = traverse(row + 1, column); // down
				if (!done) {
					done = traverse(row, column + 1); // right
				}
				if (!done) {
					done = traverse(row - 1, column); // up
				}
				if (!done) {
					done = traverse(row, column - 1); // left
				}
			}
			if (done) {
				maze.markParth(row, column);
			}
		}
		return done;
	}
}
