package Statement_Control.CodeTest;

import java.util.Scanner;

public class Degree_Fahrenheit {
  
  /*
  1. Write a Java program to convert temperature
     from Fahrenheit to Celsius degree.
	  Test Data
	  Input a degree in Fahrenheit: 212
	  Expected Output:
	  212.0 degree Fahrenheit is equal to 100.0 in Celsius
   */
  
  public static void main(String[] Strings) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input a degree in Fahrenheit: ");
	double fahrenheit = input.nextDouble();
	
	double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
	System.out.println(fahrenheit + " " +
			"degree Fahrenheit is equal to " + celsius + " in Celsius");
  }
}
