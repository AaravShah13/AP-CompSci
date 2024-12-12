import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    Random rand = new Random();
	    int random1 = rand.nextInt(1,1000);
	    System.out.println("Give me a number between 1 and 1000");
	    int guess = sc.nextInt();
	    while(guess != random1)
	    {
            if(guess == random1)
            {
                System.out.println("Correct");
            }
            else if(guess < random1)
            {
                System.out.println("Higher");
                guess = sc.nextInt();
            }
            else
            {
                System.out.println("Lower");
                guess = sc.nextInt();
            }
	    }
	}
}