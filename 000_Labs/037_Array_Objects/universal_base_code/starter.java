/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] warrior = new Warrior[100];
		Wizard[] wizard = new Wizard[100];
		for(int i = 0; i < warrior.length; i++)
		{
			warrior[i] = new Warrior();
		}
		for(int i = 0; i < wizard.length; i++)
		{
			wizard[i] = new Wizard();
		}
		
		for(int i = 0; i < 100; i++)
		{
			wizard[i].attack(warrior[i]);
			if(warrior[i].isDead() == true)
			{
				warrior[i+1].attack(wizard[i]);
				if(wizard[i].isDead() == true)
				{
					wizard[i+1].attack(warrior[i+1]);
				}
				else
				{
					wizard[i].attack(warrior[i+1]);
				}
			}
			else
			{
				warrior[i].attack(wizard[i]);
				if(wizard[i].isDead() == true)
				{
					wizard[i+1].attack(warrior[i]);
				}
				else
				{
					wizard[i].attack(warrior[i]);
				}
			}
		}
	}
}
