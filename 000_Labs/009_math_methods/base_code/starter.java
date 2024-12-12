import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    int max = Math.max(13 - 6 * 11,30 % 7 * (-2)); 
	    System.out.println(max);
	    double sqrt = Math.sqrt(3 * 8 + 31 % 7);
	    System.out.println(sqrt);
	    double pow = Math.pow(37/3,35%21);
	    System.out.println(pow);
	    double maxPow = Math.max(Math.pow(2,14%3),Math.sqrt(2*6));
	    System.out.println(maxPow);
	    System.out.println("Give me a double value");
	    Double double1 = sc.nextDouble();
	    System.out.println("give me another double value");
	    Double double2 = sc.nextDouble();
	    double max2 = Math.max(double1,double2);
	    System.out.println(max2);
	    double sqrt2 = Math.sqrt(double2);
	    System.out.println(sqrt2);
	    double pow2 = Math.pow(double1,double2);
	    System.out.println(pow2);
	}
}