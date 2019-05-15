package DataTypes.primitiveTypes;

public class Boolean_Intro {
  
  public static void main(String[] args) {
	
    boolean b1 = true;
    boolean b2 = false;
    
    boolean b3 = (10 > 20) ? true : false;
  
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
  
  
    boolean b ;
    
    b = false;
	System.out.println(b);
	
	if(b){
	  System.out.println("this is working ");
	  
	}else {
	  System.out.println("something");
	}
	
	//Wrapper class
	
	Boolean boo = Boolean.valueOf("true");
	System.out.println(boo);
	
	String strBoolean = "TRUE";
	
	boolean theValue = Boolean.parseBoolean(strBoolean);
	System.out.println(theValue);
  
  }
}
