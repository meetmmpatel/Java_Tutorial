package DataTypes.ReferenceDataType;

public class RegEx_Intro {
  
  public static void main(String[] args) {
	
    String phone = "(111)-111-1111";
    
    String phoneNumber = "(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}";
  
	System.out.println(phone.matches(phoneNumber));
	
	String zipCode = "12345-1234";
	
	String zipCodePattern = "\\d{5}(-\\d{4})?";
	
	
	boolean zip = zipCode.matches(zipCodePattern);
	System.out.println(zip);
	
	String date = "12-12/2018";
 
	String datePattern = "\\d{1,2}-\\d{1,2}/\\d{4}";
	boolean dateName = date.matches(datePattern);
	System.out.println(dateName);
    
  }
  
  
}
