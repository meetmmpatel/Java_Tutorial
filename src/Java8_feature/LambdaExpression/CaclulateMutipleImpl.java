package Java8_feature.LambdaExpression;

public class CaclulateMutipleImpl {
  
  public static void main(String[] args) {
	
	engine((x, y) -> x + y);
	engine((x, y) -> x * y);
	engine((x, y) -> x - y);
	engine((x, y) -> x % y);
	
	
  }
  
  
  private static void engine(Calculator calculator) {
	
	int x = 2;
	int y = 4;
	
	int result = calculator.caculate(x, y);
	System.out.println(result);
	
  }
  
}

@FunctionalInterface
interface Calculator {
  
  int caculate(int x, int y);
  
}

interface LongCalculator{
  
  long caculate (long x, long y);
  
}