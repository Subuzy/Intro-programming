public class Between0and1 {
	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		//check and print
		if (a >= 0 && a <= 1 && b >= 0 && b <= 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}