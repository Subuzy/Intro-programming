public class Quadratic
{
	public static void main(String[] args)
	{
		double b = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		double discriminant = b*b - 4.0*c;
		double d = Math.sqrt(discriminant);
		if (Math.abs(d) != d) System.out.println("No real roots");
		else System.out.println((-b + d) / -2.0 + " " + (-b - d) / -2.0);
		System.out.println("sin(2b) + sin(3b) is " + (Math.sin(2*b) + Math.sin(3*b)));
	}
}
/*
 *		double f1 = (-b + d) / -2.0;
 *		double f2 = ((-b - d) / -2.0);
 *		//f stands for factor
 *		System.out.println("(x + " + f1 + ")(x + " + f2 + ")");
 */