import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class WeekDates {
	
	WeekDates(){
		
	}
	
	public String[] getDates() {
		
		Calendar now = Calendar.getInstance();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM");

	    String[] days = new String[7];
	    int delta = -now.get(GregorianCalendar.DAY_OF_WEEK) + 2;
	    now.add(Calendar.DAY_OF_MONTH, delta );
	    for (int i = 0; i < 7; i++)
	    {
	        days[i] = format.format(now.getTime());
	        now.add(Calendar.DAY_OF_MONTH, 1);
	    }
		
		return days;
	}

}
