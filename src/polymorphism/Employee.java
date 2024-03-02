/**
 * File name: Employee.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 4
 * Date: 2023-10-11
 * Professor: Sandra Iroakazi
 * Purpose: A Employee is a miller who is paid the same (particular) amount regardless of the hours (additional) the employee worked.
 */
package polymorphism;

/**
 * This class is named Employee Class. 
 * It is the subclass of Miller class.
 * It inheritances properties and behavior from it super class.
 * It override the behavior biWeeklyPay()
 * 
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-03
 */
public class Employee extends Miller{	
	private double annualPay;
	
	/**
	 * Constructs an employee with a given name and an annual pay
	 * @param name the name of this employee
	 * @param pay the annual pay of the employee
	 */
	public Employee(String name, double pay)
	{
	   setName(name);
	   annualPay = pay;
	}
	
	/**
	 * Returns the annual pay of employee.
	 * 
	 * @return the annual pay of employee.
	 */
	public double getAnnualPay() {
		return annualPay;
	}

	/**
	 * set the annual pay of employee.
	 * 
	 * @param annualPay the annualPay of employee
	 */
	public void setAnnualPay(double annualPay) {
		this.annualPay = annualPay;
	}
	
	/**
	 * computes the pay for this category of miller.
	 * 
	 * @param hoursWorked the hoursWorked of employee
	 */
	@Override
	public double biWeeklyPay(int hoursWorked)
	{
		//An employee is paid the same (particular) amount 
		//regardless of the hours (additional) the employee worked
	   return annualPay/26; 
	}
}


