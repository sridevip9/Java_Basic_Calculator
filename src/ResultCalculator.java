/**
 * @version 1.0
 * @author Devi
 * @params firstNumber -- Takes the user input store into a firstNumber
 * @params secondNumber - Takes the user input store into secondNumber
 * @params result --Takes the input of  arithmetic operation.
 * @return result -- calculates the whatever user want to do.
 * @author Devi
 * ResultCalculator - Takes the all arthemetic methods(like addition,subtraction,Multiplication,Division  etc)
 */
public class ResultCalculator {
	/**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
	// Addition method
   public double additionResult ( String firstNumber, String secondNumber) {
	   double result;
	   result =Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
	   
	  return result;
   }
   /**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
   // Subtraction method
   public double subtractionResult ( String firstNumber,  String secondNumber) {
	   double result;
	   
	   result =  Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
	   
	  return result;
   }
   /**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
   // Multiplication Method
   public  double multiplicationResult ( String firstNumber,  String secondNumber) {
	  double result;
	   result =  Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
	   
	  return result;
   }
   /**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
   // Division Method
   public  double  divisionResult  (String firstNumber, String secondNumber) {
	   double result = 0;
	  
	
	   try {
		   if(Double.parseDouble(secondNumber) != 0 ) 
		   result =  Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
	   }
		   catch (Exception e){
			   System.out.println("Cannot divide by zero");
	   }
	  
	   return result;
   }
   /**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
   //Modulus Method
   public double modulusResult (String firstNumber, String secondNumber) {
	   double result;
	   result = Double.parseDouble(firstNumber) % Double.parseDouble(secondNumber);
	   
	  return result;
   }
   /**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
   // power Method
   public double powerResult (String firstNumber, String secondNumber) {
	   double result;
	   
	   result = Math.pow(Double.parseDouble(firstNumber), Double.parseDouble(secondNumber));
	   
	  return result;
   }
   /**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
   // Squareroot Method
   public double sqrtResult (String firstNumber) {
	   double result;
	   result = Math.sqrt(Double.parseDouble(firstNumber));
	 
	  return result;
   }
   /**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 * @return result
	 */
// nthroot Method
   public double nthrootResult (String firstNumber,String secondNumber) {
	   double result;
	   result = Math.pow(Math.E, Math.log(Double.parseDouble(firstNumber))/Double.parseDouble(secondNumber));
	 
	  return result;
   }
   
} // End of class
