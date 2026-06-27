public class Flip
{
	public static void main(String[] args)
	{//Flip a coin i times
		int t = Integer.parseInt(args[0]);
		String a;
		for(int i = 1; i <= t; ++i)
		{
			if (Math.random() < 0.5) a = "Heads";
			else a = "Tails";
			System.out.println(a);
		}
	}
}
/*  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*My own code:							*
*		String print;					*
*		double ran = Math.random();			*
*		if (ran > 0.5) print = "heads!";		*
*		else print = "tails!";				*
*		System.out.println("You flipped a " + print);	*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/*more ig
		int t = Integer.parseInt(args[0]), i = 1;
		while (i <= t) {
			if (Math.random() < 0.5) System.out.println("Heads");
			else System.out.println("Tails");
			i = i + 1;
		}
*/