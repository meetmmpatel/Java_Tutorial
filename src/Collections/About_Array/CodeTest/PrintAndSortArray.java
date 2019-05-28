package Collections.About_Array.CodeTest;

import java.util.Arrays;

public class PrintAndSortArray {
  
  public static void main(String[] args) {
	
	int[] my_array1 = {
			1789, 2035, 1899, 1456, 2013,
			1458, 2458, 1254, 1472, 2365,
			1456, 2165, 1457, 2456};
	
	String[] my_array2 = {
			"Java",
			"ansible",
			"Python",
			"PHP",
			"C#",
			"C Programming",
			"C++"
	};
	
	
	//1. Print each element of array in new line
	
	for (int i : my_array1) {
	  System.out.println("Unsorted Number Array : " + i);
	  
	}
	
	for (String s : my_array2) {
	  System.out.println("Unsorted String Array : " + s);
	}
	
	Arrays.sort(my_array1);
	System.out.println(Arrays.toString(my_array1));
	
	Arrays.sort(my_array2);
	System.out.println(Arrays.toString(my_array2));
	
	
  }
}
