package OOP.encapsulation;

public class EmpCount {
  
  private int empId;
  private int empAge;
  private String empFirstName;
  private String empLastName;
  
  public int getEmpId() {
	return empId;
  }
  
  public void setEmpId(int empId) {
	this.empId = empId;
  }
  
  public int getEmpAge() {
	return empAge;
  }
  
  public void setEmpAge(int empAge) {
	this.empAge = empAge;
  }
  
  public String getEmpFirstName() {
	return empFirstName;
  }
  
  public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
  }
  
  public String getEmpLastName() {
	return empLastName;
  }
  
  public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
  }
  
  
  
  @Override
  public String toString() {
	return "EmpCount{" +
			"empId=" + empId +
			", empAge=" + empAge +
			", empFirstName='" + empFirstName + '\'' +
			", empLastName='" + empLastName + '\'' +
			'}';
  }
}
