package Collections.Collection_Interface.Map_interface.CodeTest;

import java.util.TreeMap;

public class FirstAndLastKey {
  /*
  Orginal TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}
  Greatest key: C1
  Least key: C4
   */
  public static void main(String[] args) {
	TreeMap <String,String> tree_map1 = new TreeMap<String,String>();
 
	// Put elements to the map
	tree_map1.put("C2", "Red");
	tree_map1.put("C1", "Green");
	tree_map1.put("C4", "Black");
	tree_map1.put("C3", "White");
 
	System.out.println("Orginal TreeMap content: " + tree_map1);
	System.out.println("Greatest key: " + tree_map1.firstKey());
	System.out.println("Least key: " + tree_map1.lastKey());
	
  }
}
