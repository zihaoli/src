package corelession1;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		//Calendar�ǳ����࣬��ȡ������������������Ķ���
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		
	}

}
