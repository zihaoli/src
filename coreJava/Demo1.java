package coreJava;

public class Demo1 {

	

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person(28,"zhangsan",90,180);
		
		p2.walk(p2);
		A a = new A();
		A a1= new A();
		
		System.out.println(a.equals(a1));
		

	}

}
class A {
	int i;
}
