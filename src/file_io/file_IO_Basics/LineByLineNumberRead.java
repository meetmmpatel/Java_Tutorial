package file_io.file_IO_Basics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.SortedMap;

public class LineByLineNumberRead {
  
  
  public static void main(String[] args) throws IOException {
    readFromFile("testFileThree.txt");
	
  }
  
  private static void readFromFile(String fileName) throws IOException {
  
	LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(fileName));
	
	
	//Print the initial line number
	System.out.println("Line" + lineNumberReader.getLineNumber());
	
	//Setting initial line number
	lineNumberReader.setLineNumber(10);

	
	//get current line number
	System.out.println("Line" + lineNumberReader.getLineNumber());
 
	
	String str = null;
	
	while ((str = lineNumberReader.readLine()) != null){
	  
	  System.out.println("Line " + lineNumberReader.readLine());
	}
 
	lineNumberReader.close();
  
  }
  
  
}
