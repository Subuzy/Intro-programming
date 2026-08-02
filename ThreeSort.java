public class ThreeSort {
	//takes 3 integers and prints them in ascending order
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int x = Math.max(a,Math.max(b,c));
		int z = Math.min(a,Math.min(b,c));
		//assign y to 404, meaning a "not found" error code
		int y = 404;
		if (b == x && c == z || c == x && b == z) {
		y = a;
		}
		if (a == x && c == z || c == x && a == z) {
		y = b;
		}
		if (a == x && b == z || b == x && a == z) {
		y = c;
		}
		System.out.println(z + ", " + y + ", " + x);
	}
}