package Collections.Collection_Interface.Map_interface.CodeTest;

import java.util.HashMap;

public class CombineTwoMaps {
  /*
  Values in first map: {1=Red, 2=Green, 3=Black}
  Values in second map: {4=White, 5=Blue, 6=Orange}

  Now values in second map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue, 6=
  Orange}
  
  	Is hash map empty: false
	Is hash map empty: true
   */
  
  public static void main(String[] args) {
  
	HashMap<Integer,String> hash_map1 = new HashMap <Integer,String> ();
	HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
	// populate hash maps
	hash_map1.put(1, "Red");
	hash_map1.put(2, "Green");
	hash_map1.put(3, "Black");
	System.out.println("\nValues in first map: " + hash_map1);
	hash_map2.put(4, "White");
	hash_map2.put(5, "Blue");
	hash_map2.put(6, "Orange");
	System.out.println("\nValues in second map: " + hash_map2);
  
 
	hash_map2.putAll(hash_map1);
	System.out.println("Now values in second map: " + hash_map2);
 
	boolean result = hash_map2.isEmpty();
	System.out.println("Is hash map empty: " + result);
	
	hash_map2.clear();
	
	result = hash_map2.isEmpty();
 
	System.out.println("Is hash map empty: " + result);
  
  }
  
  
}
