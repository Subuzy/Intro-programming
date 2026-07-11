public class UseArgument {
	public static void main(String[] args) {	
		System.out.print("Hi, ");
		System.out.print(args[0]);
		System.out.print(". How are you? Would you like to see an error? Oh then its right here -> ");
		System.out.println(args[999]);
	}
}