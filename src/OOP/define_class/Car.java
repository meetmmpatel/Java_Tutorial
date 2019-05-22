package OOP.define_class;

public class Car {
  
  int numOfWheel;
  String color;
  String engineType;
  String modelName;
  
  
  public Car(int numOfWheel, String color, String engineType, String modelName) {
	
	this.numOfWheel = numOfWheel;
	this.color = color;
	this.engineType = engineType;
	this.modelName = modelName;
	
  }
  
  
  @Override
  public String toString() {
	return "Car{" +
			"numOfWheel=" + numOfWheel +
			", color='" + color + '\'' +
			", engineType='" + engineType + '\'' +
			", modelName='" + modelName + '\'' +
			'}';
  }
}
