package Thread.typeOf_threads;

public class Intro_Runnable implements Runnable {
  
  
  @Override
  public void run() {
	System.out.println("Inside run method "
			+ Thread.currentThread().getName());
  }
  
  public static void main(String[] args) {
	
	
	System.out.println("Inside main method :  " + Thread.currentThread().getName());
	
	System.out.println("Creating thread...");
	Runnable thread = new Intro_Runnable();
	
	System.out.println("Starting thread...");
	thread.run();
	
	
  }
  
  
}
