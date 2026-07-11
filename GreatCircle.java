public class GreatCircle {
	//prints the Great Circle distance between 2 points in degrees in nautical miles
	public static void main(String[] args) {
		double x1 = Math.toRadians(Double.parseDouble(args[0]));
		double y1 = Math.toRadians(Double.parseDouble(args[1]));
		double x2 = Math.toRadians(Double.parseDouble(args[2]));
		double y2 = Math.toRadians(Double.parseDouble(args[3]));
		//use negative values for South and East
		double d = 60 * Math.toDegrees(Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		System.out.println(d + " nautical miles away.");
	}
}