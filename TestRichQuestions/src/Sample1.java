import java.io.PrintWriter;
import java.util.*;

public class Sample1
{
	static List<String> convertBoardToString(int[] board) {

		List<String> boardString = new ArrayList<>();

		for (int i= 0; i < 4; i++) {
			StringBuilder sb = new StringBuilder();
			for (int value: board) {
				if (value == i) {
					sb.append("q");
				} else {
					sb.append("-");
				}
			}
			// add to list set
			boardString.add(sb.toString());
		}
		return boardString;
	}

	static boolean safeToPlaceQueen(int[] board, int current) {
		for (int i= 0; i < current; i++) {
			// check same row...
			if (board[i] == board[current])
				return false;
			// check diagonal...
			if ((current -i) == Math.abs(board[current] - board[i])) {
				return false;
			}
		}
		return true;
	}



	static void helper(List<List<String>> res, int[] board, int current, int n) {
		// base case
		if (current == n) {
			// pass back List of board combinations
			// add position to each result set...
			List<String> boardString = convertBoardToString(board);
			res.add(boardString);
			return;
		}

		// recursive case
		for (int i = 0; i < n; i++) {
			board[current] = i;  // current = 2nd,
			// check if condition valid....then recursively call helper
			if (safeToPlaceQueen(board, current)) {
				helper(res, board, current+1, n);
			}
		}
	}


	static String[][] find_all_arrangements(int n) {

		List<List<String>> res = new ArrayList<>(); //-> [board1, board2]
		// board is chessboard is 1-dimension - index = row postion, value = column.
		// [2][0][3][1]
		// [1][3][0][2]

		// 0,0 -> 1 (true) ->
		int [] board = new int[n];
		helper(res, board, 0, n);
		String[][] array = new String[res.size()][];
		for (int i = 0; i < res.size(); i++) {
			List<String> row = res.get(i);
			array[i] = row.toArray(new String[row.size()]);
		}
		return array;
	}
//
//
//	public static void main(String [] args)
//	{
//        find_all_arrangements(1);
//		System.out.println("finished");
//	}
}