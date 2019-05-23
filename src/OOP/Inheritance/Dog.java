package OOP.Inheritance;

public class Dog extends Animal {
  
  public Dog(String name) {
	super(name);
  }
  
  public static void main(String[] args) {
	Animal animal = new Dog("Rex");
	System.out.println(animal);
	
	Dog dog = new Dog("Rex");
	System.out.println(dog);
	
  }
}


class Animal {
  
  private String type;
  
  public Animal(String type) {
	this.type = type;
  }
  
  @Override
  public String toString() {
	return "Animal{" +
			"type='" + type + '\'' +
			'}';
  }
}
