/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is it? (0-6)");
		int day = sc.nextInt();
		if(day > 0 && day < 5)
		{
			System.out.println("Its a weekday. Wake up its 7:00 Am!");
		}
		if(day == 0 || day == 5)
		{
			System.out.println("Its a weekend. Wake up its 10:00 Am!");
		}
	}
}
