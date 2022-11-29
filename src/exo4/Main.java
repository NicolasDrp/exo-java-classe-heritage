package exo4;

public class Main {

	public static void main(String[] args) {

		int r1 = 4;
		int r2= 3;
		int i1 = 7;
		int i2 = 2;
		
		Complex somme = new Complex(r1, i1, r2, i2);
		System.out.println(somme.calcule());	
		
	}

}
