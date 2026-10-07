/*
 * Created on 2005-03-03
 */
package rekursion;

public class Maze {
	private final int TRIED = 2;
	private final int PATH = 3;
	// private int[][] grid = {{1,1,1,0,1,1,0,0,0,1,1,1,1},
	// {1,0,1,1,1,0,1,1,1,1,0,0,1},
	// {0,0,0,0,1,0,1,0,1,0,1,0,0},
	// {1,1,1,0,1,1,1,0,1,0,1,1,1},
	// {1,0,1,0,0,0,0,1,1,1,0,0,1},
	// {1,0,1,1,1,1,1,1,0,1,1,1,1},
	// {1,0,0,0,0,0,0,0,0,0,0,0,0},
	// {1,1,1,1,1,1,1,1,1,1,1,1,1}} ;

	private int[][] grid = { { 1, 1, 0, 0, 1 }, { 0, 1, 1, 1, 0 },
			{ 0, 1, 0, 1, 1 }, { 1, 1, 0, 0, 1 } };

	public void tryPosition(int row, int col) {
		grid[row][col] = TRIED;
	}

	public void markParth(int row, int col) {
		grid[row][col] = PATH;
	}

	public int getRows() {
		return grid.length;
	}

	public int getCols() {
		return grid[0].length;
	}

	public boolean validPosistion(int row, int column) {
		boolean result = false;
		if (row >= 0 && row < grid.length && column >= 0
				&& column < grid[row].length) {
			if (grid[row][column] == 1) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		String result = "\n";
		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				result += grid[row][column] + " ";
			}
			result += "\n";
		}
		return result;
	}
}
