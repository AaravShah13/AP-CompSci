/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		int targetNumber = (int)(Math.random() * 10 + 1);
		int totalDuplicates = 0;
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == targetNumber)
			{
				totalDuplicates++;
				System.out.println("Indexes of Duplicates: " + i);
				System.out.println("Number of Duplicates: " + totalDuplicates);
			}
		}
		
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] == arr[i-1])
			{
				System.out.println("Indexes: " + (i-1) + " and " + i);
				System.out.println("The number that was consective is: " + arr[i]);
			}
			
		}
	}
}
