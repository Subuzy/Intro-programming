public class LapTime {
	//print the laptime from the minute, seconds and track length
	public static void main(String[] args) {
		double tracklength = Double.parseDouble(args[0]);
		int minutes = Integer.parseInt(args[1]);
		double seconds = Double.parseDouble(args[2]);
		double time = seconds + minutes * 60;
		//MpM meaning Miles per Minute
		double MpM = time / tracklength;
		int LapMinutes = (int) MpM / 60;
		//convert decimal to base 60 and round
		double LapSeconds = MpM % 60;
		//if I put Math.round and / 100 on the same line it doesnt work
		LapSeconds = Math.round(LapSeconds * 100);
		LapSeconds /= 100;
		System.out.println(LapMinutes + "m, " + LapSeconds + "s.");
	}
}

//in the future I want to add a while loop that takes a number of laps and another variable in order to find the average lap, then calculate