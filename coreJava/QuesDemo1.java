package coreJava;

import java.util.Arrays;

public class QuesDemo1 {

	public static void main(String[] args) {
		
		//System.out.println(Arrays.toString(new String[]{"a","b","c"}));
		SingleQuestion q1 = new SingleQuestion(1, "爱情电影是：", new String[] { "A.失落", "B.风雨", "C.权利" }, "A");
		System.out.print(q1);
		System.out.println(q1.check(new String[] { "A" }));
		System.out.println();
		SingleQuestion q2 = new SingleQuestion(1, "下面是开发语言的是", new String[] { "A.java", "B.tt" }, "A");
		System.out.print(q2);
		System.out.println(q2.check(new String[] { "B" }));
		System.out.println("---------------------------------------------------------");
		Question qs[] = new Question[2];
		qs[0] = q1;
		MutilQuestion q3 = new MutilQuestion(3, "下面是陈奕迅的歌曲：", new String[] { "A.好久不见", "B.十年", "C.拜拜" },
				new String[] { "A", "B" });
		qs[1] = q3;
		System.out.println(qs[0].toString());
		System.out.println(q1.getAnswer());
		
		System.out.println(qs[0].check(new String[] { "A" }));
		System.out.println();
		System.out.println(qs[1].toString());
		System.out.println(Arrays.toString(q3.getAnswers()));
		System.out.println(qs[1].check(new String[] { "A", "B" }));

	}

}
