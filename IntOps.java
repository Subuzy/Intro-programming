public class IntOps
{
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int p = a * b;
		int q = a / b;
		int r = a % b;
		long g = 67;
		//String d = String.parseString(g);
		int s = (int) g;
		int x = 5013392 * 3035865;
		double rand = Math.random();		//rand stands for random number
		double dsrand = rand * Math.pow(10, a);	//dsrand stands for decimal-shifted random number
		//tehe couldve used 1ea like 1e4 = 1000 maybe not maybe 1e"a" hmm idk
		int frand = (int) dsrand;		//frand stands for final random number
		System.out.println(a + " * " + b + " = " + p);
		System.out.println(a + " / " + b + " = " + q);
		System.out.println(a + " % " + b + " = " + r);
		System.out.println(a + " = " + q + " * " + b + " + " + r);
		System.out.println(a + "^" + b + " = " + Math.pow(a, b));
		System.out.println("the highest number out of " + a + " & " + b + " is " + Math.max(a, b));
		System.out.println("the lowest number out of " + a + " & " + b + " is " + Math.min(a, b));
		System.out.println("square root of " + a + " = " + Math.sqrt(a));
		System.out.println("absolute value of " + a + " = " + Math.abs(a));
		System.out.println("A random number between 0 and 1 is " + Math.random());
		System.out.println("2*Pi can be approximated to " + Math.PI * 2);
		System.out.println("We can use a cast like (int) to convert floating numbers to integers, like " + s);
		System.out.println("A random integer up to " + a + " decimal places is " + frand + ".");
		System.out.println("Even though only * was used on 5013392 * 3035865, the result is negative: " + x + ".");
		System.out.println("Find more interesting java facts like this on page 36 in the book!");
	}
}