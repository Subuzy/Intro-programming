public class BinaryAutoStop {
	//print N in binary
	public static void main(String[] args) {
		long N = Long.parseLong(args[0]);
		long v = 1;
		while (v <= N / 2) {
			if (v * 2 > v)
			v *= 2;
			else {
				System.out.print("Integer too large!");
				break;
			//v is the greatest factor of 2 and less than N
			}
		}
		while (v > 0)
		{
			if ( N < v) {
				System.out.print(0);
			}
			else {
				System.out.print(1); N -= v;
			}
				v /= 2;
		}
	 System.out.println();
	}
}