package coreJava;

public class Demo16 {

	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		Student s = new Student();
		final double x= 10;//在内部类中访问局部变量，该变量必须声明为final
		final double y=20;//在内部类中访问局部变量，该变量必须声明为final
		s.drawShape(new Shape1(x,y){//在内部类中访问局部变量，该变量必须声明为final
			public void draw() {
				System.out.println("student正在画,位置是:"+x+","+y);
			}
		});
		System.out.println("=====================");
		s.getOneShape(80, 2).draw();
	
	}

}
class Student{
	public void drawShape(Shape1 shape){
		shape.draw();
	}
	public Shape1 getOneShape(final double x,final double y){
		return new Shape1(x,y){
			public void draw() {
				System.out.println("student正在画,位置是:"+x+","+y);
			}
		};
	}
	
}


abstract class Shape1{
	private Point location;
	public Shape1(Point location){
		this.location=location;
	}
	public Shape1(double x,double y){
		this(new Point(x,y));
	}
	public abstract void draw();
}
