public class Mercator
{
	public static void main(String[] args)
	{//takes the longitude of the map's center, latitude and longitude, and prints the x,y projection
		double lat = Double.parseDouble(args[0]);
		double lon = Double.parseDouble(args[1]);
		double l0 = Double.parseDouble(args[2]);
		double x = lon - l0;
		double y = 0.5 * Math.log((1 + Math.sin(lat)) / (1 - Math.sin(lat)));
		System.out.println(x + ", " + y);
	}
}