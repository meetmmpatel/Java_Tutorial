package file_io.file_IO_Basics;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class ReadOnly_File {
  
  public static void main(String[] args) throws IOException {
    readOnlyUsingSetWritable();
	
  }
  
  public static void readOnlyUsingSetWritable()throws IOException {
  
	File readOnly = new File("testFileSix.txt");
	
	//This is how you can set file to be read only
	boolean flag = readOnly.setReadOnly();
	
	//this is another way of setting file to read only
//	boolean rw = readOnly.setWritable(true);
	
	if(flag == true){
	  
	  System.out.println("File is read only");
	  
	}else {
	  System.out.println("File is not read only");
	}
 
	FileWriter writer = new FileWriter(readOnly);
	writer.write("Please test this readonly file");
	writer.close();
		
  
  }
  
}
