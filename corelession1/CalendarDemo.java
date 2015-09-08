package corelession1;

import java.util.Calendar;
import java.util.Date;


public class CalendarDemo {
	/**
	 * @deprecated Use {@link Test1#main(String[])} instead
	 */
	public static void main(String[] args) {
		Test1.main(args);
		test2();
		
	}
	private static void test2(){
		String s = "1998-10-10";
		Date date = DateDemo.stringtoDate(s);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
	}

}
