public class ThreeAreEqual
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		if (a == b && a == c && b == c) System.out.println("Equal");
		else System.out.println("Not Equal");
		if (a + b <= c || a + c <= b || b + c <= a) System.out.println("Triangle values: true");
		else System.out.println("Triangle values: false");
	}
}
