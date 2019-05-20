package Statement_Control.Exceptions;

public class IntroToExceptions {
  
  
  public static void main(String[] args) {
	
    int numOne = 12;
    int numTwo = 0;
    
    
    try {
	  System.out.println(numOne/numTwo);
   
	}catch (Exception e){
	  System.out.println("Positive number can be divided by zero");
   
	}
 
	System.out.println("Outside of Try catch block");
  
  }
}
