package CodeTest;

import java.io.File;
import java.io.IOException;

public class TestClass {
  
  public static void main(String[] args){
	String parent = null;
	File file = new File("/file.txt");
	System.out.println(file.getPath());
	System.out.println(file.getAbsolutePath());
	try {
	  System.out.println(file.getCanonicalPath());
	} catch (IOException e) {
	  // TODO Auto-generated catch block
	  e.printStackTrace();
	}
  }
}
