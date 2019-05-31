package Java8_feature.MethodReferences;

import java.util.function.BiFunction;

public class MethodRefStatic {
  
  
  public static void main(String[] args) {
	
	BiFunction<Integer, Integer, Integer> result = Multiplication::multiply;
	int numbers = result.apply(10, 5);
	System.out.println("Result is :: " + numbers);
	
	
  }
  
  
}


class Multiplication {
  
  public static int multiply(int numOne, int numTwo) {
	
	return numOne * numTwo;
  }
  
  
}
