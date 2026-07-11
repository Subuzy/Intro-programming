public class Ruler {
	//prints the dividend of segments on a ruler
	public static void main(String[] args) {
		String ruler = "";
		int t = Integer.parseInt(args[0]);
		for(int i = 1; i <= t; ++i) {
			ruler = ruler + i + ruler;
		}
		System.out.println(ruler);
	}
}/*


old code:
		String ruler1 = "1";
		String ruler2 = ruler1 + " 2 " + ruler1;
		String ruler3 = ruler2 + " 3 " + ruler2;
		String ruler4 = ruler3 + " 4 " + ruler3;
		System.out.println(ruler4 + " 5 " + ruler4);
*/