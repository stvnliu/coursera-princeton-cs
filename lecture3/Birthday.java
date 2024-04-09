public class Birthday {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int p = 1;
		while (true) {
			// run for one person number
			double frac = 0.0;
			int exact = 0;
			int less = 0;
			for (int j = 0; j < trials; j++) {
				boolean[] found = new boolean[n];
				// Run one trial
				int i = 1;
				while (true) {
					int r = (int) (Math.random() * (n-1));
					// System.out.println(r);
					if (found[r]) {
						// System.out.println("FOUND AT " + i);
						break;
					}
					else {
						found[r] = true;
						i++;
					}
				}
				if ( i == p ) {
					exact++;
				}
				if ( i <= p ) {
					less++;
				}
			}
			frac = (double) less / trials;
			System.out.println(p + "\t" + exact + "\t" + frac);
			if ( frac > 0.5 ) {break;}
			p++;
		}
	}
}
