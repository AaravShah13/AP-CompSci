/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your character name");
		String name = sc.nextLine();
		System.out.println("What is your character title");
		String title = sc.nextLine();
		System.out.println("Do you want to be a Wizard, Warrior or a Rogue");
		String role = sc.nextLine();
		if(role.equals("Wizard") || role.equals("wizard"))
		{
			System.out.println("You want to be a Wizard");
		}	
		else if(role.equals("Warrior") || role.equals("warrior"))
		{
			System.out.println("You want to be a Warrior");
		}
		else if(role.equals("Rogue") || role.equals("rogue"))
		{
			System.out.println("You want to be a Rogue");
		}
		else
		{
			System.out.println("Not matching any role");
		}
		int points = 20;
		System.out.println("Choose a trait: Strength, Dexterity, Intelligence, Charisma");
		System.out.println("Each of the traits cost 10 points each, You have 20 points");
		String trait1 = sc.nextLine();
		points = points-10;
		System.out.println("You have " + points + " points left.");
		System.out.println("Do you want another trait");
		String question = sc.nextLine();
		if(question.equals("Yes") || question.equals("yes"))
		{
			System.out.println("Choose another trait");
			String trait2 = sc.nextLine();
			points = points - 10;
			System.out.println("You have " + points + " points left");
			System.out.println("You have no more points left");
			System.out.println("Your name is " + name + ".");
			System.out.println("Your title is " + title + ".");
			System.out.println("Your role is " + role + ".");
			System.out.println("Your trait is " + trait1 + ".");
			System.out.println("Your second trait is " + trait2 + ".");
		}
		else if(question.equals("No") || question.equals("no"))
		{
			System.out.println("Your name is " + name + ".");
			System.out.println("Your title is " + title + ".");
			System.out.println("Your role is " + role + ".");
			System.out.println("Your trait is " + trait1 + "."); 
		}
	}
}
