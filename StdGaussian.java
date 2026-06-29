public class StdGaussian
{
	public static void main(String[] args)
	{//prints a number from the gaussian disribution
		double num = Math.sin(Math.PI * 2 * Math.random()) * Math.sqrt(-2 * Math.log(Math.random()));
		System.out.println(num);
	}
}