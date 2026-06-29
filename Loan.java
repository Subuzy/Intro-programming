public class Loan
{
	public static void main(String[] args)
	{
		float P = Float.parseFloat(args[0]);
		float r = Float.parseFloat(args[1]);
		int t = Integer.parseInt(args[2]);
		double p = (Math.round(100 * P * Math.exp(r * t)));
		System.out.println("You would pay $" + (p / 100) + " in total.");
	}
}