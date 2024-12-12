/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
 
        Greetings("Aarav");
        
        double num = raise(6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        num = raise(num + 6000,6);
        System.out.println(num);
	}
	public static double raise(double salary, int percent)
	{
	    double newSalary = salary + (salary * (percent/100.0));
	    return newSalary;
	}
	
	public static void Greetings(String name)
	{
	    System.out.println("Hello, " + name);
	}
	
	public static void printAnimal()
	{
	    System.out.println("  /~\\");
	    System.out.println(" C oo");
	    System.out.println(" _( ^)");
	    System.out.println("/   ~\\");
	    return;
	}
}