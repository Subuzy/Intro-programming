public class Velocity {
	//prints the displacement of an object at v velocity after t time upwards
	public static void main(String[] args) {
		double v = Double.parseDouble(args[0]);
		double t = Double.parseDouble(args[1]);
		double ans = v * t - 9.78033 * (t * t) / 2;
		if (Math.abs(ans) <= ans) {
			System.out.println(ans + "m displacement upwards");
		}
		else {
			System.out.println(Math.abs(ans) + "m displacement downwards");
		}
	}
}