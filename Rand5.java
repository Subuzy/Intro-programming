public class Rand5
{
	public static void main(String[] args)
	{
		double m = 1e17,
		x1 = Math.random() * m,
		x2 = Math.random() * m,
		x3 = Math.random() * m,
		x4 = Math.random() * m,
		x5 = Math.random() * m;
		long
		z1 = (long) x1,
		z2 = (long) x2,
		z3 = (long) x3,
		z4 = (long) x4,
		z5 = (long) x5;
		System.out.println(z1 / m);
		System.out.println(z2 / m);
		System.out.println(z3 / m);
		System.out.println(z4 / m);
		System.out.println(z5 / m);
		long a = Math.max(z1,Math.max(Math.max(z2,z3),Math.max(z4,z5)));
		long i = Math.min(z1,Math.min(Math.min(z2,z3),Math.min(z4,z5)));
		System.out.println("The highest is: " + (a / m));
		System.out.println("The lowest is:  " + (i / m));
		System.out.println("The avergae is: " + ((z1 + z2 + z3 + z4 + z5) / 5 / m));
	}
}
