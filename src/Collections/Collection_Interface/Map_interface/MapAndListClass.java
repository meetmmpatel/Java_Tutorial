package Collections.Collection_Interface.Map_interface;

import java.util.*;

public class MapAndListClass {
  
  
  public static void main(String[] args) {
	
	//This is how you define the map ..
	
	Map<Integer, String> hmap = new HashMap<>();
	
	hmap.put(1, "Java");
	hmap.put(2, "C");
	hmap.put(3, "python");
	hmap.put(4, "ruby");
	hmap.put(4, "terminal");
	
	System.out.println(hmap);
	System.out.println("Size of map	" + hmap.size());
	
	//How we can loop the map and print each element
	Collection collection = hmap.values();
	Iterator iterator = collection.iterator();
	
	while (iterator.hasNext()) {
	  System.out.println(iterator.next());
	  
	}
	
//	Iterator itr = hmap.values().iterator();
//	System.out.println("Values " + itr.toString());
	
	//Using for loop we can print the key of map
	for (Iterator it = hmap.keySet().iterator(); it.hasNext();){
	  System.out.println("Print the key of map "+ it.next());
	}
	
	
	//How to make map object thead safe
	Map map = Collections.synchronizedMap(hmap);
	
	
	//if you want to check the key and values
	boolean keyExists = hmap.containsKey(3);
	System.out.println("Is key listed  " + keyExists);
	
	boolean valueExits = hmap.containsValue("python");
	System.out.println("Is value listed  " + valueExits);
	
	
  }
  
  
}
