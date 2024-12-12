/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me one integer");
		int num1 = sc.nextInt();
		System.out.println("Give me another integer");
		int num2 = sc.nextInt();
		if(num1 % 2 == 0)
		{
			System.out.println(num1 + " is even");
		}
		else
		{
			System.out.println(num1 + " is odd");
		}
		
		if(num2 % 2 == 0)
		{
			System.out.println(num2 + " is even");
		}
		else
		{
			System.out.println(num2 + " is odd");
		}
		
		if(num1 )
		{
			System.out.println(num1 + " is divisible by 3.");
		}
	}
}
