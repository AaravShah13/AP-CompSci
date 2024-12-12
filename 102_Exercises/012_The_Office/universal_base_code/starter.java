/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee dwight = new Employee(1987,"Dwight","Schrule",4416.66);
		Employee jim = new Employee(2474,"Jim","Halpert",4416.66);
		Employee pam = new Employee(2011,"Pam","Beesly",2250);
		Employee jacob = new Employee(8492,"Jacob","Poole",2);
		dwight.raiseSalary(10);
		jim.raiseSalary(4);
		pam.raiseSalary(7);
		jacob.raiseSalary(1);
		dwight.employeeToString();
		System.out.println("Annual Salary: " + dwight.getAnnualSalary());
		jim.employeeToString();
		System.out.println("Annual Salary: " + jim.getAnnualSalary());
		pam.employeeToString();
		System.out.println("Annual Salary: " + pam.getAnnualSalary());
		jacob.employeeToString();
		System.out.println("Annual Salary: " + jacob.getAnnualSalary());
	}
}