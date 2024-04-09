public class Minesweeper {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		char[][] grid = new char[m][n];
		for (int y = 0; y < m; y++) {
			for (int x = 0; x < n; x++) {
				grid[y][x] = '0';
			}
		}
		for (int y = 0; y < m; y++) {
			for (int x = 0; x < n; x++) {
				System.print(grid[y][x]);
			}
			System.println();
		}
		// place mines
		for (int i = 0; i < k; i++) {
			int randm = (int) Math.random() * (m);
			int randn = (int) Math.random() * (n);
			for (int y = 0; y < m; y++) {
				for (int x = 0; x < n; x++) {
					if (y == randm && x == randn) {
						grid[y][x] = '*';
						if (x+1 < n) {
							grid[y][x+1] = (char) ((int)grid[y][x+1] - '0' + 1+ '0');
						}
						if (x-1 >= 0) {
							grid[y][x-1] = (char) ((int)grid[y][x-1]) + 1);
						}
						if (x-1 >= 0 && y+1 < m) {
							grid[y+1][x-1] = (char) (((int)grid[y+1][x-1] - '0' + 1) + '0');
						}
						if (x+1 < n && y+1 < m) {
							grid[y+1][x+1] = (char) (((int) grid[y+1][x+1]) - '0' + 1) + '0');
						}
						if (y+1 < m) {
							grid[y+1][x] = (char) (((int) grid[y+1][x] - '0' + 1) + '0');
						}
						if (y-1 >= 0) {
							grid[y-1][x] = (char) (((int)grid[y-1][x] - '0' + 1) + '0');
						}
						if (y-1 >= 0 && x+1 < n) {
							grid[y-1][x+1] = (char) (((int)grid[y-1][x+1]) -'0'+ 1) + '0');
						}
						if (y-1 >= 0 && x-1 >= 0) {
							grid[y-1][x-1] = (char) ( ((int)grid[y-1][x-1] -'0'+ 1) + '0');
						}
					}
				}
			}
		}


	}
}
