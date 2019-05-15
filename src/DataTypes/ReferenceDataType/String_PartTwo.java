package DataTypes.ReferenceDataType;

public class String_PartTwo {
  
  public static void main(String[] args) {
	
    String str = "abcde";
    
    if(str.startsWith("ab")){
	  System.out.println(true);
	}else {
	  System.out.println(false);
	}
  
	if(str.endsWith("dee")){
	  System.out.println(true);
	}else {
	  System.out.println(false);
	}
  
	System.out.println(str.charAt(2));
	
	String text = "To be or not to be, that is some information";
	String newText = text.replace("be","*");
	System.out.println(newText);
	
	String myStr = "Str A" + ( 5 - 5 );
	System.out.println(myStr);
	
	String strThree = "abcdea";
	
	int index = 0;
	index = strThree.lastIndexOf('a');
	System.out.println(index);
	
  
  }
}
