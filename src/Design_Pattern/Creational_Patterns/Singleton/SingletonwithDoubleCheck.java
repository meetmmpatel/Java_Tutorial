package Design_Pattern.Creational_Patterns.Singleton;

public class SingletonwithDoubleCheck {

/*
1. Create Singleton class
2. Synchronized
3. Check null value before creating an instance of singleton class
 */
  
  // Private variable
  private static volatile SingletonwithDoubleCheck instance = null;
  
  
  //Private Constructor
  private SingletonwithDoubleCheck() {
	
  }
  
  //Create public get instance method
  public static SingletonwithDoubleCheck getInstance() {
	
	if (instance == null) {
	  synchronized (SingletonwithDoubleCheck.class) {
		if (instance == null) {
		  instance = new SingletonwithDoubleCheck();
		}
	  }
	}
	return instance;
  }
  
  public int getSum(int numOne, int numTwo) {
	return numOne + numTwo;
  }
}


