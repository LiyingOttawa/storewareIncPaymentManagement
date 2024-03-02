/**
 * File name: Supervisor.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 4
 * Date: 2023-10-11
 * Professor: Sandra Iroakazi
 * Purpose: a Supervisor has bonus to add in computing the bi-weekly pay.
 */
package polymorphism;

/**
 * This class is named Supervisor Class. 
 * It is the subclass of Employee class. 
 * A Supervisor is an employee who also receives a bonus.
 * It inheritances properties and behavior from it super class.
 * It override the behavior biWeeklyPay()
 * 
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-03
 */
public class Supervisor extends Employee{
	/**
	 * bonus the bonus will be added to bi-weekly salary
	 */
	private double bonus;

	/**
	 * Constructs a supervisor with a given name, annual pay and bi-weekly bonus.
	 * 
	 * @param name  the name of this employee
	 * @param pay   the annual pay
	 * @param bonus the bi-weekly bonus
	 */
	public Supervisor(String name, double pay,double bonus) {
		super(name, pay);
		this.bonus = bonus;
	}
	
	/**
	 * computes the bi-weekly pay for Supervisor.
	 * A bonus will be added to base bi-week salary
	 * 
	 * @param hoursWorked the hoursWorked of employee
	 */
	@Override
	public double biWeeklyPay(int hoursWorked)
	{		
	    return super.biWeeklyPay(hoursWorked)+bonus; 
	}
}


