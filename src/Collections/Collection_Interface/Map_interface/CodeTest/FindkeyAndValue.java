package Collections.Collection_Interface.Map_interface.CodeTest;

import java.util.HashMap;

public class FindkeyAndValue {
  /*
  The Original map: {Red=1, White=4, Blue=5, Black=3, Green=2}
  1. Is key 'Green' exists?
  yes! - 2
  
  2. Is key 'orange' exists?
  no!
   */
  
  
  public static void main(String[] args) {
	
	HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
	hash_map.put("Red", 1);
	hash_map.put("Green", 2);
	hash_map.put("Black", 3);
	hash_map.put("White", 4);
	hash_map.put("Blue", 5);
	
	System.out.println("The Original map: " + hash_map);
	
	System.out.println("1. Is key 'Green' exists? ");
	if (hash_map.containsKey("Green")) {
	  System.out.println("yes! -  " + hash_map.get("Green"));
	} else {
	  System.out.println("no");
	}
	
	System.out.println("Is key 'orange' exists?");
	if (hash_map.containsKey("orange")) {
	  System.out.println("Yes !");
	} else {
	  System.out.println("no! ");
	}
	
	
  }
  
  
}
