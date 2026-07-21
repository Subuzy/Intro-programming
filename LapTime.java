public class LapTime {
	//print the laptime from the minute, seconds and track length
	public static void main(String[] args) {
		double tracklength = Double.parseDouble(args[0]);
		int loop = Integer.parseInt(args[1]);
		for(int i = 0; i < loop; ++i) {
			int arg2 = 2 + 2 * i;
			int arg3 = 3 + 2 * i;
			int minutes = Integer.parseInt(args[arg2]);
			double seconds = Double.parseDouble(args[arg3]);
			double time = seconds + minutes * 60;
			//MpM meaning Miles per Minute
			double MpM = time / tracklength;
			int LapMinutes = (int) MpM / 60;
			//convert decimal to base 60 and round
			double LapSeconds = MpM % 60;
			//if I put Math.round and / 100 on the same line it doesnt work
			LapSeconds = Math.round(LapSeconds * 100);
			LapSeconds /= 100;
			System.out.println((i + 1) + ": " + LapMinutes + "m, " + LapSeconds + "s.");
		}
	}
}