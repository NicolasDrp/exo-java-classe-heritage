package exo7;

public class Person extends House{

	public Person(int surface) {
		super(surface);
	}


	private String nom;
	
	
	public void Display() {
		System.out.println(nom+getSurface()+GetDoor());
	}
	
}
