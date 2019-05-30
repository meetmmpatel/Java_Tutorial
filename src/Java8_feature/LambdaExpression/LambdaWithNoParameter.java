package Java8_feature.LambdaExpression;

public class LambdaWithNoParameter {
  
  public static void main(String[] args) {
	
	//Lambda expression
	//1. Call the interface
	//2. have args if any
	//3. body of method
	
	MyInterfaceOne msg = () -> {
	  return "Hello";
	};
	
	System.out.println(msg.sayHello());
	
	
	MyInterfaceTwo two = (a) -> {
	  return a + 5;
	};
	
	System.out.println(two.incrementByFive(5));
	
	
	MyInterfaceThree printString = (str1, str2) -> {
	  return str1 + str2;
	};
 
	System.out.println(printString.stringConcat("Hey","Hello!"));
	
	
  }
  
  
}


@FunctionalInterface
interface MyInterfaceOne {
  
  //You can only have one method in your interface ..
  
  public String sayHello();
  
  
}


@FunctionalInterface
interface MyInterfaceTwo {
  
  public int incrementByFive(int a);
  
}


interface MyInterfaceThree {
  
  public String stringConcat(String str1, String str2);
  
}