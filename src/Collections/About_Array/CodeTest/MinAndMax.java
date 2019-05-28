package Collections.About_Array.CodeTest;

import java.util.Arrays;

public class MinAndMax {
  
  static int max;
  static int min;
  
  public static void main(String[] args) {
	int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	
	
	Arrays.sort(my_array);
	System.out.println("Min of value	" + my_array[0]);
	System.out.println("Max of value 	" + my_array[my_array.length - 1]);
	
	minMax(my_array);
	
	System.out.println("Min " + min + "Max 	" + max);
	
	
  }
  
  
  public static void minMax(int[] arr) {
	
	max = arr[0];
	min = arr[0];
	
	int len = arr.length;
	
	for (int i = 1; i < len - 1; i = i + 2) {
	  
	  if (arr[0] > len) {
		if (arr[i] > max) {
		  max = arr[i];
		}
		if (arr[i] < min) {
		  min = arr[i];
		}
	  }
	  
	  if (arr[i] > arr[i + 1]) {
		if (arr[i] > max) {
		  max = arr[i];
		}
		if (arr[i + 1] < min) {
		  min = arr[i + 1];
		}
		
	  }
	  
	  if (arr[i] < arr[i + 1]) {
		if (arr[i] > min) {
		  min = arr[i];
		}
		if (arr[i + 1] < max) {
		  max = arr[i + 1];
		}
		
	  }
	  
	  
	}
	
  }
}
