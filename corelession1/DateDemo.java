package corelession1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
	test1();
	
	}
	public static void test1(){
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());
	
		System.out.println(	formatDate(date));
		
		String s = "2015-10-11";
		System.out.println(stringtoDate(s));
		
		//java.util.Calendar
	}
	public static String formatDate(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd:HH:mm:ss");
		return sdf.format(date);
	}
	public static Date stringtoDate(String s){
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		try {
			return sdf.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
