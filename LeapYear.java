public class LeapYear
{
	public static void main(String[] args)
	{
		int year = Integer.parseInt(args[0]);
		boolean isleapyear;
		isleapyear = (year % 4 == 0) && (year % 100 != 0);
		isleapyear = isleapyear || (year % 400 == 0);
		System.out.println(year + " is a " + isleapyear + " leap year.");
	}
}