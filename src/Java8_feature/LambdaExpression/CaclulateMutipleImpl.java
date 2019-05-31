package Java8_feature.LambdaExpression;

public class CaclulateMutipleImpl {
  
  public static void main(String[] args) {
	
	engine((int x, int y) -> x + y);
	engine((int x, int y) -> x * y);
	engine((int x, int y) -> x - y);
	engine((int x, int y) -> x % y);
 
	engine((long x, long y) -> x + y);
	engine((long x, long y) -> x * y);
	engine((long x, long y) -> x - y);
	engine((long x, long y) -> x % y);
	
	
  }
  
  
  private static void engine(Calculator calculator) {
	
	int x = 2;
	int y = 4;
	
	int result = calculator.caculate(x, y);
	System.out.println(result);
	
  }
  
  private static void engine(LongCalculator longCalculator){
    
    long x = 34;
    long y = 45;
    
    long result = longCalculator.caculate(x, y);
	System.out.println(result);
  
  
  
  }
  
}

@FunctionalInterface
interface Calculator {
  
  int caculate(int x, int y);
  
}

@FunctionalInterface
interface LongCalculator{
  
  long caculate (long x, long y);
  
}