package DataTypes.primitiveTypes;

import java.util.Date;

public class Long_Intro {
  
  public static void main(String[] args) {
	
    long l1 = 10;
    
    
    Long longObj = new Long(l1);
	System.out.println(longObj);
	System.out.println(l1);
	
	
	long timeInMilleSecound = new Date().getTime();
 
	System.out.println("Time in MilliSecounds : " + timeInMilleSecound);
  
  
  }
}
