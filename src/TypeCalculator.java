import java.util.Scanner;
/**
 * @version 1.0
 * @author Devi
 ** @see scanner - Takes the user input and store into a variables.
 *
 * @params type - Takes the user input store into a type. 
 * 
 * @return check the validation what user entering on, off, help
 */

public class TypeCalculator extends OperationCalculator {
	/**
	 * This is typeCalculaator method
	 * @see Scanner
	 */
	public  TypeCalculator() {
	
		String startCalulator;
	 // Scanner input
		Scanner scannerInput = new Scanner(System.in);
		

		startCalulator = scannerInput.nextLine();
		
		// if-else block
		if (startCalulator.equalsIgnoreCase("on")) {

			// Try catch block whether program runs or not
			try {
				operationCalculator();
			} catch (Exception e) {
				System.out.println("Your program is not running properly ....");
			}

		} else if (startCalulator.equalsIgnoreCase("off")) {
			System.out.println("Not interested in calculator program"+"\nclosing calculator program");
			// System.exit(0);

		} else if (startCalulator.equalsIgnoreCase("help")) {
			System.out.println("How is my calculator works: Ask the user to input 2 values\n"
					+ "Ask the user to input an operation\n"
					+ "Use the operation on the 2 values and print the result");
			System.out.println("Do you want start calculator program: on or off ");
			TypeCalculator textCalculator = new TypeCalculator();
		} else {

			System.out.println("Please enter valid text? on or off");
			startCalulator = scannerInput.nextLine(); // Takes user input
			if (startCalulator.equalsIgnoreCase("on")) {
				operationCalculator(); // call the method
			} else {
				System.out.println("Not intrested in calculator program");
				System.out.println("If you want to try .....");
				System.out.println("Please enter valid text? on or off");
				startCalulator = scannerInput.nextLine();
				scannerInput.close();
				
				if (startCalulator.equalsIgnoreCase("on")) {
					operationCalculator(); // call the method
				} else {
					System.out.println("closing calculator program" +"\n Thanks for choosing my program");
					System.exit(0); // Exit the program
				}
			}
		} // End of if-else block
	}
} // End of class
