package DataTypes.primitiveTypes;


import java.text.NumberFormat;

import java.util.Formatter;
import java.util.Locale;

public class NumberFormate_Intro {
  
  
  public static void main(String[] args) {
	
	NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMANY);
	
	System.out.println(numberFormat.getClass().getName());
	System.out.println(numberFormat.format(12345698));
	
	
	Formatter formatter = new Formatter();
	
	formatter.format("%1.3f", 1234567890.123456789);
	
	System.out.println(formatter);
	
	formatter.format("%4.6s", "abcdefghikfjsl");
	System.out.println("\n" + formatter);
	
	
	int numOne = 1500;
	
	String formateNumOne = String.format("%07d", numOne);
	
	System.out.println(formateNumOne);
	
  }
  
  
}
