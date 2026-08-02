public class Harmonic
{
	public static void main(String[] args)
	{//Compute the Nth harmonic number
		int N = Integer.parseInt(args[0]);
		double sum = 0.0;
		for (int i = 1; i <= N; ++i)
		{
			sum +=1.0/i;
		}
	System.out.println(sum);
	}
}