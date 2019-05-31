package Design_Pattern.Creational_Patterns.Singleton;

public class SingletonInAction {
  
  public static void main(String[] args) {
	
	Singleton singleton = Singleton.getInstance();
	
	singleton.showMessage();
	System.out.println("this is singleton hashcode " + singleton.hashCode());
	
	
	Singleton singletonOne = Singleton.getInstance();
	System.out.println("this is singletonOne hashcode " + singletonOne.hashCode());
	
  }
  
  
}

class Singleton {
  
  //Create the variable with singleton data type.
  private static Singleton instance = new Singleton();
  
  
  //Make the constructor of the class private
  private Singleton() {
	
  }
  
  //create the get method
  public static Singleton getInstance() {
	return instance;
  }
  
  
  public void showMessage() {
	System.out.println("This is from singleton class");
  }
  
  
}
