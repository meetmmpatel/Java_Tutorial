package Java8_feature.MethodReferences;


import java.util.Arrays;

public class MethodRef_Arrays {
  
  
  public static void main(String[] args) {
	
	String[] stringArray = {"Negan", "Lucy", "Sansa", "Jon"};
	
	Arrays.sort(stringArray);
	System.out.println(Arrays.toString(stringArray));
	
	Arrays.sort(stringArray, String::compareToIgnoreCase);
	
	for (String s : stringArray) {
	  System.out.println(s);
	}
	
	
  }
}
