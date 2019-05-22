package OOP.methods.codeTest;

import java.util.Scanner;

public class Smallest_number {

/*
1. Write a Java method to find the smallest number
among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0

The average the value ...
 */
  
  public static int getSmallNum(int a, int b, int c) {
	
	if (c < b && c < a) {
	  return c;
	  
	} else if (b < c && b < a) {
	  return b;
	} else {
	  return a;
	}
	
	
  }
  
  public static double findAvg(int a, int b, int c) {
	
	
	return (a + b + c) / 3;
	
	
  }
  
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter three number  ");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	
	System.out.println("the smallest number is " + getSmallNum(a, b, c));
	
	System.out.println("the average number is " + findAvg(a, b, c));
	
  }
  
  
}
