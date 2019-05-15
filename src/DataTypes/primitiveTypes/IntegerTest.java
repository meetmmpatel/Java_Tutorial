package DataTypes.primitiveTypes;

public class IntegerTest {
  
  public static void main(String[] args) {
	
	
	maximum(3, 31, 5);
	
	int numOne = 170;
	
	System.out.println(Integer.SIZE);
	
	System.out.println("Lowest One bit " + Integer.lowestOneBit(numOne));
	
	System.out.println("Number of leading zeros " + Integer.numberOfLeadingZeros(numOne));
	
	int n = 1;
	
	for (int i = 0; i < 16; i++) {
	  n = Integer.rotateLeft(n, 1);
	  System.out.println(n);
	}
	
	
	int numTwo = 10;
 
	System.out.println(Integer.signum(numTwo));
	
  }
  
  public static int maximum(int a, int b, int c) {
	
	if (b > a) {
	  a = b;
	}
	if (c > a) {
	  a = c;
	}
	
	System.out.println(a);
	return a;
	
  }
}
