package Collections.Collection_Interface.Lint_Interface.Intro_to_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_about_List {
  
  public static void main(String[] args) {
  
	List<String> list_Strings = new ArrayList<String>();
	list_Strings.add("Red");
	list_Strings.add("Green");
	list_Strings.add("Orange");
	list_Strings.add("White");
	list_Strings.add("Black");
 
	
	// this is print the arrayList
	System.out.println("Original Color list: " + list_Strings);
 
	//this is to add one  element at time
    list_Strings.add("Purple");
  
	System.out.println("Color list with element added : " + list_Strings);
 
 
	List<String> list_OfSumColor = new ArrayList<String>();
	list_OfSumColor.add("Blue");
	list_OfSumColor.add("Pink");
 
	System.out.println("Another List of color " + list_OfSumColor);
 
	System.out.println("Add another list in main list "
			+ list_Strings.addAll(list_OfSumColor));
	System.out.println(list_Strings);
	
	//Clear the list
	list_Strings.clear();
	System.out.println("List is cleared " + list_Strings);
	
	
	//find out if element is exist in side the list ?
 
	System.out.println(list_OfSumColor.contains("Pink"));
	System.out.println(list_OfSumColor.contains("Red"));
	
	//Ensure if there is a capacity
	
	ArrayList<Integer> numList = new ArrayList<>();
	numList.ensureCapacity(20);
	System.out.println(numList);
	
	//Get method
	ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","d","e","f"));
 
	System.out.println(list);
	
	String firstElement = list.get(3);
	System.out.println(firstElement);
	
	//find element using index number
	
	int strIndex = list.indexOf("e");
	System.out.println(strIndex);
 
 // Print the list using loop
	for (String s: list) {
	  System.out.println(s);
	  
	}
	String [] strArr = {"as","is","to","be"};
	ArrayList<String> someList = new ArrayList<>(Arrays.asList(strArr));
	System.out.println(someList);
  
  }
  
  
}
