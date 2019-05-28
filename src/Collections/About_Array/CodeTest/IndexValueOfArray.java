package Collections.About_Array.CodeTest;

public class IndexValueOfArray {
  
  public static void main(String[] args) {
	
	int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
	System.out.println("Index of 25 " + findIndex(my_array, 25));
	System.out.println("Index of 77	" + findIndex(my_array, 77));
	
  }
  
  
  public static int findIndex(int[] arr, int index) {
	
	if (arr == null)
	  return -1;
	
	int len = arr.length;
	int i = 0;
	
	while (i < len) {
	  if (arr[i] == index) {
		return i;
	  } else i = i + 1;
	}
	
	return -1;
  }
}
