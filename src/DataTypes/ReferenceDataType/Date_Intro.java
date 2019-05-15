package DataTypes.ReferenceDataType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_Intro {
  
  
  public static void main(String[] args) throws ParseException {
  
	Date date = new Date();
 
	System.out.println(date);
	
	long time = date.getTime();
	System.out.println(time);
  
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	GregorianCalendar gregorianCalendar = new GregorianCalendar();
	
	Date d = dateFormat.parse("12/12/2018");
	
	gregorianCalendar.setTime(d);
 
 
	System.out.println("Input Date= " + dateFormat.format(d));
	
	int dayBefore = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
	gregorianCalendar.roll(Calendar.DAY_OF_YEAR, - 1);
 
	System.out.println(dayBefore);
	
  }
}
