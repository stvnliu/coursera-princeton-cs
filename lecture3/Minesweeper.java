public class Minesweeper {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int[][] board = new int[m][n];
		int mines = 0;
		while (mines < k) {
			int randm = (int) (Math.random() * (m));
			int randn = (int) (Math.random() * (n));
			if (board[randm][randn] != 9) {
				board[randm][randn] = 9;
				mines++;
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] > 8) {
					// if a mine is detected
					if (i+1 < m) { board[i+1][j]++; }
					if (i-1 >= 0) { board[i-1][j]++; }
					if (j+1 < n) { board[i][j+1]++; }
					if (j-1 >= 0) { board[i][j-1]++; }
					if (i+1 < m && j+1 < n) { board[i+1][j+1]++; }
					if (i-1 >= 0 && j-1 >= 0) { board[i-1][j-1]++; }
					if (i+1 < m && j-1 >= 0) { board[i+1][j-1]++; }
					if (i-1 >= 0 && j+1 < n) { board[i-1][j+1]++; }
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] > 8) {
					System.out.print("*  ");
				} else {
					System.out.print(board[i][j] + "  ");
				}
			}
			System.out.println();
		}
	}
}
