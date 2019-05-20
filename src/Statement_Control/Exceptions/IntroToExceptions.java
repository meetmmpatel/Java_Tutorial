package Statement_Control.Exceptions;

public class IntroToExceptions {
  
  
  public static void main(String[] args) {
	
    int numOne = 12;
    int numTwo = 0;
    
    
    try {
	  System.out.println(numOne/numTwo);
   
	}catch (ArithmeticException e){
	  System.out.println("Positive number can be divided by zero");
   
	}catch (Exception e){
	  System.out.println("something went wrong !");
	}
 
	System.out.println("Outside of Try catch block");
  
  }
}
