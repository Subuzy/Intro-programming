public class RandN {
	//prints N random numbers, then finds the average
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		double total = 0;
		//print N random numbers
		for(int i = 0; i < N; ++i) {
			double CurrentRandom = Math.random();
			total += CurrentRandom;
			System.out.println(CurrentRandom);
		}
		//calculate the average and print
		total /= N;
		System.out.println("average: " + total);
	}
}