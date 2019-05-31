package Java8_feature.LambdaExpression;

import java.util.function.Function;

public class LoopsWithLambda {
  
  public static void main(String[] args) {
	
	Function<String, String> function = y -> {
	  
	  for (int i = 0; i < 10; i++) {
		System.out.println(i);
		
		if (i == 4) {
		  System.out.println("This is four");
		  continue;
		}
		
	  }
	  
	  return y + "Some String";
	};
 
	System.out.println(function.apply("Hi"));
  }
}
