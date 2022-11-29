package exo4;

public class Complex {

	int r1;
	int i1;
	int r2;
	int i2;
	
	
	public Complex(int r1, int i1, int r2, int i2) {
		super();
		this.r1 = r1;
		this.i1 = i1;
		this.r2 = r2;
		this.i2 = i2;
	}
	
	public String calcule() {
		return (this.r1+this.r2)+" "+"+"+" "+(this.i1+this.i2)+"i";
	}
	
	
	
}
