public class MonthArea
{
	public static void main(String[] args)
	{
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		boolean Month = false;
		switch (m) {
			case 3		-> {if (d > 20) Month = true;}
			case 4, 5 	-> Month = true;
			case 6		-> {if (d < 20) Month = true;}
		}
		if (Month) System.out.println("Date is within 3/20 & 6/20.");
		else System.out.println("Date is not within 3/20 & 6/20.");
	}
}