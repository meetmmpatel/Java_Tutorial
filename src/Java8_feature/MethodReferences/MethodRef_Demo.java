package Java8_feature.MethodReferences;

import OOP.methods.Method_Intro;

public class MethodRef_Demo {
  
  public static void main(String[] args) {
	
	MethodRef_Demo obj = new MethodRef_Demo();
	
	//Method ref using the object class
	
	MyInterFace interFace = obj::myMethod;
	
	//Calling method of interface
	interFace.display();
	
  }
  
  public void myMethod() {
	System.out.println("Instance Method..");
  }
  
  
}

@FunctionalInterface
interface MyInterFace {
  
  void display();
}