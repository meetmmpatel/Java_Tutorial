package Java8_feature.OptionalClass;

import java.util.Optional;

public class Intro_Optinalclass {
  
  
  public static void main(String[] args) {
	
	String[] str = new String[10];

//    String strOne = str[9].substring(2,5);
//
//	System.out.println(strOne);
	
	
	//checking if index number 9 in str array is throwing null pointer exception ?
	Optional<String> isNull = Optional.ofNullable(str[9]);
	
	if (isNull.isPresent()) {
	  
	  String strTwo = str[9].substring(2, 5);
	  
	  System.out.println("SubString is " + strTwo);
	} else {
	  System.out.println("Can not get value since object is null");
	}
	
	str[9] = "SomeValue";
 
	Optional<String> isNull2 = Optional.ofNullable(str[9]);
 
	if (isNull2.isPresent()) {
	
	  String strTwo = str[9].substring(2, 5);
	
	  System.out.println("SubString is " + strTwo);
	} else {
	  System.out.println("Can not get value since object is null");
	}
	
	
	
  }
  
}
