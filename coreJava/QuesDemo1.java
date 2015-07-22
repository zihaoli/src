package coreJava;

public class QuesDemo1 {

	public static void main(String[] args) {
		Question q1 = new SingleQuestion()(1, "爱情电影是：", new String[] { "A.失落", "B.风雨","C.权利" }null);
		System.out.print(q1);
		System.out.println(q1.check("a"));
		System.out.println();
		SingleQuestion q2 = new SingleQuestion(1, "下面是开发语言的是", new String[] {
				"A.java", "B.tt" }, "A");
		System.out.print(q2);
		System.out.println(q2.check("B"));
	}

}
