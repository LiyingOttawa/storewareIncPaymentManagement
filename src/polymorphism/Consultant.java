/**
 * File name: Consultant.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 4
 * Date: 2023-10-11
 * Professor: Sandra Iroakazi
 * Purpose: A Consultant is a miller who is paid for every hour worked
 */
package polymorphism;


/**
 * This class is named Consultant Class. 
 * It is the subclass of Miller class.
 * It inheritances properties and behavior from it super class.
 * It override the behavior biWeeklyPay()
 * 
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-03
 */
public class Consultant extends Miller{	
	/**
	 * wage hourly
	 */
	private double consultantWage;
	
	/**
	   TO DO: TASK 2 - This portion of your code constructs an hourly paid consultant with a given name and biweekly wage.
	   @param name the name of this consultant
	   @param wage the consultant wage per hour 
	*/
	public Consultant(String name, double consultantWage)
	{
		super(name);
		this.consultantWage = consultantWage;
	}
	
	
	/**
	 * The consultant bi-weekly-pay will hours times wage plus an overtime pay if the Consultant works for more than 76 hours bi-weekly
	 * @param hoursWorked hours the consultant worked in two weeks
	 */
	@Override
	public double biWeeklyPay(int hoursWorked)
	{
	   double pay = hoursWorked * consultantWage;
	   if(hoursWorked>UP_THRESHOULD_WORKHOUR)
	   {
		   pay = pay + ((hoursWorked - 76) * 0.5) * consultantWage;
	   }
	   
	   return pay;
	}
}


