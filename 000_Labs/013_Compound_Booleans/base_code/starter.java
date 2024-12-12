/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Give me one number");
	    int num3 = sc.nextInt();
	    System.out.println("Give me another number");
	    int num4 = sc.nextInt();
	    System.out.println("Give me another number");
	    int num5 = sc.nextInt();
	    boolean compare3 = (num3 > num4 && num3 > num5);
	    if(compare3)
	    {
	        System.out.println("The largest number is " + num3 + ".");
	    }
	    boolean compare4 = (num4 > num3 && num4 > num5);
	    if(compare4)
	    {
	        System.out.println("The largest number is " + num4 + ".");
	    }
	    boolean compare5 = (num5 > num3 &&  num5 > num4);
	    if(compare5)
	    {
	        System.out.println("The largest number is " + num5 + ".");
	    }
	    boolean compare6 = (num3 < num4 &&  num3 < num5);
	    if(compare6)
	    {
	        System.out.println("The smallest number is " + num3 + ".");
	    }
	    boolean compare7 = (num4 < num3 && num4 < num5);
	    if(compare7)
	    {
	        System.out.println("The smallest number is " + num4 + ".");
	    }
	    boolean compare8 = (num5 < num3 && num5 < num4);
	    if(compare8)
	    {
	        System.out.println("The smallest number is " + num5 + ".");
	    }
	}
}