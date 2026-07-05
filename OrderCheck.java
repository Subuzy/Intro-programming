public class OrderCheck
{
	public static void main(String[] args)
	{
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		boolean t = false;
		if (x < y && y < z) t = true;
		if (x > y && y > z) t = true;
		System.out.println(t);
	}
}