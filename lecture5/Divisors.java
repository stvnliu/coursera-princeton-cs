public class Divisors {
	// Returns the greatest common divisor of a and b.
	public static int gcd(int a, int b) {
		int x = Math.abs(a);
		int y = Math.abs(b);
		while (y != 0) {
			int tmp = x % y;
			x = y;
			y = tmp;
		}
		return x;
	}

	// Returns the least common multiple of a and b.
	public static int lcm(int a, int b) {
		return (Math.abs(a) * Math.abs(b)) / gcd(a, b);
	}

	// Returns true if a and b are relatively prime; false otherwise.
	public static boolean areRelativelyPrime(int a, int b) {
		return gcd(a, b) == 1;
	}

	// Returns the number of integers between 1 and n that are
	// relatively prime with n.
	public static int totient(int n) {
		int c = 0;
		for (int i = 1; i < n; i++) {
			if (areRelativelyPrime(i, n)) {c++;}
		}
		return c;
	}

	// Takes two integer command-line arguments a and b and prints
	// each function, evaluated in the format (and order) given below.
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.printf("gcd(%d, %d) = %d%n", a, b, gcd(a, b));
		System.out.printf("lcm(%d, %d) = %d%n", a, b, lcm(a, b));
		System.out.printf("areRelativelyPrime(%d, %d) = %b%n", a, b, areRelativelyPrime(a, b));
		System.out.printf("totient(%d) = %d%n", a, totient(a));
		System.out.printf("totient(%d) = %d%n", b, totient(b));
	}
}
