public class ActivationFunction {
	public static double heaviside(double x) {
		return x < 0 ? 0.0 : ( x > 0.0 ? 1.0 : 0.5);
	}
	public static double sigmoid(double x) {
		return 1 / ( 1 + Math.pow(Math.E, -x) );
	}
	public static double tanh(double x) {
		return (Math.pow(Math.E, x) - Math.pow(Math.E, -x)) / (Math.pow(Math.E, x) + Math.pow(Math.E, -x));
	}
	public static double softsign(double x) {
		return x / (1 + Math.abs(x));
	}
	public static double sqnl(double x) {
		return x <= -2 ? -1 : ( x < 0 ? x + (x * x) / 4 : ( x < 2 ? x - (x * x) / 4 : 1) );
	}
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		System.out.println("heaviside("+x+") = " + heaviside(x));
		System.out.println("  sigmoid("+x+") = " + sigmoid(x));
		System.out.println("     tanh("+x+") = " + tanh(x));
		System.out.println(" softsign("+x+") = " + softsign(x));
		System.out.println("     sqnl("+x+") = " + sqnl(x));
	}
}
