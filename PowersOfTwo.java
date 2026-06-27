public class PowersOfTwo
{
	public static void main(String[] args)
	{//print the first i powers pf teo
		int i = Integer.parseInt(args[0]), v = 1;
		for(int t = 0; t <= i && t <= 30; ++t)
		{
			System.out.println(t + " " + v);
			v = v * 2;
		}
		if (i >= 30) System.out.println("...terminating program at 2^30 due to int data storage limit.");
	}
}