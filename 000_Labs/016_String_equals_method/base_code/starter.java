/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
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
	}
}
