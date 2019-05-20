package Statement_Control.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
  
  /**
   * try {
   * //Statements that may cause an exception
   * }
   * catch {
   * //Handling exception
   * }
   * finally {
   * //Statements to be executed
   * }
   */
  
  public static void main(String[] args) {
	try {
	  int num = 120 / 1;
	  System.out.println(num);
	} catch (ArithmeticException e) {
	  System.out.println("Arithmetic exception");
	} finally {
	  System.out.println("Print this statement anyway!!");
	}
	
	
	Scanner scanner = new Scanner(System.in);
	
	try {
	  
	  int numOne = scanner.nextInt();
	  System.out.println(numOne);
	} catch (InputMismatchException e) {
	  System.out.println("It's not in number format");
	} finally {
	  System.out.println("Finally block ");
	  scanner.close();
	}
	
	
  }
  
}
