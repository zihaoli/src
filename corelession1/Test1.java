package corelession1;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		//Calendar是抽象类，获取的是这个抽象类的子类的对象
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		
	}

}
