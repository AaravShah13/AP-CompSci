/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int number = power(9,7);
		System.out.println(number);
		
	}
	public static int power(int num, int power)
	{
		int count = 0;
		int powerNumber = num;
		while(count < power-1)
		{
			powerNumber = powerNumber * num;
			count++;
		}
		return powerNumber;
	}
}
