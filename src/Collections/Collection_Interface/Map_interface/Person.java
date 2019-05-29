package Collections.Collection_Interface.Map_interface;

import java.util.Objects;

public class Person implements Comparable {
  
  private String firstName;
  private String lastName;
  
  public Person() {
  }
  
  public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
  }
  
  public String getFirstName() {
	return firstName;
  }
  
  public void setFirstName(String firstName) {
	this.firstName = firstName;
  }
  
  public String getLastName() {
	return lastName;
  }
  
  public void setLastName(String lastName) {
	this.lastName = lastName;
  }
  
  @Override
  public int compareTo(Object o) {
	Person person = (Person) o;
	int deptComp = firstName.compareTo(person.getFirstName());
	return ((deptComp == 0) ? lastName.compareTo(getFirstName()) : deptComp);
  }
  
  @Override
  public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof Person)) return false;
	Person person = (Person) o;
	return Objects.equals(getFirstName(), person.getFirstName()) &&
			Objects.equals(getLastName(), person.getLastName());
  }
  
  @Override
  public int hashCode() {
	return Objects.hash(getFirstName(), getLastName());
  }
  
  @Override
  public String toString() {
	return "Person{" +
			"firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			'}';
  }
}
