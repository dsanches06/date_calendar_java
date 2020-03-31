package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarProgram {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d));
		System.out.println("\n----------- CALENDAR ADD HOUR, MINUTES OR SECONDS --------------------");
		// usar calendario
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		System.out.println("\n----------- CALENDAR GET HOUR, MINUTES OR SECONDS --------------------");
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);

		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

		System.out.println("\n----------- CALENDAR TIME OF SYSTEMS --------------------");
		Calendar calendar = Calendar.getInstance();
		String time = sdf.format(calendar.getTime());
		System.out.println(time);

		System.out.println("\n----------- DATE TO CALENDAR TO STRING --------------------");
		System.out.println(dateToString());
	}

	public static String dateToString() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		// dd/MM/yyyy
		return String.format("%02d", calendar.get(Calendar.DAY_OF_MONTH)) + "/"
				+ String.format("%02d", (1 + calendar.get(Calendar.MONTH))) + "/" + calendar.get(Calendar.YEAR);
	}

}
