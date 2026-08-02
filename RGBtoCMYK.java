public class RGBtoCMYK {
	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]) / 255;
		double g = Double.parseDouble(args[1]) / 255;
		double b = Double.parseDouble(args[2]) / 255;
		if (r == 0 && g == 0 && b == 0) {
			System.out.println("0.0, 0.0, 0.0, 1.0");
		}
		else {
			double w = Math.max(Math.max(r,g),b);
			double c = (w - r) / w;
			double m = (w - g) / w;
			double y = (w - b) / w;
			double k = 1 - w;
			System.out.println(c + ", " + m + ", " + y + ", " + k);
		}
	}
}
//I might make it percent soon instead of a very long decimal