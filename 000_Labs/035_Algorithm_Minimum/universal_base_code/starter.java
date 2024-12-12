/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int arraySize = (int)(Math.random() * 150 + 51);
		int [] arr = new int[arraySize];
		int randomNumber = (int)(Math.random() * 100 + 1);
		int min = arr.length;
		int max = arr[0];
		int sum = 0;
		System.out.println("The amount of elements is: " + arraySize);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = randomNumber;
			randomNumber = (int)(Math.random() * 100 + 1);
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Minimum: " + min);
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum: " + max);
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		int avg = sum/arr.length;
		System.out.println("Average: " + avg);
	}
}
