package Collections.Collection_Interface.List_Interface.Intro_to_ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayList_usingPojo {
  
  public static void main(String[] args) {
  
	Employee employee = new Employee();
	
	employee.setEmpId(20);
	employee.setEmpName("John Smith");
	employee.setAddress("100 Main st");
	employee.setLocalDate(LocalDate.now());
  
	ArrayList<Employee> employeeArrayList = new ArrayList<>();
	
	employeeArrayList.add(new Employee
			(10,"Josh","120 Main st", LocalDate.now()));
	
	employeeArrayList.add(employee);
  
	System.out.println(employeeArrayList);
  
  
  
  }
}
