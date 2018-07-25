

/**
 * <code> Build a basic calculator. </code>
 * Calculator.java - This program performs arithmetic, ( +. -, *, /, % ,etc) on two numbers
 * Input: Interactive.(Ask the user to input 2 values,Ask the user to input an operation,Use the operation on the 2 values and print the result)
 * Output: Result of arithmetic operation.
 * @author Devi
 * @date 5/2/2018 - Due Date of mid term project Submission.
 * @version 1.0

 */

public class MainCalculator {

	public static void main(String[] args) {
		System.out.println("Do you want start calculator program: on or off or help");
		//instantiate the class object
		try {
		TypeCalculator textCalculator = new TypeCalculator();
		}catch(Exception e){
			System.out.println("Your program is not running properly");
		}
		
	}	// End of Main Method
		


}  // End of Main class
