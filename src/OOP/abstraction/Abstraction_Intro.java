package OOP.abstraction;

public class Abstraction_Intro {
  
  public static void main(String[] args) {
	
	Dog dog = new Dog();
	dog.sound();
	dog.move();
	dog.eatAndDrink();
	
	Hourse hourse = new Hourse();
	hourse.sound();
	hourse.move();
	hourse.eatAndDrink();
	
  }
  
}

interface myInterface{

}


abstract class Animal {
  
  abstract void sound();
  
  abstract void move();
  
  abstract void eatAndDrink();
  
  
}

class Dog extends Animal {
  
  @Override
  void sound() {
	
	System.out.println("Dog sound");
	
  }
  
  @Override
  void move() {
	System.out.println("Dog move");
	
  }
  
  @Override
  void eatAndDrink() {
	System.out.println("Dog Eat");
	
  }
}

class Hourse extends Animal {
  
  @Override
  void sound() {
	System.out.println("Hoarse sound");
	
  }
  
  @Override
  void move() {
	System.out.println("Hoarse move");
  }
  
  @Override
  void eatAndDrink() {
	System.out.println("Hoarse eat");
	
  }
}





