package Introduction.test;

public class TestSix {
  
  public static void main(String[] args) {
	
    int a = 15;
    int b = 30;
  
	System.out.println("Before swapping :" + "a is = " + a + " "+ "b is = " + b);
	
	int c = a;
	a = b;
	b = c;
  
 
	System.out.println("After swapping :" + "a is = " + a + " "+ "b is = " + b);
  
  }
}
