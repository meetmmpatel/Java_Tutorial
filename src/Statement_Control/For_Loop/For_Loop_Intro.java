package Statement_Control.For_Loop;

public class For_Loop_Intro {
  
  public static void main(String[] args) {

//    Simple for loop
	for (int i = 0; i < 5; i++) {
	  System.out.println(i + " ");
	}


// when variable is declared out side of loop
	
	int j = 0;
	for (; j < 3; j++) {
	  System.out.println(j);
	}
	// j is visible here
	
	int m = 0;
	for (; ; ) {
	  System.out.println(m);
	  m++;
	  if (m > 4) {
		break;
	  }
	}
	
	//numeric calculation of for loop
	
	int limit = 20; // Sum from 1 to this value
	int sum = 0;    // Accumulate sum in this variable
	
	for (int i = 1; i <= limit; i++) {
	  sum = sum + i;
	}
	System.out.println("sum = " + sum);
	
	
	//multiple variable in one for loop
	for (int i = 0, X = 1, k = 2; i < 5; i++) {
	  System.out.println("I : " + i + ",X : " + X + ", k : " + k);
	}
	
  }
  
}
