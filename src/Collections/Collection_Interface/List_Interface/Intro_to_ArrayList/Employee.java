package Collections.Collection_Interface.List_Interface.Intro_to_ArrayList;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
  
  private long empId;
  private String empName;
  private String Address;
  private LocalDate localDate;
  
  public Employee() {
  }
  
  public Employee(long empId, String empName, String address, LocalDate localDate) {
	this.empId = empId;
	this.empName = empName;
	Address = address;
	this.localDate = localDate;
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
  
  public String getAddress() {
	return Address;
  }
  
  public void setAddress(String address) {
	Address = address;
  }
  
  public LocalDate getLocalDate() {
	return localDate;
  }
  
  public void setLocalDate(LocalDate localDate) {
	this.localDate = localDate;
  }
  
  @Override
  public String toString() {
	return "Employee{" +
			"empId=" + empId +
			", empName='" + empName + '\'' +
			", Address='" + Address + '\'' +
			", localDate=" + localDate +
			'}';
  }
  
  @Override
  public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof Employee)) return false;
	Employee employee = (Employee) o;
	return getEmpId() == employee.getEmpId() &&
			Objects.equals(getEmpName(), employee.getEmpName()) &&
			Objects.equals(getAddress(), employee.getAddress()) &&
			Objects.equals(getLocalDate(), employee.getLocalDate());
  }
  
  @Override
  public int hashCode() {
	return Objects.hash(getEmpId(), getEmpName(), getAddress(), getLocalDate());
  }
}
