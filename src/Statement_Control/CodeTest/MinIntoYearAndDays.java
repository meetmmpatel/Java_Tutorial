package Statement_Control.CodeTest;

import java.util.Scanner;

public class MinIntoYearAndDays {
  
  public static void main(String[] args) {
	
  double minToyear = 60 * 24 * 365;
  
  
	Scanner scanner = new Scanner(System.in);
	
	double min = scanner.nextDouble();
	
	long years = (long)(min/minToyear);
	int days = (int)(min/60/24) % 365;
 
	System.out.println("Year  " + years + " days " + days);
  
  
  
  }
}
