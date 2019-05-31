package Java8_feature.OptionalClass;

import java.util.Optional;

public class OptionalClassWithMethods {
  
  public static void main(String[] args) {
	
	
	//Creating optinal object for string
	Optional<String> GOT = Optional.of("Game of Thornes");
	
	//empty() will create variable as empty value;
	Optional<String> noValue = Optional.empty();
	
	//isPresent() method will check if variable is empty or not;
	
	if (GOT.isPresent()) {
	  System.out.println("Watching Game of thrones");
	} else {
	  System.out.println("Nothing is there!!");
	}
	
	
	//ifPresent() method will execute only if given optional
	//object is non-empty
	
	
	GOT.ifPresent(s -> System.out.println("Watching the GOT"));
	
	
	//it will not print this line since ifPresent() method
	//on check variable if it's not empty;
	
	noValue.ifPresent(s -> System.out.println("this is empty"));
	
	
	//Optional orElse() and orElseGet() methods
	//two methods orElse() and orElseGet() returns the value of Optional Object
	// if it is no empty, if the object is empty then it returns
	// the default value passed to this method as an argument.
	
	
	//OrElse() Method
	
	System.out.println(GOT.orElse("Print the default value"));
	System.out.println(noValue.orElse("Print the default value"));
	
	//orElseGet() method
	System.out.println(GOT.orElseGet(() -> "Default value"));
	System.out.println(noValue.orElseGet(() -> "Default value"));
	
	//Filter method
	System.out.println(GOT.filter(s -> s.equals("GAME")));
	System.out.println(GOT.filter(s -> s.equalsIgnoreCase("GAME of Thornes")));
	
  }
  
  
}
