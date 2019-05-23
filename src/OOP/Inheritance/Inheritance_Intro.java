package OOP.Inheritance;

public class Inheritance_Intro extends SuperClass {
  
  public static void main(String[] args) {
	
	//Private method in super class are not allowed to access
	//in child class..
	Inheritance_Intro intro = new Inheritance_Intro();
	
	intro.publicMethod();
	
	intro.protectedMethod();
	intro.defaultMethod();
	
	System.out.println(intro);
	
	
  }
  
  public Inheritance_Intro() {
	super();
	System.out.println("This is child class ");
	
  }
  
  /*
  What is method Overriding ??
  
  	1.When you extends a class, you can change the behavior of a method in the parent class.
		This is called method overriding.
	2.This happens when you write in a subclass a method that has the same signature as a method in the parent class.
	3.If only the name is the same but the list of arguments is not, then it is method overloading.
  
   */
  
  protected void protectedMethod() {
	super.protectedMethod();
	System.out.println("This is protected method from child class");
	System.out.println(20 + 20);
  }
  
  
}

class SuperClass {
  
  public SuperClass() {
	System.out.println("This is super class");
  }
  
  public void publicMethod() {
	System.out.println("This is public method");
  }
  
  protected void protectedMethod() {
	System.out.println("This is protected method");
	System.out.println(10 + 10);
  }
  
  void defaultMethod() {
	System.out.println("This is default method");
  }
  
  private void privateMethod() {
	System.out.println("This is private method");
  }
  
}
