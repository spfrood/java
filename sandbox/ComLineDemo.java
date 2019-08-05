public class ComLineDemo {

	public static void main (String[] args) {
		System.out.println("You entered " + args.length + " command-line arguments");
		if (args.length > 0) {
			System.out.println("They were: ");
			for (int i = 0; i < args.length; i++) {
				System.out.println("\t" + args[i]);
			}
		}
	} // end main()

} // end class ComLineDemo 
