/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int secretNumber = (int)(Math.random() * 1000);
		System.out.println("Guess a number between 0 and 1000");
		int guess = sc.nextInt();
		while(guess != secretNumber)
		{
			System.out.println("That is not right try again");
			System.out.println("Guess a number between 0 and 1000");
			guess = sc.nextInt();
		}
		System.out.println("you got it good job");
	}
}
