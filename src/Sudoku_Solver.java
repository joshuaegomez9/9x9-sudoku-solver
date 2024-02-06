import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku_Solver {

	public static void main(String[] args) {
		int[][] board = new int[9][9];
		int row_counter= 0;
		try {
			File sudoku = new File("Sudoku.txt");
			Scanner readin = new Scanner(sudoku);

			while (readin.hasNextLine()) {
				String[] strArray = readin.nextLine().split(" ");
				try {
					for (int i = 0; i < strArray.length; i++) {
						board[row_counter][i] = Integer.parseInt(strArray[i]);
					}
					row_counter++;
				} catch (NumberFormatException e) {
					System.out.println("The input file contains a character that is not a number or space.");
					e.printStackTrace();
					return;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file \"Sudoku.txt\" is missing.");
			e.printStackTrace();
			return;
		}

		if (Solver_functions.solve_sudoku(board)) {
			System.out.println("Sudoku Solved!");
			Solver_functions.print_board(board);
		} else {
			System.out.println("The Sudoku is unsolvable.");
		}
	}
}


