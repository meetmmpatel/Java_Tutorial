package Design_Pattern.Creational_Patterns.Singleton;

public class IntroOfSingleton {
  
  
  public static void main(String[] args) {
    
    
    //hash code of instances are different..
    IntroOfSingleton intro = new IntroOfSingleton();
	IntroOfSingleton introOne = new IntroOfSingleton();
	
	System.out.println(intro.hashCode());
	System.out.println(introOne.hashCode());
	System.out.println(intro.hashCode());
	
	
     A classA = new A (15);
	System.out.println(classA);
	A classA1 = new A (25);
	System.out.println(classA1);
  
  }

  
}

class  A {
  
  public A(int numOne) {
	this.numOne = numOne;
  }
  
  int numOne = 10;
  
  @Override
  public String toString() {
	return "A{" +
			"numOne=" + numOne +
			'}';
  }
}
