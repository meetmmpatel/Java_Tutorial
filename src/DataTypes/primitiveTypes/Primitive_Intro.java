package DataTypes.primitiveTypes;

public class Primitive_Intro {
  
  public static void main(String[] args) {
    
    //Following data types support full numbers
	
    byte b1 = 127;
    short s1 = 3298;
    int i1= 34567;
    long l1 = 569870;
    
    //Following data types for decimal value
	float f1 = 12.99F;
	double d1 = 18.9987;
 
	
	char c1 = 'A';
	boolean boo = true;
	
	//Wrapper Type!!
	Byte  objB = new Byte((byte) 123);
	byte b = objB.byteValue();
	System.out.println(b);
	
	
	
  }

  
}
