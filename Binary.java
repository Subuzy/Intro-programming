public class Binary {
	//print N in binary
	public static void main(String[] args)	{
		int N = Integer.parseInt(args[0]);
		int greatestFactor = 1;

		//find the greatest factor of 2 that is less than N
		while (greatestFactor <= N / 2) {
			greatestFactor *= 2;
		}
		//print out binary digits in descending order until it gets to the last bit (2^0)
		while (v > 0) {
			//checks every bit to see it's value for N
			if ( N < v) {
				System.out.print(0);
			}
			else {
				System.out.print(1);
				N -= v;
			}
			//move to the next bit
			v /= 2;
		}
		System.out.println();
	}
}