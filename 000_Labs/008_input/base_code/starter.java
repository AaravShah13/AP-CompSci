import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter your name here: ");
	    String name = sc.nextLine();
	    System.out.println("Your name is " + name + ".");
	    System.out.println("Please enter your age here: ");
	    String age = sc.nextLine();
	    System.out.println("Your age is " + age + ".");
	    System.out.println("Please enter your birth month here: ");
	    String month = sc.nextLine();
	    System.out.println("Your birth month is " + month + ".");
	    System.out.println("Please enter your birthday day here");
	    String day = sc.nextLine();
	    System.out.println("Your birthday day is " + day + ".");
	    System.out.println("Please enter your birthday year here");
	    String year = sc.nextLine();
	    System.out.println("You were born in " + year + ".");
	    System.out.println("How much is a buck 50");
	    String price = sc.nextLine();
	    System.out.println("A buck fifty is " + price + ".");
	}
}