package exo6;

public class Teacher extends Person {

	
	private String subject;

	public Teacher(String nom, String prenom) {
		super(nom, prenom);
	}

	
	
	
	
	
	public void Explain() {
		System.out.println("Le cours commence");
	}




	public String getSubject() {
		return subject;
	}




	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
