public class Binary
{
	public static void main(String[] args)
	{
		int N = Integer.parseInt(args[0]);
		int v = 1;
		String ans;
		for(ans = "1"; N > 0; System.out.println(N + " " + v));
		{
				for(v = 1; v * 2 < N; v *= 2)
			{
				}
			System.out.println(" first: " + N + " " + v);
			N -= v;
			if (N != 0) {
				if (N < v / 2) ans = ans + "0";
				else
				{
					ans = ans + "1";
					v /= 2;
				}
			}
		}
	System.out.println(ans);
	}
}
