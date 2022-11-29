package exo7;

public class Door extends House {

	public Door(int surface) {
		super(surface);
	}

	private String color;
	
	public void Display() {
		System.out.println("Je suis une porte, ma couleur est "+color);
		
		
	}
	
	
	
	

	/**
	 * @return the color
	 */
	public final String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public final void setColor(String color) {
		this.color = color;
	}
	
	
}
