package Java8_feature.LambdaExpression;

import java.util.function.IntFunction;

public class Recursive_Lambda {
  
  //Recursive = method that call itself ..
  
  
  public static void main(String[] args) {
	
	IntFunction<Long> longIntFunction = Recursive_Lambda::factorial;
	System.out.println(longIntFunction.apply(10));
	
	
  }
  
  
  public static long factorial(int n) {
	if (n == 0) {
	  return 1;
	} else {
	  
	  //this is example of recursive method
	  return n * factorial(n - 1);
	}
	
  }
}
