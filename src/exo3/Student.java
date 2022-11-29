package exo3;

public class Student {

	private String nom;
	private double note1;
	private double note2;
	
	
	public Student(String nom, double note1, double note2) {
		super();
		this.nom = nom;
		this.note1 = note1;
		this.note2 = note2;
	}
	
	public double calc_moy() {
		return (note1+note2)/2;
	}
	
	public String show() {
		return nom+" "+calc_moy();
	}
	
	
	
	
}
