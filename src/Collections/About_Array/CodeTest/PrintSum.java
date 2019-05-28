package Collections.About_Array.CodeTest;

public class PrintSum {
  
  public static void main(String[] args) {
	
	int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	int sum = 0;
	for (int i : my_array) {
	  sum += i;
	  // sum = sum + i;
	}
 
	System.out.println("Sum of array is :" + sum);
	System.out.println("Avg of array is :" + sum/my_array.length);
	
  }
  
  
  
}
