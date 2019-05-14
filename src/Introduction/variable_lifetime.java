package Introduction;

public class variable_lifetime {
  
  public static void main(String[] args) {
	
	// this is for loop and loop will run 4 times
	for (int i = 0; i < 4; i++) {
	  
	  int y = -1;
	  System.out.println("Y  =  " + y);
	  y = 100;
	  System.out.println("Y is now = " + y);
	  
	  
	}
	
	
  }
  
  
}
