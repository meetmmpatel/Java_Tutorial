package Thread.typeOf_threads;

import java.io.IOException;

public class TryThread_Main {
  
  public static void main(String[] args) {
	
    Thread first = new Thread(new TryThisThread("T1","t1",200));
	Thread scound = new Thread(new TryThisThread("T2","t2",300));
	Thread three = new Thread(new TryThisThread("T3","t3",500));
 
	first.start();
	scound.start();
	three.start();
	
	first.stop();
	scound.stop();
	
 
	System.out.println("Ending Main..");
	
  }
  
  
}

class TryThisThread implements Runnable {
  
  private String firstName;
  private String secoundName;
  private long aWhile;
  
  public TryThisThread(String firstName, String secoundName, long aWhile) {
	this.firstName = firstName;
	this.secoundName = secoundName;
	this.aWhile = aWhile;
  }
  
  @Override
  public void run() {
	try {
	  
	  while (true) {
		System.out.println(firstName);
		Thread.sleep(aWhile);
		System.out.println(secoundName + "\n");
	  }
	  
	} catch (InterruptedException e) {
	  System.out.println(firstName + secoundName + e);
	}
	
	
  }
}
