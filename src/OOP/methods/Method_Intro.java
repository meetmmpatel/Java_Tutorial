package OOP.methods;

public class Method_Intro {
  
  /*
  1. Static Method
  2. Non-Static Method
  3. Void Method
  4. Return type Method
  
  -- All this four type are with args, or without args

   */
  
  // Access modifier like public, private, protected or default
  // void or have return type
  // method name
  // args
  // body of method
  
  
  public static void getInfo() {
	System.out.println("This is method static void method without any args");
  }
  
  public static int sumOfTwo() {
	int a = 10;
	int b = 20;
	
	int c = a + b;
	System.out.println(c);
	return a + b;
  }
  
  public void getInfoWith() {
	System.out.println("This is non-static method without any args");
  }
  
  
  public static void main(String[] args) {
	
	getInfo();
	sumOfTwo();
	
	Method_Intro intro = new Method_Intro();
	intro.getInfoWith();
	
	
	Method_Example.getRef();
	
	Method_Example example = new Method_Example();
	example.getExampleRef();
	
  }
  
  
}

class Method_Example {
  
  public static void getRef() {
	System.out.println("This is static method from Method Example class");
  }
  
  public void getExampleRef() {
	System.out.println("This is non-static method from example class ");
  }
  
}



