package Java8_feature.StreamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class StreamWithPojo {
  
  public static void main(String[] args) {
	
	System.out.println(employees());
	
	
	//Only want to print female employee...
	
	StreamWithPojo.employees().stream().filter(Employee::isFemale)
			.map(Employee::getEmpName)
			.forEach(System.out::println);
	
	
	StreamWithPojo.employees().stream().filter(Employee::isMale)
			.filter(p -> p.getIncome() > 2500)
			.map(Employee::getEmpName)
			.forEach(System.out::println);
	
	
  }
  
  
  public static List<Employee> employees() {
	
	Employee empOne =
			new Employee(11, "Josh",
					Employee.Gender.MALE, LocalDate.now(), 2300);
	
	Employee empTwo =
			new Employee(12, "Jane",
					Employee.Gender.FEMALE, LocalDate.now(), 7100);
	
	Employee empThree =
			new Employee(13, "Jeny",
					Employee.Gender.FEMALE, LocalDate.now(), 1800);
	
	Employee empfour =
			new Employee(14, "Jason",
					Employee.Gender.MALE, LocalDate.now(), 3200);
	
	List<Employee> employees = Arrays.asList(empOne, empTwo, empThree, empfour);
	
	return employees;
	
  }
  
}


class Employee {
  
  public static enum Gender {
	MALE, FEMALE
  }
  
  
  private long empId;
  private String empName;
  private Gender gender;
  private LocalDate dob;
  private double income;
  
  public Employee(long empId, String empName, Gender gender, LocalDate dob, double income) {
	this.empId = empId;
	this.empName = empName;
	this.gender = gender;
	this.dob = dob;
	this.income = income;
  }
  
  public long getEmpId() {
	return empId;
  }
  
  public void setEmpId(long empId) {
	this.empId = empId;
  }
  
  public String getEmpName() {
	return empName;
  }
  
  public void setEmpName(String empName) {
	this.empName = empName;
  }
  
  public Gender getGender() {
	return gender;
  }
  
  public void setGender(Gender gender) {
	this.gender = gender;
  }
  
  public LocalDate getDob() {
	return dob;
  }
  
  public void setDob(LocalDate dob) {
	this.dob = dob;
  }
  
  public double getIncome() {
	return income;
  }
  
  public void setIncome(double income) {
	this.income = income;
  }
  
  public boolean isMale() {
	return this.gender == Gender.MALE;
  }
  
  public boolean isFemale() {
	return this.gender == Gender.FEMALE;
  }
  
  @Override
  public String toString() {
	return "Employee{" +
			"empId=" + empId +
			", empName='" + empName + '\'' +
			", gender=" + gender +
			", dob=" + dob +
			", income=" + income +
			'}';
  }
  
  
}
