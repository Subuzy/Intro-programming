public class ithHello {
	public static void main(String[] args) {
		int i =Integer.parseInt(args[0]);
		for(int count = 1; count <= i; ++count) {
			switch (count % 10) {
				case 1 -> System.out.println(count + "st Hello");
				case 2 -> System.out.println(count + "nd Hello");
				case 3 -> System.out.println(count + "rd Hello");
				default -> System.out.println(count + "th Hello");
			}
		}
	}
}