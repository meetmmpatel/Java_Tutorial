package OOP.methods.codeTest;

public class Middle_Character {

/*

Write a Java method to display the middle character of a string. Go to the editor

Note:

a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
Test Data:
Input a string: 350
Expected Output:


The middle character in the string: 5
 */
  
  
  public static String findMiddle(String str) {
	
	int position;
	int length;
	
	if (str.length() % 2 == 0) {
	  
	  position = str.length() / 2 - 1;
	  length = 2;
	  
	} else {
	  
	  position = str.length() / 2;
	  length = 1;
	  
	}
	
	return str.substring(position, position + length);
  }
  
  public static void main(String[] args) {
	System.out.println(findMiddle("ThisIsNumber"));
	
	
  }
  
}
