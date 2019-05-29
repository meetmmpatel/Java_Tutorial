package Collections.Collection_Interface.List_Interface.Intro_to_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro_ArrayList {
  
  
  public static void main(String[] args) {
	
	
	List<Integer> numList = new ArrayList<Integer>();
	
	//Name of interface
	// diamond shape type of data
	//name if object
	
	System.out.println(numList);
	System.out.println(numList.size());
	
	numList.add(24);
	
	numList.add(1, 50);
	numList.add(2, 55);
	numList.add(3, 60);
	numList.add(0, 60);
	numList.add(1, 50);
	numList.add(2, 55);
	numList.add(3, 60);
	numList.add(0, 60);
	
	System.out.println(numList);
	
	
	ArrayList<String> stringArrayList = new ArrayList<>();
	System.out.println(stringArrayList);
	
	int arr[] = new int[5];
	
	System.out.println(Arrays.toString(arr));
	
	arr[3] = 45;
	arr[2] = 55;
	System.out.println(Arrays.toString(arr));
  }
  
}
