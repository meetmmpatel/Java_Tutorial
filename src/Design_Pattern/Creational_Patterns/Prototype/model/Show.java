package Design_Pattern.Creational_Patterns.Prototype.model;

import Design_Pattern.Creational_Patterns.Prototype.contract.PrototypeCapable;

public class Show implements PrototypeCapable {
  private String name = null;
  
  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	this.name = name;
  }
  
  @Override
  public PrototypeCapable clone() throws CloneNotSupportedException {
	System.out.println("Cloning Show object ....");
	return (PrototypeCapable) super.clone();
	
  }
  
  @Override
  public String toString() {
	return "Album{" +
			"name='" + "Show" + '\'' +
			'}';
  }
}
