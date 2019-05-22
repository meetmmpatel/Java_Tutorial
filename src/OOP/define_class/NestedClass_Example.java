package OOP.define_class;

public class NestedClass_Example {
  
  //Nested or Inner class in java
  class A {
	
	private int i = 11;
	
	public int value() {
	  return i;
	}
	
  }
  
  class B {
	
	//Variable
	private String lablel;
	
	
	//Constructor
	B(String str) {
	  lablel = str;
	}
	
	//Method vs Function
	String readlabel() {
	  return lablel;
	}
	
  }
  
  
  public static void main(String[] args) {
	NestedClass_Example ns = new NestedClass_Example();
	//Must create instance of class in order to access inner class
	
	NestedClass_Example.A objOne = ns.new A();
	NestedClass_Example.B objTwo = ns.new B("String");
	System.out.println(objOne);
	System.out.println(objTwo);
	
	OutSide outSide = new OutSide();
	OutSide.Inside inside = outSide.new Inside();
	inside.printName("John Smith");
	
  }
  
  
}


class OutSide {
  
  public class Inside {
	public void printName(String name) {
	  System.out.println(name);
	}
	
  }
  
}
