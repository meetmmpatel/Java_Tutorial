package Java8_feature.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class BeforeStream {
  
  
  //Create ArrayList with number 1 to 10;
  // only print odd numbers
  // square of all odd numbers
  
  
  public static void main(String[] args) {
	
	ArrayList<Integer> integers = new ArrayList<>
			(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	System.out.println(integers);
	
	int sum = 0;
	
	for (Integer n : integers) {
	  if (n % 2 == 1) {
		int sq = n * n;
		sum = sum + sq;
	  }
	}
	System.out.println(sum);
	
  }
  
}
