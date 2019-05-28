package Collections.About_Array;

import java.util.Arrays;

public class Copy_Clone_Array {
  
  public static void main(String[] args) {
	
    //How to to copy an array with clone and copyOf method
	
    String[] names = {"Alex","Brian","Charles","David"};
	System.out.println(Arrays.toString(names));
 
	String[] cloneNames = names.clone();
  
	System.out.println("After clone : " + Arrays.toString(cloneNames) );
	
	cloneNames[0] = "Some other vlaues";
	System.out.println("After changing index 0 : " + Arrays.toString(cloneNames) );
  
	//copy an array using copyOf method
	String [] copyNames = Arrays.copyOf(names,names.length);
	System.out.println("Arrays after copy:  " + Arrays.toString(copyNames));
	
	//Only want to copy some length
	String [] copyNamesTwo = new String[names.length];
	System.arraycopy(names,0,copyNames,0,copyNamesTwo.length);
 
	System.out.println(Arrays.toString(copyNames));
  }
}
