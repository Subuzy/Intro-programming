public class Rand5 {
	public static void main(String[] args) {
		double precision = 1e17;
		//create the random numbers
		double x1 = Math.random() * precision;
		double x2 = Math.random() * precision;
		double x3 = Math.random() * precision;
		double x4 = Math.random() * precision;
		double x5 = Math.random() * precision;
		//cast to long for Math.min/max()
		long z1 = (long) x1;
		long z2 = (long) x2;
		long z3 = (long) x3;
		long z4 = (long) x4;
		long z5 = (long) x5;
		System.out.println(z1 / precision);
		System.out.println(z2 / precision);
		System.out.println(z3 / precision);
		System.out.println(z4 / precision);
		System.out.println(z5 / precision);
		long max = Math.max(z1,Math.max(Math.max(z2,z3),Math.max(z4,z5)));
		long min = Math.min(z1,Math.min(Math.min(z2,z3),Math.min(z4,z5)));
		System.out.println("The highest is: " + (max / precision));
		System.out.println("The lowest is:  " + (min / precision));
		System.out.println("The avergae is: " + ((z1 + z2 + z3 + z4 + z5) / 5 / precision));
	}
}
