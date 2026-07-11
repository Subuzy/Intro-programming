public class Quadratic {
	public static void main(String[] args) {
		double b = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		double discriminant = b * b - 4 * c;
		double d = Math.sqrt(discriminant);
		if (Math.abs(d) != d) { 
			System.out.println("No real roots");
		}
		else {
			System.out.println((-b + d) / -2.0 + " " + (-b - d) / -2.0);
		}
	}
}
/*if written in proper factored form:
 *		//f stands for factor
 *		double f1 = (-b + d) / -2.0;
 *		double f2 = ((-b - d) / -2.0);
 *		System.out.println("(x + " + f1 + ")(x + " + f2 + ")");
 */