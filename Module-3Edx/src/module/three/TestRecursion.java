package module.three;

import java.util.Scanner;

public class TestRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//lets ask the user to let him ask the computer to calculate a factorial which he chooses.
		
		Scanner console=new Scanner(System.in);
		System.out.println("Please enter the factorial you want JAVA to calculate:");
		int n=console.nextInt();//The user input value is stored in 'n' variable.
		
		System.out.println("The factorial of "+n +" is : "+factorial(n));
		
		
		
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		
		//Check condition of the base
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);//Here is the Inner method that acts as a Recursive method
		
	}

}
