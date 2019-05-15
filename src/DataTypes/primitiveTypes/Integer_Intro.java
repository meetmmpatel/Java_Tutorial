package DataTypes.primitiveTypes;

public class Integer_Intro {
  
  public static void main(String[] args) {
	
	int a = (20 - 3) * (3 - 9) / 3;
	int b = 20 - 3 * 3 - 9 / 3;
	
	
	System.out.println(a);
	System.out.println(b);
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Long.MAX_VALUE);
	
	int numOne = (int) Long.MAX_VALUE;
	System.out.println(numOne);
	
	
	addAndCheck(Integer.MAX_VALUE, Integer.MIN_VALUE);
	addAndCheck(24,24);
	
	multiplyAndCheck(10, 10);
	multiplyAndCheck(12, 12);
	multiplyAndCheck(Integer.MAX_VALUE, Integer.MAX_VALUE);
	
  }
  
  public static int addAndCheck(int a, int b) {
	
	long s = (long) a + (long) b;
	
	if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
	  throw new ArithmeticException("Over flow of method");
	}
	
	System.out.println(s);
	return (int) s;
	
  }
  
  
  public static int multiplyAndCheck(int a, int b) {
	int sum = a * b;
	
	System.out.println(sum);
	return sum;
  }
  
  
}
