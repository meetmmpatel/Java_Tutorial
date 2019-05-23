package Thread.typeOf_threads;

public class ThreadJoinDemoTwo {
  
  public static void main(String[] args) {
	Thread first = new Thread(new TryThreadJoin("A","a",200));
	Thread secound = new Thread(new TryThreadJoin("B","b",400));
	Thread three = new Thread(new TryThreadJoin("C","c",700));
    
    first.start();
    secound.start();
    three.start();
    
    try {
      first.join();
	}
    catch (InterruptedException e){
	  System.out.println("Thread exceptions");
	}
  }
  
  
}


class TryThreadJoin implements Runnable {
  private String firstName;
  private String secondName;
  private long aWhile;
  private long total;
  
  public TryThreadJoin(String firstName, String secondName, long aWhile) {
	this.firstName = firstName;
	this.secondName = secondName;
	this.aWhile = aWhile;
  }
  
  
  @Override
  public void run() {
	
	try {
	  while (total < 1000) {
		
		System.out.print(firstName);
		Thread.sleep(aWhile);
		total += aWhile;
		System.out.print(secondName + "\n");
		
		
	  }
	} catch (InterruptedException e) {
	  System.out.println(firstName + secondName + e);
	  
	}
	System.out.println(secondName + "Thread Stopped");
	
  }
}