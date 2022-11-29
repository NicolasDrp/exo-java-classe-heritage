package exo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un nombre");
		int n1=scan.nextInt();
		System.out.println("entrez un nombre");
		int n2=scan.nextInt();
		Somme somme = new Somme(n1, n2);
		System.out.println(somme.sum());
		
		
		scan.close();
	}

}
