package Introduction;

public class Variables_Types {
  
    /*
   
   1. Local variable
   2. Static (Or class ) variable
   3. Instance variable
   
    */
  
  public String myString = "Class or Static variable";
  
  public static void main(String[] args) {
	
	
	Variables_Types objOne = new Variables_Types();
	System.out.println(objOne.myString);
	
	Variables_Types objTwo = new Variables_Types();
	System.out.println(objTwo.myString);
	
	
  }
  
}
