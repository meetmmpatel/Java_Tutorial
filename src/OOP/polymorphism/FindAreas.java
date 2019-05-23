package OOP.polymorphism;

public class FindAreas {
  
  public static void main(String[] args) {
	
	Figure figure = new Figure(10, 10);
	
	Rectangle rectangle = new Rectangle(9, 5);
	
	Triangle triangle = new Triangle(10, 8);
	
	
    Figure fi = figure;
	System.out.println("Area is " + fi.area());
	
	fi = rectangle;
	System.out.println("Area is " + fi.area());
	
	fi = triangle;
	System.out.println("Area is " + fi.area());
	
  }
  
}

class Figure {
  
  double dimOne;
  double dimTwo;
  
  public Figure(double dimOne, double dimTwo) {
	this.dimOne = dimOne;
	this.dimTwo = dimTwo;
  }
  
  double area() {
	System.out.println("Area for Figure is undefined");
	return 0;
  }
}

class Rectangle extends Figure {
  
  
  public Rectangle(double dimOne, double dimTwo) {
	super(dimOne, dimTwo);
  }
  
  //OverRide the area method in Figure class
  
  double area() {
	System.out.println("Inside Area for Rectangle");
	return dimOne * dimTwo;
	
  }
  
  
}

class Triangle extends Figure {
  
  public Triangle(double dimOne, double dimTwo) {
	super(dimOne, dimTwo);
  }
  
  //Override area method
  
  double area() {
	System.out.println("Inside Area for Triangle");
	return dimOne * dimTwo;
	
  }
  
  
}
