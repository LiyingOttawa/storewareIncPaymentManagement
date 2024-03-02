/**
 * File name: MillerTest.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 4
 * Date: 2023-10-11
 * Professor: Sandra Iroakazi
 * Purpose: MillerTest is to test on the Polymorphism on Miller
 */
package polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
   This class is called the MillerTest Class and provides the main method for your program.
   This program shows polymorphism by applying a method to objects of different classes. 
   Note that in your program, the Users should be prompted to input hours done worked by each miller. 
   The implement is using an array. 
   The order of the workers in the output is Consultants, Employees and Supervisors.
   Use the names in the output sample file provided for you. 
   Assume an annual pay, for example $84,000 and $30 as a Supervisor's bonus.
   The program also provides the possibility for users of this system to enter more millers.
*/
public class MillerTest
{
	private static final int EMPLOYEE_ANNUALPAY = 84000;
	private static final int SUPERVISOR_BONUS = 30;
	private static final int CONSULTANT_WAGE = 50;

	/**
	 * This is the entry point for the application, it instantiates one 3-element array
	 * each element reference to one instance of miller's subtype 
	 * User will be asked to input hours-worked for each miller
	 * and print name and bi-weekly pay to console
	 * @param args Command line arguments are not used by this program.
	 */
   public static void main(String[] args)
   {
	   int index = 0;
	   Scanner input= new Scanner(System.in);
	   //array reference type variable declaration and initialization
	   List<Miller> millers = new ArrayList<Miller>();
	   
	   //instantiate Consultant and referenced by array element
	   millers.add(new Consultant("Abby, Obi", CONSULTANT_WAGE));
	   //as user input with console message
	   System.out.printf("Enter the hours done by %s:",millers.get(index).getName());
	   //get user input as worked hours, assume user will only input integer
	   int hoursWorkedConsultant =  input.nextInt();
	   //print the name and weekly pay
	   System.out.printf("%s should pay: %.2f%n", millers.get(index).getName(),millers.get(index).biWeeklyPay(hoursWorkedConsultant));
	   index++;
	   
	   //instantiate Employee and referenced by array element
	   millers.add(new Employee("Andrew, Goodman", EMPLOYEE_ANNUALPAY));
	   //as user input with console message
	   System.out.printf("Enter the hours done by %s:",millers.get(index).getName());
	   //get user input as worked hours, assume user will only input integer
	   int hoursWorkedEmplyee =  input.nextInt();
	   //print the name and weekly pay
	   System.out.printf("%s should pay: %.2f%n", millers.get(index).getName(),millers.get(index).biWeeklyPay(hoursWorkedEmplyee));
	   index++;
	   
	   //instantiate Supervisor and referenced by array element
	   millers.add(new Supervisor("Gloria, Myers", EMPLOYEE_ANNUALPAY,SUPERVISOR_BONUS));
	   //as user input with console message
	   System.out.printf("Enter the hours done by %s:", millers.get(index).getName());
	   //get user input as worked hours, assume user will only input integer
	   int hoursWorkedSupervisor =  input.nextInt();
	   //print the name and weekly pay
	   System.out.printf("%s should pay: %.2f%n", millers.get(index).getName(),millers.get(index).biWeeklyPay(hoursWorkedSupervisor));
	   
	   
	   //The following code is to provide the possibility for users of this system to enter more millers.
	   boolean hasMore=false;
	   do {
		   System.out.println("Do you want to enter more miller(y/n):");
		   String yOrN =  input.next();//assume user will only enter y/n
		   hasMore = "y".equalsIgnoreCase(yOrN);
		   if(hasMore)
		   {
			   System.out.println("""
			   		Please select the title of the miller:
			   		1. consultant
			   		2. employee
			   		3. supervisor
			   		""");
			   int titleSelection =  input.nextInt();//assume user will only input 1 or 2 or 3
			   System.out.println("Please enter the miller's name:");
			   String millerName = input.nextLine();
			   
			   System.out.printf("Enter the hours done by %s:", millerName);
			   //get user input as worked hours, assume user will only input integer
			   int hoursNewMiller =  input.nextInt();
			   
			   //Instantiate and add new miller to array list based on it is title
			   switch(titleSelection)
			   {
				   	case 1:
				   		millers.add(new Consultant(millerName, CONSULTANT_WAGE));
					   break;
				   	case 2:
				   		millers.add(new Employee(millerName, EMPLOYEE_ANNUALPAY));
					   break;
				   	case 3:
				   		millers.add(new Supervisor(millerName, EMPLOYEE_ANNUALPAY,SUPERVISOR_BONUS));
					   break;
			   }
			   
			   //print the name and bi-weely pay to screen
			   System.out.printf("%s should pay: %.2f%n", millerName, millers.get(index).biWeeklyPay(hoursNewMiller));
			   index++;
		   }
	   }while(hasMore);
   }
}

