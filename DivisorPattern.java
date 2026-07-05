public class DivisorPattern {
	//print out a "map" of all no remainder divisions for x and y.
	public static void main(String[] args) {
		int t = Integer.parseInt(args[0]);
		for(int x = 1; x <= t; ++x) {
			for(int y = 1; y <= t; ++y) {
				if(x % y == 0 || y % x == 0)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
		System.out.println(x);
		}
	}
}