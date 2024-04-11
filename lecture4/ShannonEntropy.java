public class ShannonEntropy {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int[] count = new int[m + 1];
		int t = 0;
		double shannon = 0.0;
		// StdOut.println(shannon);
		while (!StdIn.isEmpty()) {
			int n = StdIn.readInt();
			// StdOut.println(n);
			count[n]++;
			t++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) { continue; }
			double p_i = (double) count[i] / t;
			shannon -= p_i * (Math.log(p_i) / Math.log(2));
		}
		System.out.printf("%.4f\n", shannon);
	}
}
