package Statement_Control.IF_Block;

import java.util.Random;

public class Two_mutipleIFs {
  
  public static void main(String[] args) {
	
	//example of multiple if statements
	// when there is more then one possible outcome
 
	Random random = new Random();
	int a = random.nextInt(5);
	
	if (a == 1) {
	  System.out.println("one");
	} else if (a == 2) {
	  System.out.println("two");
	} else if (a == 3) {
	  System.out.println("three");
	} else {
	  System.out.println("invalid");
	}
	
	
  }
}
