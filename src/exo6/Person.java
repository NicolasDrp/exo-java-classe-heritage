package exo6;

public class Person {

	private String nom;
	private String prenom;
	private int age;
	
	
	public Person(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void sayHello() {
		System.out.println(prenom +" "+ nom +" vous dit salut");
	}


	/**
	 * @return the nom
	 */
	public final String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public final void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public final String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public final void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the age
	 */
	public final int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public final void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
