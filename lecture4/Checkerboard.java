import java.awt.Color;
public class Checkerboard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		Color current = StdDraw.LIGHT_GRAY;
		StdDraw.setScale(0, n);
		for (int y = 0; y < n; y++) {
			if ( y % 2 == 0 ) { current = StdDraw.BLUE; } else { current = StdDraw.LIGHT_GRAY; }
			for (int x = 0; x < n; x++) {
				StdDraw.setPenColor(current);
				StdDraw.filledSquare((double)x+0.5, (double)y+0.5, 0.5);
				current = current == StdDraw.LIGHT_GRAY ? StdDraw.BLUE : StdDraw.LIGHT_GRAY;
			}
		}
	}
}
