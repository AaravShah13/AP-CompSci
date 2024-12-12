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
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();	
		System.out.println("Give me a persons full name with a space in between");
		String name = sc.nextLine();
		String thesubstring = "";
		String[] FullName = new String[name.length()];
		for(int i = 0; i < name.length(); i++)
		{
			thesubstring = name.substring(i,i+1);
			FullName[i] = thesubstring;
		}
		for(int z = 0; z < FullName.length; z++){
			if(FullName[z].equals(" ")){
				String thenewsubstring = name.substring(z+1,name.length());
				System.out.println(thenewsubstring);
			}
		}
		

		
	}
}
