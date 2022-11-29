package exo7;

public class House {

	private int surface;
	private Door door;

	public House(int surface) {
		this.surface = surface;
	}

	public void Display() {
		System.out.println("Je suis une maison de "+surface+" m2");
	}
	
	public Door GetDoor() {
		return door;
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 * @return the surface
	 */
	public final int getSurface() {
		return surface;
	}

	/**
	 * @param surface the surface to set
	 */
	public final void setSurface(int surface) {
		this.surface = surface;
	}
	
	
	
	
	
	
}
