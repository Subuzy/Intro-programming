public class StdGaussian {
	//prints a number from the gaussian disribution
	public static void main(String[] args) {
		double num = Math.sin(Math.PI * 2 * Math.random()) * Math.sqrt(-2 * Math.log(Math.random()));
		System.out.println(num);
	}
}