import java.util.Scanner;
import java.lang.Math;
/**
 * @version 1.0
 * @author Devi
 * @see scanner - Takes the user input and store into a variables.
 * @see java.lang.Math - Perform some Math operations.
 * @params firstNumber - Takes the user input store into a firstNumber. (double variable)
 * @params secondNumber - Takes the user input store into a secondNumber.(double variable)
 * @params userSelection - Takes the input of  arithmetic operation.( +. -, *, /, % ,etc)
 * @params userChoice - Takes the user input store into a userChoice( y or n)
 * @return result - Result of arithmetic operation.
 */

public class OperationCalculator {
	/**
	 * This is operationCalculator method
	 * @see Scanner
	 */
	public static void operationCalculator() {
        // using scanner
		Scanner scannerInput = new Scanner(System.in);
		// variables info
		String firstNumber = "";
		String secondNumber = "";
		double result = 0;
	    int  userSelection = 0;
		char userChoice = 'y';

		System.out.println("Welcome to the Calculator");

		System.out.println("Enter your a  first number: ");
		firstNumber = scannerInput.nextLine();
		try {
			
			double  x = Double.parseDouble(firstNumber);
			
		}catch(NumberFormatException e) {
			System.out.println("Your input is not a number");
			System.out.println("Please enter enter a number");
			firstNumber = scannerInput.nextLine();
			scannerInput.close();
		}

		

		System.out.println("Enter your a second number: ");

		secondNumber = scannerInput.nextLine();
		try {
		
			double  y = Double.parseDouble(secondNumber);  
			
		}catch(NumberFormatException e) {
			System.out.println("Your input is not a number");
			System.out.println("Please enter enter a number");
			secondNumber = scannerInput.nextLine();
			scannerInput.close();
		}
	

		System.out.println("Make your selection: \n" + " 1. Addition " + "\n 2. subtraction " + "\n 3. Multiplication" + "\n 4. Division " + "\n 5. Modulus"
				+ "\n 6. power" + "\n 7. squreroot for first number " + "\n 8. nthroot ");
	
       // Takes the user selection 
		userSelection = scannerInput.nextInt();
       // Instantiate the ResultCalculator class object
		ResultCalculator calculator = new ResultCalculator();
      // while loop - checks the proper user selection
		int maxNumber = 8;
		while (userSelection > maxNumber) {
			System.out.println("Invalid selection! please enter valid selection :) ");
			System.out.println("Please enter valid selection : ");
			System.out.println(" 1. Addition " + "\n 2. subtraction " + "\n 3. Multiplication" + "\n 4. Division "
					+ "\n 5. Modulus" + "\n 6. power" + "\n 7. squreroot for first number "
					+ "\n 8. nthroot ");
			userSelection = scannerInput.nextInt();
		//	scannerInput.close();

		} // end of while loop
		
		// switch statements start here.. Takes the user selection and perform arithmetic operation
		
		switch(userSelection) {
		case(1):
			result = calculator.additionResult(firstNumber, secondNumber);
			System.out.println("Your answer is :   " + result);
            break;
		 case(2) :
			result = calculator.subtractionResult(firstNumber, secondNumber);
			System.out.println("Your answer is :   " + result);
			 break;
		 case(3) :
			 
			result = calculator.multiplicationResult(firstNumber, secondNumber);
			System.out.println("Your answer is :   " + result);
			
			 break;
		 case(4) :
			result = calculator.divisionResult(firstNumber, secondNumber);

			System.out.println("Your answer is :   " + result);
			 break;
		 case(5) :

			result = calculator.modulusResult(firstNumber, secondNumber);
			System.out.println("Your answer is :   " + result);
			 break;
		 case(6) :

			result = calculator.powerResult(firstNumber, secondNumber);
			System.out.println("Your answer is :   " + result);
			 break;
		 case(7):

			result = calculator.sqrtResult(firstNumber);
			System.out.println("Your answer is :   " + result);
			 break;
		
		 case(8) :

			result = calculator.nthrootResult(firstNumber,secondNumber);
			System.out.println("Your answer is :   " + result);
			 break;
		} // end of switch statements
	
		// If user wants to perform more calculations..

		System.out.println("Want to calculate more? Y/N");
       // Takes the user choice input
		userChoice = scannerInput.next().charAt(0);
		
       //  start of if-else block
		if ((userChoice == 'y') || (userChoice == 'Y')) {
			operationCalculator();

		} else if ((userChoice == 'n') || (userChoice == 'N')) {
			System.out.println("Calculator program terminated..."+"\nThanks for using my program.");
			System.exit(0);
		} else if ((userChoice != 'y') || (userChoice != 'n') || (userChoice != 'Y') || (userChoice != 'N')) {
			System.out.println("Invalid characters:) Please enter y/n");
			userChoice = scannerInput.next().charAt(0);
			
			operationCalculator();
		} // End of if-else block

	} // End of static Method
} // End of Class
