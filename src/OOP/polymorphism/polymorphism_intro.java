package OOP.polymorphism;

public class polymorphism_intro {
  
  public int claculateNum(int a, int b) {
	System.out.println(a + b);
	
	return a + b;
  }
  
  //OverLoaded method
  public float claculateNum(float a, float b) {
	System.out.println(a + b);
	return a + b;
	
  }
  
  public long claculateNum(long a, long b) {
	System.out.println(a + b);
	return a + b;
  }
  
  
  public static void main(String[] args) {
	
	polymorphism_intro obj = new polymorphism_intro();
	
	obj.claculateNum(12.99f, 14.68f);
	obj.claculateNum(23, 68);
	obj.claculateNum(Long.MAX_VALUE, Long.MAX_VALUE);
	
	
  }
  
  
}
