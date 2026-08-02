public class EvenDivide {
	//see if arg[0] is evenly divided by arg[1]
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if (a % b == 0) {
			System.out.println("Evenly divides");
		}
		else {
			System.out.println("Unevenly divides");
		}
	}
}