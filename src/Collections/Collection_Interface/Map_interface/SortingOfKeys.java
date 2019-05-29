package Collections.Collection_Interface.Map_interface;

import java.util.*;

public class SortingOfKeys {
  
  
  public static void main(String[] args) {
	
	HashMap<Integer, String> hmap = new HashMap<>();
	
	hmap.put(5, "A");
	hmap.put(11, "C");
	hmap.put(4, "Z");
	hmap.put(77, "Y");
	hmap.put(9, "P");
	hmap.put(66, "Q");
	hmap.put(0, "R");
	
	System.out.println("Before sorting " + hmap);
	
	Set set = hmap.entrySet();
	Iterator iterator = set.iterator();
	
	while (iterator.hasNext()) {
	  
	  Map.Entry me = (Map.Entry) iterator.next();
	  System.out.println(me.getKey() + " : " + me.getValue());
	  
	}
	
	Map<Integer, String> map = new TreeMap<>(hmap);
	System.out.println(map);
	
	Set set1 = map.entrySet();
	Iterator iterator1 = set1.iterator();
	
	while (iterator1.hasNext()) {
	  Map.Entry me = (Map.Entry) iterator1.next();
	  System.out.println("After sorting " + me.getKey() + ": " + me.getValue());
	}
	
	//how to check if map object is empty or not
	System.out.println("Is map empty: " + map.isEmpty());
	System.out.println("Is hmap empty: " + hmap.isEmpty());
	
  }
}
