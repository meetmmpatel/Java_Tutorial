package Thread.typeOf_threads;

public class Intro_Thread extends Thread {
  
  @Override
  public void run(){
	System.out.println("Inside : " + Thread.currentThread().getName());
  
  }
  
  public static void main(String[] args) {
  
	System.out.println("Inside main method :  " + Thread.currentThread().getName());
 
	System.out.println("Creating thread...");
	Thread thread = new Intro_Thread();
 
	System.out.println("Starting thread...");
	thread.start();
  
  }


}
