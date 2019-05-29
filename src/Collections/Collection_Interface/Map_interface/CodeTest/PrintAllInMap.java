package Collections.Collection_Interface.Map_interface.CodeTest;

import java.util.Map;
import java.util.TreeMap;

public class PrintAllInMap {
  /*
  1 Red
  2 Green
  3 Black
  4 White
  5 Blue
   */
  
  public static void main(String[] args) {
	
	TreeMap<Integer, String> treeMap = new TreeMap<>();
	
	treeMap.put(1, "Red");
	treeMap.put(2, "Green");
	treeMap.put(4, "White");
	treeMap.put(5, "Blue");
	treeMap.put(3, "Black");
 
	System.out.println(treeMap);
	
	//for each loop?
	
	for (Map.Entry x : treeMap.entrySet()){
	  System.out.println(x.getKey()+" "+x.getValue());
	}
	
	//Size of map ??
	System.out.println("Size of map " + treeMap.size());
	
  }
}
