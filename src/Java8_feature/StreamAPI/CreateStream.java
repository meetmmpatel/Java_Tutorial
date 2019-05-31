package Java8_feature.StreamAPI;

import java.util.stream.Stream;

public class CreateStream {
  
  public static void main(String[] args) {
  
  
	Stream<String> stringStream = Stream.of("XML", "Java",  "CSS", "SQL");
	
	stringStream.forEach(System.out::println);
	
	
	String[] names = { "XML", "Java", "SQL", "CSS" };
  	
    Stream<String> stream = Stream.of(names);
    
    stream.forEach(System.out::println);
	
  }
  
  
}
