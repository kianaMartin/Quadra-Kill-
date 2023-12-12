package QuadraKill;

import java.util.Scanner;

public class RunQuad {
	public static void main (String[]args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Presss R for Rectangle  or S for Square. ");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("R")){
			Rectangle r = new Rectangle();
			System.out.println("A Rectangle: ");
			r.showDescription();
		} else if (choice.equalsIgnoreCase("S")){
			Square s = new Square();
			System.out.println("A Square: ");
			s.showDescription();
		}
		
	}
}