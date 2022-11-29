package exo6;

public class Main {

	public static void main(String[] args) {
	
		Person jankev = new Person("Kévin", "Jean");
		jankev.sayHello();
		
		Student michel = new Student("Michel", "Lecon");
		michel.setAge(15);
		michel.sayHello();
		michel.GoToClasses();
		michel.DisplayAge();
		
		Teacher claude = new Teacher("Claude", "Dufroit");
		claude.setAge(40);
		claude.sayHello();
		claude.Explain();
		
	}

}
