package Statement_Control.CodeTest;

import java.util.Scanner;

/*
3. Write a Java program that reads an integer
between 0 and 1000 and adds all the digits in the integer. 
Test Data
Input an integer between 0 and 1000:
565
Expected Output :
The sum of all digits in 565 is 16
 */

public class intergerNumber {
 
 
	
	public static void main(String[] args) {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int num = scan.nextInt();
	  
	  int a = num / 100;
	  int b = (num - 100 * a) / 10;
	  int c = num - 100 * a - 10 * b;
	  
	  System.out.println(a + b + c);
	}
}
