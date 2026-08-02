public class Factor
{
	public static void main(String[] args)
	{
		for(byte t = 0; t < 2; ++t)
		{
			long N = Long.parseLong(args[0]);
			long n = N;
			for (long i = 2; i <= n/i; i++)
			{
				while (n % i == 0)
				{
					n /= i;
					System.out.print(i + " ");
				}
			}
			if (n > 1) System.out.print(n);
			System.out.println();
		//my vers vs book vers

	
			n = N;
			while (n % 2 == 0)
			{
				n /= 2;
				System.out.print("2 ");
			}
			for (long i = 3; i <= n/i; i += 2)
			{
				while (n % i == 0)
				{
					n /= i;
					System.out.print(i + " ");
				}
			}
			if (n > 1) System.out.print(n);
			System.out.println();
		}


	}
}