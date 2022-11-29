package exo1;

public class Rectangle {

	private double a;
	private double b;
	
	public Rectangle(double a,double b) {
		this.a = a;
		this.b = b;
	}
	
	public double surface() {
		return a*b;
	}
}
