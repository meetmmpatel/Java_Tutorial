package Collections.About_Array.CodeTest;

public class PrintDuplicate {
  
  
  public static void main(String[] args) {
	
	
	int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
	
	
	for (int i = 0; i < my_array.length -1; i++) {
	  
	  for (int j = i + 1; j < my_array.length; j++) {
		
		
		if ((my_array[i] == my_array[j]) ) {
		  System.out.println("Duplicate values " + my_array[j]);
		}
		
	  }
	  
	  
	}
	
	
  }
}
