package coreJava;

/**
 * @author li
 *
 */
public class Person {
	private int age;
	private String name;
	private double w,h;
	public Person(int age, String name, double w, double h) {
		super();
		this.age = age;
		this.name = name;
		this.w = w;
		this.h = h;
	}
	public Person() {
		
	}
	
	public void walk(Person p){
		System.out.println(this.name+" zoulu");
	}
	
}
