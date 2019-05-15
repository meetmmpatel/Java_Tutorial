package DataTypes.primitiveTypes;

public class Char_Intro {
  
  public static void main(String[] args) {
	
    
    char ch1 = 'Z';
	System.out.println(ch1);
 
	char ch2 = 536;
	System.out.println(ch2);
  
 
	for(int i = 32; i < 127; i++){
	  
	  System.out.println((char)i);
	  
	  // break line after every 8 char
	  if(i % 8 == 7){
		System.out.println('\n');
	  }else {
		System.out.println('\t');
	  }
	  
	  System.out.println('\n');
	}
	
	char symbol = 'A';
 
	System.out.println(Character.isDigit(symbol));
	
	
  }
  
  
  
}
