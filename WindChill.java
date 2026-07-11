public class WindChill {
	public static void main(String[] args) {
		float t = Float.parseFloat(args[0]);
		float v = Float.parseFloat(args[1]);
		double w = (35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
		//are these values allowed for this formula?
		if (Math.abs(t) > 50 || v < 3 || v > 120) {
			System.out.println("Formula not valid; values out of expected range");
		}
		else {
			System.out.println(w);
		}
	}
}