public class DiscreteDistribution {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int[] s = new int[args.length];
		s[0] = 0;
		for (int i = 1; i < args.length; i++) {
			// s[1] = s[0] + int(args[1])
			// etc...
			s[i] = s[i-1] + Integer.parseInt(args[i]);
		}
		// for (int x = 0; x < s.length; x++) {System.out.println(s[x] + " ");}
		for (int j = 0; j < m; j++) {
			int i = 0;
			int r = (int) (Math.random() * (s[s.length-1] - 1));
			for (int k = 1; k < s.length; k++) {
				if (r >= s[k-1] && r < s[k]) {
					i = k;
					// System.out.println(r + " match at interval " + i);
					break;
				}
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
