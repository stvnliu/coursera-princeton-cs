public class ThueMorse {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		char[][] p = new char[n][n];
		
		// Sequence generation
		int[] seq = new int[n];
		seq[0] = 0;
		int i = 0;
		int x = 1;
		while (i < n - 1) {
			for (int j = 0; j < x; j++) {
				//for (int k = 0; k < seq.length; k++) {System.out.print(seq[k]);}
				//System.out.print(" i="+i + " x="+x + "j="+j);
				//System.out.println();
				if (i >= n - 1) {break;}
				seq[x+j] = seq[j] == 0 ? 1 : 0;
				i++;
			}
			if (i>= n -1) {break;}
			x *= 2;
		}
		for (int j = 0; j < p.length; j++) {
			for (int k = 0; k < p[j].length; k++) {
				if (seq[j] == seq[k]) { System.out.print("+  "); }
				else { System.out.print("-  "); }
			}
			System.out.println();
		}
	}
}
