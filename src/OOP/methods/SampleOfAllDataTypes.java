package OOP.methods;

public class SampleOfAllDataTypes {
  
  //Method with return type of all data types
  
  // You need to call that method from main method
  
  // you can choose to keep the method static or non-static
  
  
  public static byte getByte() {
	return Byte.MAX_VALUE;
  }
  
  public static short getShort() {
	return Short.MAX_VALUE;
  }
  
  
  public static void main(String[] args) {
	System.out.println(getByte());
	System.out.println(getShort());
  }
  
  
}
