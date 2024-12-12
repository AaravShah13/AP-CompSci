/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int [] arr2 = new int[1001];
		 int count = 3;
		 
		 for(int i = 0; i < arr1.length; i++)
		 {
		 	
		 	arr1[i] = count;
		 	count += 3;
		 	System.out.println(arr1[i]);
		 	
		 }
		 System.out.println("--------------------------");
		 int count2 = 1000;
		 for(int i = 0; i < arr2.length; i++)
		 {
		 	arr2[i] = count2;
		 	count2--;
		 	System.out.println(arr2[i]);
		 }
	}
}
