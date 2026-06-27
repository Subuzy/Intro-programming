public class Binary
{
	public static void main(String[] args)
	{//print N in binary
		int N = Integer.parseInt(args[0]);
		int v = 1;
		boolean TERMINATED = false;
		while (v * 2 <= N && TERMINATED == false) {
			if ( v * 2 > v)
			v *= 2;
			else {	System.out.print("Program terminated: value too large, somehow even larger than... YOUR MUM!!!");
				TERMINATED = true;
			//v is the greatest factor of 2 and less than N
			}
		}
		while (v > 0 && TERMINATED == false)
		{
			if ( N < v)	{ System.out.print(0); }
			else		{ System.out.print(1); N -= v; }
			v /= 2;
		}
	 System.out.println();
	}
}