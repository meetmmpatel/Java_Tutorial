package file_io.file_IO_Basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile_String {
  
  public static void main(String[] args) {
	System.out.println(readAllFile("testFileTwo.txt"));
	
  }
  
  
  private static String readAllFile(String fileName) {
	String content = "";
	
	try {
	  content = new String(Files.readAllBytes(Paths.get(fileName)));
	} catch (IOException e) {
	  System.out.println("there is an issue");
	}
	return content;
  }
  
}
