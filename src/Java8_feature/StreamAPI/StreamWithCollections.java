package Java8_feature.StreamAPI;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamWithCollections {
  
  public static void main(String[] args) {
	
	HashSet<String> hashSet = new HashSet<>();
	
	hashSet.add("Java");
	hashSet.add("Python");
	hashSet.add("C");
	
	Stream<String> stream = hashSet.stream();
	stream.forEach(System.out::println);
	
	LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
	hashMap.put("One", "Java");
	hashMap.put("Two", "Pyhton");
	
	
	System.out.println(hashMap.entrySet().stream().filter(x -> x.getKey() == "Two")
			.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue())));
	
	
  }
  
  
}
