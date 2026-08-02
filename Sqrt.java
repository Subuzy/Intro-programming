public class Sqrt
{
	public static void main(String[] args)
	{
		double c = Double.parseDouble(args[0]), epsilon = 1e-15, t = c;
		while(Math.abs(t - c / t) > epsilon * t)
		t = (c / t + t) / 2.0;
		System.out.println(t);
		System.out.println(Math.sqrt(Double.parseDouble(args[0])));
	}
}