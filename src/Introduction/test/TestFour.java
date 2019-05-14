package Introduction.test;

import java.util.Scanner;

public class TestFour {
  
  
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num = scan.nextInt();
	
	for (int i = 0; i < 10; i++) {
	  
	  System.out.println(num + " X " + (i + 1) + " = " + (num * (i + 1)));
	  
	}
	
	
  }
}
