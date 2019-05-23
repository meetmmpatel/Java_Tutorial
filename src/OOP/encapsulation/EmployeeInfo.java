package OOP.encapsulation;

public class EmployeeInfo {
  
  
  public static void main(String[] args) {
	
	EmpCount empOne = new EmpCount();
	empOne.setEmpId(11);
	empOne.setEmpAge(30);
	empOne.setEmpFirstName("Josh");
	empOne.setEmpLastName("Smith");
	
	System.out.println("Id = " + empOne.getEmpId()
			+ " Age " + empOne.getEmpAge() + "First Name " + empOne.getEmpFirstName()
			+ "Last Name " + empOne.getEmpLastName()
	);
	
	EmpCount empTwo = new EmpCount();
	empTwo.setEmpId(12);
	
	
  }
}
