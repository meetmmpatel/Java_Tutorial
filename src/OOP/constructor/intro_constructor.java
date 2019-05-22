package OOP.constructor;

public class intro_constructor {
  
  int empId;
  String empName;
  
  //no-arg const
  public intro_constructor() {
	System.out.println("This is no-arg constructor");
  }
  
  //Parametrized constructor
  public intro_constructor(int id, String name){
    
    this.empId = id;
    this.empName = name;
  }
  
  public static void main(String[] args) {
	
    intro_constructor ic = new intro_constructor();
    intro_constructor ic2 = new intro_constructor(22,"testuser");
	System.out.println(ic2);
  
  }
  
  @Override
  public String toString() {
	return "intro_constructor{" +
			"empId=" + empId +
			", empName='" + empName + '\'' +
			'}';
  }
}
