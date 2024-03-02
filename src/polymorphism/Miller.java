/**
 * File name: Miller.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 4
 * Date: 2023-10-11
 * Professor: Sandra Iroakazi
 * Purpose: a miller has a name and a method for computing the bi-weekly pay.
 */
package polymorphism;

/**
 * This class is named Miller Class. 
 * It is the supper class of Consultant and Employee class.
 * It has the behavior biWeeklyPay() to be override by its sub-classes
 * 
 * @author Liying Guo
 * @version 1.0
 * @since 2023-11-03
 */
public class Miller
{
	protected static final int UP_THRESHOULD_WORKHOUR = 76;
	private String name;
	
	/**
	 * Default Constructor to Construct a miller with an empty name.
	*/
	public Miller()
	{
		name = "";
	}
	
	/**
	 * Constructs an miller with a given name
	 * @param name the name of this miller
	 */
	public Miller(String name) {
		this.name= name;
	}

	/**
	 * @param millerName the new name of the miller 
	*/
	public void setName(String millerName)
	{
	   name= millerName;
	}
	
	/**
	 * Gets the name of this miller.
	 * @return the name of miller
	*/
	public String getName()
	{
	   return name; 
	}
	
	/**
	 * This portion of code computes the bi-weekly pay of work done by the miller.
	 * Since the wage is unknown, it will return 0 and the function is to be override
	 * @param hoursWorked the number of hours worked bi-weekly
	 * @return the pay for the given number of hours
	*/
	public double biWeeklyPay(int hoursWorked)
	{
	   return 0; 
	}
}

