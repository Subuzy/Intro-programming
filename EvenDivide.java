public class EvenDivide
{
	public static void main(String[] args)
	{//see if arg[0] is evenly divided by arg[1]
		int a = (int) Integer.parseInt(args[0]), b = (int) Integer.parseInt(args[1]);
		if (a % b == 0) System.out.println("Evenly divides");
		else System.out.println("Unevenly divides");
	}
}