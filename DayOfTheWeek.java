public class DayOfTheWeek {
	// m/y/d input format, 0 for Sunday, 1 for Monday, etc.
	public static void main(String[] args) {
		short m = Short.parseShort(args[0]);
		short d = Short.parseShort(args[1]);
		short y = Short.parseShort(args[2]);
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = (m + 12 * ((14 - m) / 12) - 2);
		int d0 = ((d + x + (31 * m0) / 12) % 7);
		//System.out.println(y0 + " " + x + " " + m0 + " " + d0);
		String z = "Invalid Date";
		switch (d0) {
			case 0 -> z = "Sunday";
			case 1 -> z = "Monday";
			case 2 -> z = "Tuesday";
			case 3 -> z = "Wednesday";
			case 4 -> z = "Thursday";
			case 5 -> z = "Friday";
			case 6 -> z = "Saturday";
		}
		System.out.println(z);
	}
}
