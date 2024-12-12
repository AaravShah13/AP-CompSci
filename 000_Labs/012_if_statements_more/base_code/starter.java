import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Give me one number");
	    int num1 = sc.nextInt();
	    System.out.println("Give me another number");
	    int num2 = sc.nextInt();
	    boolean compare1 = (num1 == num2);
	    if(compare1)
	    {
	        System.out.println("The numbers are equal");
	    }
	    boolean compare2 = (num1 != num2);
	    if(compare2)
	    {
	        System.out.println("The numbers are not equal");
	    }
	}
}