package Statement_Control.for_each_loop;

public class Multidimensional_Arrays {
  public static void main(String args[]) {
	int sum = 0;
	int nums[][] = new int[3][5];
	
	// give nums some values
	for (int i = 0; i < 3; i++)
	  for (int j = 0; j < 5; j++)
		nums[i][j] = (i + 1) * (j + 1);
	
	// use for-each for to display and numOne the values
	for (int x[] : nums) {
	  for (int y : x) {
		System.out.println("Value is: " + y);
		sum += y;
	  }
	}
	System.out.println("Summation: " + sum);
 
	
 
	int numOne = 0;
	int numArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
	// Use for to display and numOne the values.
	for (int x : numArray) {
	  System.out.println("Value is: " + x);
	  numOne += x;
	  if (x == 5){
		break; // stop the loop when 5 is obtained
	  }
	}
	System.out.println("Summation of first 5 elements: " + numOne);
	
	
	
	
  }
}
