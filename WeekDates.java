import java.text.SimpleDateFormat;
//import java.time.DayOfWeek;
//import java.time.LocalDate;
//import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class WeekDates {
	
	static Calendar calendar = Calendar.getInstance();
	static SimpleDateFormat format = new SimpleDateFormat("dd/MM");
	static String[] dates = new String[7];


	public  String[] getDates() {
		 Date refDate = new Date();
		 
		 calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		int firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
		 
		 calendar.setTime(refDate);
	        calendar.set(Calendar.DAY_OF_WEEK, firstDayOfWeek);
	        
	        for (int i = 0; i < 7; i++) {
	           
	            dates[i] = format.format(calendar.getTime());	            
	            calendar.add(Calendar.DAY_OF_MONTH, 1);            
	            
	}
	        return dates;

}
}

