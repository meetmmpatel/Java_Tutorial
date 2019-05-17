package Statement_Control.for_each_loop;

import java.util.ArrayList;

public class for_each_with_enum {
  
  enum Season {
	spring, summer, fall, winter
  }
  
  public static void main(String[] args) {
	for (Season season : Season.values()) {
	  System.out.println(" The season is now " + season);
	}
	
	
	//For each loop with simple Array
	char[] vowels = { 'a', 'e', 'i', 'o', 'u'};
 
	for(char ch: vowels){
	  System.out.println(ch);
	}
	
	//For each loop with ArrayList
 
	ArrayList<Double> list = new ArrayList<Double>();
 
	list.add(10.14);
	list.add(20.22);
	list.add(30.78);
	list.add(40.46);
 
	double sum = 0.0;
	for(double itr : list)
	  sum = sum + itr;
	System.out.println(sum);
  }
  
}
