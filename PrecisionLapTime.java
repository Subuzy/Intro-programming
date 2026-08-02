public class PrecisionLapTime {
	//print the laptime from the minute, seconds and track length
	public static void main(String[] args) {
		int minutes = Integer.parseInt(args[0]);
		double seconds = Double.parseDouble(args[1]);
		double tracklength = Double.parseDouble(args[2]);
		//how many decimal places of precision
		int precision = (int) Math.pow(10,Integer.parseInt(args[3]));
		double time = seconds + minutes * 60;
		//MpM meaning Miles per Minute
		double MpM = time / tracklength;
		int LapMinutes = (int) MpM / 60;
		double LapSeconds = MpM % 60;
		//convert decimal to base 6
		LapSeconds = Math.round(precision * LapSeconds);
		LapSeconds /= precision;
		System.out.println(LapMinutes + "m, " + LapSeconds + "s.");
	}
}

//if 0.63, 5m 49s should be 9m, 13.98s