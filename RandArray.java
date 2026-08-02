public class RandArray {
	//does the same thing as RandN, but saves every value to an array for max and min
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		double total = 0.0;
		double max = 0.0;
		double min = 1.0;
		double[] random = new double[N];
		//concatenate all random numbers into an array
		for(int i = 0; i < N; ++i) {
			random[i] = Math.random();
			total += random[i];
			System.out.println(random[i]);
		}
		//find maximum
		for(int i = 0; i < N; ++i) {
			max = Math.max(max,random[i]);
		}
		//find minimum
		for(int i = 0; i < N; ++i) {
			min = Math.min(min,random[i]);
		}
		//calculate the average and print
		total /= N;
		System.out.println("maximum: " + max);
		System.out.println("average: " + total);
		System.out.println("minimum: " + min);
	}
}