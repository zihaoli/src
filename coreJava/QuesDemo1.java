package coreJava;


public class QuesDemo1 {

	public static void main(String[] args) {
		Question q1 =new Question(1,"�����Ӱ�ǣ�",new String[] {"A.ʧ��","B.����"});
		System.out.print(q1);
		System.out.println(q1.check("a"));
		System.out.println();
		SingleQuestion q2 = new SingleQuestion(1, "�����ǿ������Ե���",new String[]{"A.java","B.tt"},"A");
		System.out.print(q2.toString());
		System.out.println(q2.check("B"));
	}

}
