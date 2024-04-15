public class AudioCollage {

	// Returns a new array that rescales a[] by a multiplicative factor of alpha.
	public static double[] amplify(double[] a, double alpha) {
		double[] b = new double[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i] * alpha;
		}
		return b;
	}

	// Returns a new array that is the reverse of a[].
	public static double[] reverse(double[] a) {
		double[] b = new double[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length - 1 - i];
		}
		return b;
	}

	// Returns a new array that is the concatenation of a[] and b[].
	public static double[] merge(double[] a, double[] b) {
		double[] c = new double[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			c[a.length + j] = b[j];
		}
		return c;
	}

	// Returns a new array that is the sum of a[] and b[],
	// padding the shorter arrays with trailing 0s if necessary.
	public static double[] mix(double[] a, double[] b) {
		double[] c = new double[Math.max(a.length, b.length)];
		for (int i = 0; i < c.length; i++) {
			// bigger than a's end index pad 0
			if (i > a.length - 1) { c[i] = b[i]; }
			else if ( i > b.length - 1 ) { c[i] = a[i]; } 
			else { c[i] = a[i] + b[i]; }
		}
		return c;
	}

	// Returns a new array that changes the speed by the given factor.
	public static double[] changeSpeed(double[] a, double alpha) {
		double[] b = new double[(int)(a.length / alpha)];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[(int)(i*alpha)];
		}
		return b;
	}
	// Creates an audio collage and plays it on standard audio.
	// See below for the requirements.
	public static void main(String[] args) {
		double[] audio1 = StdAudio.read("harp.wav");
		double[] audio2 = StdAudio.read("beatbox.wav");
		double[] audio3 = StdAudio.read("chimes.wav");
		double[] audio4 = StdAudio.read("piano.wav");
		double[] audio5 = StdAudio.read("singer.wav");
		StdAudio.play( mix(merge(amplify(audio1, 2), amplify(reverse(audio3), 2)), mix(mix(audio5, changeSpeed(merge(amplify(audio2, 0.5), amplify(audio2, 0.5)), 0.5)), changeSpeed(audio4, 0.5))) );
	}
}

