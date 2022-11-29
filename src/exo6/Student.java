package exo6;

public class Student extends Person{

	
	
	public Student(String nom, String prenom) {
		super(nom, prenom);
		
	}

	public void DisplayAge() {
		System.out.println("J'ai "+getAge()+"ans");
	}
	
	public void GoToClasses(){
		System.out.println("Je vais en cours");
	}
	
}
