package Collections.Collection_Interface.Lint_Interface.Intro_to_ArrayList.CodeTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintEachElement {
  public static void main(String[] args) {
	
	List<String> list_Strings = new ArrayList<String>();
	list_Strings.add("Red");
	list_Strings.add("Green");
	list_Strings.add("Orange");
	list_Strings.add("White");
	list_Strings.add("Black");
	
	//For Each loop
	for (String s : list_Strings) {
	  System.out.println("For each loop  " + s);
	  
	}
 
	
	//Using Iterator Class
	Iterator<String> iterator = list_Strings.iterator();
	
	while (iterator.hasNext()){
	  System.out.println("Using Iterator  " + iterator.next());
	}
	
	
	//Simple for loop
	for (int i = 0; i < list_Strings.size(); i++){
	  System.out.println(list_Strings.get(i));
	}
	
  }
}
