package Design_Pattern.Creational_Patterns.Prototype.contract;

public interface PrototypeCapable extends Cloneable{
  
  PrototypeCapable clone() throws CloneNotSupportedException;
}
