public class WorldMap {
	public static void main(String[] args) {
		int xb = StdIn.readInt();
		int yb = StdIn.readInt();
		StdDraw.setCanvasSize(1200, 900);
		StdDraw.setXscale(0, xb);
		StdDraw.setYscale(0, yb);
		StdDraw.setPenColor(StdDraw.BLACK);
		while (!StdIn.isEmpty()) {
			String name = StdIn.readString();
			// StdOut.println("DEBUG Drawing " + name + "...");
			int n = StdIn.readInt();
			double[] x = new double[n];
			double[] y = new double[n];
			for ( int i = 0; i < n; i++ ) {
				x[i] = StdIn.readDouble();
				y[i] = StdIn.readDouble();
				//StdOut.println(x[0] + ", " + y[0]);
			}
			StdDraw.polygon(x, y);
		}
	}
}
