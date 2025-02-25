package in.vikas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {

	public static void main(String[] args) throws Exception {

		Date d = new Date();
		System.out.println(d);

		// for dd/mm/yyyy format (Indian)
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyy");// Converting date to String
		String format1 = sdf1.format(d);
		System.out.println(format1);

		// =>dd/mm/yyyy => 12(number of month)
		// =>dd/mmm/yyyy => Dec(short name of month)
		// =>dd/mmmm/yyyy => December(full name of month)
		// =>dd/mmmm/yy => 25(short year of year)

		// for dd/mm/yyyy format (US)
		SimpleDateFormat sdf2 = new SimpleDateFormat("mm/dd/yyy");
		String format2 = sdf2.format(d);
		System.out.println(format2);
		
		//converting String to date
		SimpleDateFormat sdf3=new SimpleDateFormat();
		Date parseDate = sdf2.parse(format2);
		
		System.out.println(parseDate);
	}

}
