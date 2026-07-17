public class DragonCurves {
	public static void main(String args[]) {
		int order = Integer.parseInt(args[0]);
		String curve = "";
		String curveadd = "";
		String curveaddM1 = "";
		//in curveadd, create another one order -1 except add FR instead of FL in middle on last loop
		for(int CurrentOrder = 0; CurrentOrder < order; ++CurrentOrder) {
			//delay curveadd by 1 order (makes it go through 2 vars instead of 1)
			curveaddM1 = curve;
			curveadd = curveaddM1;
			//add the 2 together
			System.out.println(CurrentOrder + "<- + " + curve + " + " + curveadd);
			curve += "1" + curveadd;
			//""compliment the middle digit"" by just adding 0 instead of 1
			curveadd += "0" + curveadd;
			System.out.println(curve + " + " + curveadd);
		}
		System.out.println("end" + curve);
	}
}