package coreJava;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
	};

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void PrintLocation() {
		System.out.println("location is " + x + "," + y);
	}
	public double getDistance(){
		return Math.sqrt(x*x+y*y);
		}
	public double getDistance(Point p){
		return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
	}

}
