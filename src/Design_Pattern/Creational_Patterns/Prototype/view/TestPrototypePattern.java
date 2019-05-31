package Design_Pattern.Creational_Patterns.Prototype.view;

public class TestPrototypePattern {
  
  public static void main(String[] args) throws CloneNotSupportedException {
	
	
	String moviePrototype =
			PrototypeFactory.getInsatnce(PrototypeFactory.ModelType.MOVIE).toString();
	System.out.println(moviePrototype);
	
	String albumPrototype =
			PrototypeFactory.getInsatnce(PrototypeFactory.ModelType.ALBUM).toString();
	System.out.println(albumPrototype);
	
	String showPrototype =
			PrototypeFactory.getInsatnce(PrototypeFactory.ModelType.SHOW).toString();
	System.out.println(showPrototype);
	
	
  }
}
