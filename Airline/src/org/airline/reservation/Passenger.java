/* Passenger.java
 * Written by Anudeep Nayakoti
 * We have created a contructor, and also declared field as name for Passengers
 * 
 */
package org.airline.reservation;

public class Passenger {
	
 //Creating the fields
	private String name;//This is an in-line comment
	
	//Lets create a constructor
	public Passenger() {
		name="Not known Yet!";
		//Names are given while create new object or new passenger to give different name.
		//System.out.println(name);
	}
	
	
	// Creating Multiple Constructors
	//In this Constructor we are passing arguments directly.
	
	//*************Second Constructor********************
	public Passenger(String name) {
		setName(name);
		
	}
	
	
	
	
	
//Working with Getter now 
	public String getterName() {
		return name; //The main purpose of Getter functionality is to get the value of 'name' field
		
		
	}
	
 // If we want to Manipulate the name value, we use Setter
	
	public void setName(String newName)
	{
		name=newName;
		//Now the 'New string name values will be updated to the 'name' field value
		//We use Void because it doesn't return the value
	}
	
	//Here I am about to create Tostring 
	public String toString() {
		return "Passenger"+this.getterName();
	}

}
