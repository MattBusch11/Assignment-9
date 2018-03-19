import java.util.GregorianCalendar;
import java.util.Calendar;
public class Assignment9 {
	public static void main(String [] args) {
		GregorianCalendar currentDate = new GregorianCalendar();
		int day = currentDate.get(Calendar.DAY_OF_MONTH);
		int month = currentDate.get(Calendar.MONTH)+1;
		int year = currentDate.get(Calendar.YEAR);
		System.out.println("Current date is " + month + "/" + day + "/" + year);
		currentDate.setTimeInMillis(1234567898765L);
		int day2 = currentDate.get(Calendar.DAY_OF_MONTH);
		int month2 = currentDate.get(Calendar.MONTH)+1;
		int year2 = currentDate.get(Calendar.YEAR);
		System.out.println(month2 + "/" + day2 + "/" + year2);
		//System.out.println(currentDate.setTimeInMillis(1234567898765L));
	}
}
