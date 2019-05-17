package Statement_Control.Switch_Statement;

import java.util.Random;

public class Switch_Statement {

//  Failure to add a break statement after a case will not generate a compile error
//  but may have more serious consequences because the statements
//  on the next case will be executed.
  
  
  public static void main(String[] args) {
	
	Random random = new Random();
	
	int i = random.nextInt(5);
	
	System.out.println(i);
	
	switch (i) {
	  case 1:
		System.out.println("One.");
		break;
	  case 2:
		System.out.println("Two.");
		break;
	  case 3:
		System.out.println("Three.");
		break;
	  
	  default:
		System.out.println("You did not enter a valid value.");
	}
	
	// More Demo
	
	int choice = random.nextInt(3);
	System.out.println(choice);
	
	switch (choice) {
	  case 1:
		System.out.println("Choice 1 selected");
		break;
	  case 2:
		System.out.println("Choice 2 selected");
		break;
	  case 3:
		System.out.println("Choice 3 selected");
		break;
	  default:
		System.out.println("Default");
		break;
	}
	
//	When we do not use break statements
	int v = random.nextInt(2);
	System.out.println("value if v is:  ");
	switch (v) {
	
	  case 0:
		System.out.println("v is 0");
	  case 1:
		System.out.println("v is 1");
	  case 2:
		System.out.println("v is 2");
	  default:
		System.out.println("Free flowing switch example!");
	}
  }
  
}
