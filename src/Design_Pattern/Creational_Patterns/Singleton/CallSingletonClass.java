package Design_Pattern.Creational_Patterns.Singleton;

public class CallSingletonClass {
  
  public static void main(String[] args) {
    
    SingletonwithDoubleCheck doubleCheck = SingletonwithDoubleCheck.getInstance();
	System.out.println(doubleCheck.hashCode());
	int num = doubleCheck.getSum(20,20);
	System.out.println(num);
 
	SingletonwithDoubleCheck doubleCheckOne = SingletonwithDoubleCheck.getInstance();
	System.out.println(doubleCheckOne.hashCode());
	int numTwo = doubleCheckOne.getSum(30,30);
	System.out.println(numTwo);
	
  }
}
