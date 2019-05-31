package Design_Pattern.Creational_Patterns.Prototype;

import java.util.Hashtable;

public class Main {
  public static void main(String[] args) {
	
    ShapeProtoType.loadCache();
    
    Shape shapeCloned = ShapeProtoType.getShape("1");
	System.out.println("Shape: " + shapeCloned.getType());
	System.out.println("shapeCloned" + shapeCloned.hashCode());
  
	Shape shapeCloned2 = ShapeProtoType.getShape("2");
	System.out.println("Shape: " + shapeCloned2.getType());
	System.out.println("shapeCloned2" + shapeCloned2.hashCode());
 
	Shape shapeCloned3 = ShapeProtoType.getShape("3");
	System.out.println("Shape: " + shapeCloned3.getType());
	System.out.println("shapeCloned3" + shapeCloned3.hashCode());
  
  }
  
  
}

abstract class Shape implements Cloneable {
  private String id;
  protected String type;
  
  abstract void draw();
  
  public String getId() {
	return id;
  }
  
  public void setId(String id) {
	this.id = id;
  }
  
  public String getType() {
	return type;
  }
  
  public Object clone() {
	Object clone = null;
	try {
	  clone = super.clone();
	} catch (CloneNotSupportedException e) {
	  System.out.println("Cloning not supported");
	}
	
	return clone;
	
  }
}


class Rectangle extends Shape {
  
  public Rectangle() {
	type = "Rectangle";
  }
  
  @Override
  void draw() {
	System.out.println("Inside Rectangle :: draw method");
	
  }
}

class Square extends Shape {
  
  public Square() {
	type = "Square";
  }
  
  @Override
  void draw() {
	System.out.println("Inside Square :: draw method");
	
  }
}

class Circle extends Shape {
  
  public Circle() {
	type = "Circle";
  }
  
  @Override
  void draw() {
	System.out.println("Inside Circle :: draw method");
	
  }
}

class ShapeProtoType {
  
  private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();
  
  
  public static Shape getShape(String shapeId) {
	Shape cachedShape = shapeHashtable.get(shapeId);
	return (Shape) cachedShape.clone();
  }
  
  public static void loadCache() {
	
	Circle circle = new Circle();
	circle.setId("1");
	shapeHashtable.put(circle.getId(), circle);
	
	Square square = new Square();
	square.setId("2");
	shapeHashtable.put(square.getId(), square);
	
	Rectangle rectangle = new Rectangle();
	rectangle.setId("3");
	shapeHashtable.put(rectangle.getId(), rectangle);
	
	
  }
  
  
}

