package exo5;

public class Point {

	private double x;
	private double y;
	
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}


	public double distance(Point p) {
		double px = this.getX()-p.getX();
		double py = this.getY()-p.getY();
		
		return Math.sqrt(px*px*py*py);
		
	}
	
	
	
	/**
	 * @return the x
	 */
	public final double getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public final void setX(double x) {
		this.x = x;
	}


	/**
	 * @return the y
	 */
	public final double getY() {
		return y;
	}


	/**
	 * @param y the y to set
	 */
	public final void setY(double y) {
		this.y = y;
	}
	
	
	
	
	
}
