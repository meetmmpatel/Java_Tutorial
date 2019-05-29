package Collections.Collection_Interface.Map_interface.CodeTest;

import Collections.Collection_Interface.Map_interface.Person;

import java.util.*;

public class ReadPojoWithMap {
  
  public static void main(String[] args) {
	
	Person person = new Person();
	person.setFirstName("SetUser");
	person.setLastName("Setlastname");
	
	
	HashMap<Integer, Person> hashMap = new HashMap<>();
	
	
	hashMap.put(11, new Person("Test", "testUseOne"));
	hashMap.put(12, new Person("Josh", "SomeName"));
	hashMap.put(13, new Person("Mike", "Mike"));
	hashMap.put(14, person);
	
	System.out.println(hashMap);
 
	List<Person> people = (List<Person>) hashMap.values();
	
	ArrayList<String> list = new ArrayList<String>();
 
	System.out.println(list);
	
	
	
	
  }
}

class PersonComparator implements Comparator<Person> {
  
  
  @Override
  public int compare(Person o1, Person o2) {
	
	int nameComp = o1.getLastName().compareTo(o2.getLastName());
	return ((nameComp == 0) ? o1.getFirstName().compareTo(o2.getFirstName()) :
			nameComp);
	
  }
}

