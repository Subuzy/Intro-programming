public class OneThousandTo2000 {
	//prints integers 1000 to 2000, creating a new line every 5 integers
	public static void main(String[] args) {
		System.out.print("1000, ");
		for (int i = 1001; i < 2000; ++i) {
			if ((i + 1) % 5 == 0) {
				System.out.println(i + ",");
			} else {
				System.out.print(i + ", ");
			}
		}
		System.out.print("2000");
	}
}