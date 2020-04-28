package foo.bar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarSample {

	//	日付操作の使い方
	public static Date createDate(int year, int month, int dayOfMonth){
		Calendar calendar = new GregorianCalendar();

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);

		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);

		return calendar.getTime();
	}

	public static void main(String[] arg) {
		Date date = createDate(2019,8,2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdf.format(date));

		SimpleDateFormat sdf1 = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        System.out.println(sdf1.format(date));
	}
}
