package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	public Spiderman()
	{
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	public Spiderman(String actor)
	{
		this.actor = actor;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int age)
	{
		actor = "unknown";
		this.age = age;
		villain = "unknown";
	}
	public Spiderman(String actor, int age)
	{
		this.actor = actor;
		this.age = age;
		villain = "unknown";
	}
	public Spiderman(String actor, int age, String villain)
	{
		this.actor = actor;
		this.age = age;
		this.villain = villain;
	}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	public void setvillain(String villain)
	{
		this.villain = villain;
	}
	public void setActor(String actor)
	{
		this.actor = actor;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getVillain()
	{
		return villain;
	}
	public String getActor()
	{
		return actor;
	}
	public int getAge()
	{
		return age;
	}
	
	
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
